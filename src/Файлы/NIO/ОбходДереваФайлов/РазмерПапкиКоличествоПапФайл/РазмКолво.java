package NIO.ОбходДереваФайлов.РазмерПапкиКоличествоПапФайл;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.concurrent.atomic.AtomicInteger;

    public class РазмКолво extends SimpleFileVisitor<Path> {
        private static long longByte;
        private static AtomicInteger integerDirectory = new AtomicInteger();
        private static AtomicInteger integerFile = new AtomicInteger();
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            Path path = Paths.get(bufferedReader.readLine());
            if(!Files.isDirectory(path)){ //Проверяем является ли дерикторией
                System.out.println(path.toAbsolutePath()+" - не папка");return;
            }
            РазмКолво solution = new РазмКолво();
            Files.walkFileTree(path, solution);
            System.out.println("Всего папок - "+  integerDirectory.decrementAndGet());
            System.out.println("Всего файлов - "+ integerFile);
            System.out.println("Общий размер - "+ longByte);

        }

        @Override
        public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
            integerDirectory.getAndIncrement();   return super.postVisitDirectory(dir, exc);
        }



        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

            longByte +=attrs.size();
            integerFile.getAndIncrement();


            return super.visitFile(file, attrs);
        }

        @Override
        public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
            return super.visitFileFailed(file, exc);
        }
    }

