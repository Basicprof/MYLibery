package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory  implements ImageReader {
    public static ImageReader  getImageReader( ImageTypes imagEnum)throws IllegalArgumentException{
        if(imagEnum==ImageTypes.BMP)return new BmpReader();
        if(imagEnum==ImageTypes.JPG)return new JpgReader();
        if(imagEnum==ImageTypes.PNG)return new PngReader();
      throw new      IllegalArgumentException("Неизвестный тип картинки"); }


}
