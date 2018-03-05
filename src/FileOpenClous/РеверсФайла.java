package FileOpenClous;
 import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
 public class РеверсФайла {
    public static void main(String[] args) throws IOException {
    FileInputStream src = new FileInputStream("text.txt");
    RandomAccessFile dst = new RandomAccessFile( "tet.txt","rw");
    int srcLength = src.available();
    int bufferSize = 8 * 1024;
    byte[] buffer = new byte[bufferSize];
    int writted = 0;
while (src.available() > 0) {
        if (src.available() < bufferSize) bufferSize = src.available();
        src.read(buffer, 0, bufferSize);
        reverse(buffer,bufferSize);
        writted += bufferSize;
        dst.seek(srcLength - writted);
        dst.write(buffer, 0, bufferSize);
    }
   src.close();
   dst.close();
}

    public static void  reverse(byte[] bytes, int size) {
        for (int i = 0; i < size / 2; i++) {
            byte c = bytes[i];
            bytes[i] = bytes[size - i - 1];
            bytes[size - i - 1] = c;
        }
    }

    public static void  reverse(byte[] bytes) {
        reverse(bytes, bytes.length);
    }
}
