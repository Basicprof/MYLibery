package NIO.ОбходДереваФайлов.ПоискСкрытыхФайлов;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

    public class FileVisitor extends SimpleFileVisitor<Path> { //FileVisitor интерфейс
        public static void main(String[] args) throws IOException {
            EnumSet<FileVisitOption> options = EnumSet.of(FileVisitOption.FOLLOW_LINKS);
            final FileVisitor fileVisitor = new FileVisitor();
            Files.walkFileTree(Paths.get("D:/"), options, 20, fileVisitor);

            List<String> result = fileVisitor.getArchived();
            System.out.println("All archived files:");
            for (String path : result) {
                System.out.println("\t" + path);
            }

            List<String> failed = fileVisitor.getFailed();
            System.out.println("All failed files:");
            for (String path : failed) {
                System.out.println("\t" + path);
            }
        }

        private List<String> archived = new ArrayList<>();
        private List<String> failed = new ArrayList<>();

        public List<String> getArchived() {
            return archived;
        }

        public List<String> getFailed() {
            return failed;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            if(file.toString().endsWith(".rar")||file.toString().endsWith(".zip")) {
                this.archived.add(file.toAbsolutePath().toString());
            }
            return super.visitFile(file, attrs);
        }

        @Override
        public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
            this.failed.add(file.toAbsolutePath().toString()); // добавляем все пути к недоступным файлам
            //и возвращаем незаходить в него
            return  FileVisitResult.SKIP_SUBTREE;
        }
    }

