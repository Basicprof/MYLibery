package ТЕСТДРАЙВ;

import org.omg.CORBA.portable.InputStream;

import java.io.IOException;
import java.io.InputStreamReader;

public class ОберткаВСимволы {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        while (true){
            int SymbolIn = inputStreamReader.read();
            System.out.print((char) SymbolIn+" ");
        }}}
