package УмныйПоискФайлов;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {
    private String partOfName = null;
    private String partOfContent = null;
    private int minSize = 0;
    private int maxSize = 0;
    private List <Path> foundFiles = new ArrayList<>();
    public List<Path> getFoundFiles() {
        return this.foundFiles;
    }


    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
    }

    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }


    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        byte[] content = Files.readAllBytes(file); // размер файла: content.length
        boolean contains = true; // Проверяем если параметр слово в имени файла установлен
       if(partOfName != null && !file.getFileName().toString().contains(partOfName))
           contains =false;
       String contentString = new String(content);
        if(partOfContent != null &&  !contentString.contains(partOfContent))
            contains =false;
        if(minSize >0 && content.length <= minSize)contains = false;
        if(maxSize >0 && content.length >= maxSize)contains = false;
        if(contains) foundFiles.add(file);
        return super.visitFile(file, attrs);
    }
}
