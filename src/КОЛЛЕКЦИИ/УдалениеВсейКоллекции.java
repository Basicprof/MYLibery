package КОЛЛЕКЦИИ;

import java.util.ArrayList;
import java.util.List;

public class УдалениеВсейКоллекции {
    public static void main(String[] args) {
    List allLines = new ArrayList();
    List forRemoveLines = new ArrayList();
         if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();

        }
}
}
