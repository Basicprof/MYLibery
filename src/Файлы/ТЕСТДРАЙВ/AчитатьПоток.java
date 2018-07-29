package ТЕСТДРАЙВ;

import java.io.IOException;

public class AчитатьПоток {
    public static void main(String[] args) throws IOException {
        while (true){
            int bytein = System.in.read();
            System.out.print(bytein+" ");
        }
    }
}
