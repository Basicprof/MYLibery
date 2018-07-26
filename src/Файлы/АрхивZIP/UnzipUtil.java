
 import java.io.*;
    import java.util.Enumeration;
    import java.util.zip.ZipEntry;
    import java.util.zip.ZipFile;

    public class UnzipUtil {
        public static void main(String[] args) {
            if (args.length != 1) {
                System.out.println("Usage: UnzipUtil [zipfile]");
                return;
            }

            File file = new File(args[0]);
            if (!file.exists() || !file.canRead()) {
                System.out.println("File cannot be read");
                return;
            }

            try {
                ZipFile zip = new ZipFile(args[0]);
                Enumeration entries = zip.entries();

                while (entries.hasMoreElements()) {
                    ZipEntry entry = (ZipEntry) entries.nextElement();
                    System.out.println(entry.getName());

                    if (entry.isDirectory()) {
                        new File(file.getParent(), entry.getName()).mkdirs();
                    } else {
                        write(zip.getInputStream(entry),
                                new BufferedOutputStream(new FileOutputStream(
                                        new File(file.getParent(), entry.getName()))));
                    }
                }

                zip.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private static void write(InputStream in, OutputStream out) throws IOException {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = in.read(buffer)) >= 0)
                out.write(buffer, 0, len);
            out.close();
            in.close();
        }
    }
