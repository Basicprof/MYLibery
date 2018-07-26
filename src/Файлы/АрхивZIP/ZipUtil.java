import org.omg.CORBA.portable.InputStream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipUtil {
    public static void main(String[] args) throws Exception {
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream("archive.zip"));

        File file = new File("folder");

        doZip(file, out);

        out.close();
    }

    private static void doZip(File dir, ZipOutputStream out) throws IOException {
        for (File f : dir.listFiles()) {
            if (f.isDirectory())
                doZip(f, out);
            else {
                out.putNextEntry(new ZipEntry(f.getPath()));
                write(new FileInputStream(f), out);
            }
        }
    }

    private static void write(FileInputStream in, OutputStream out) throws IOException, IOException {
        byte[] buffer = new byte[1024];
        int len;
        while ((len = in.read(buffer)) >= 0)
            out.write(buffer, 0, len);
        in.close();
    }
}
