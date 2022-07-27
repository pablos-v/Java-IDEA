package MyPlanner;

import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
//        Database db = new Database();
//        Path path = Path.of("D:/GB/Training/JAVA-in-IDEA/training/txtImport.txt");
        FileImport<XML> one = new FileImport<>(new XML());
        one.addItems("Void 1", "Void 2");
        one.addItems("Void 1", "Void 2");
        System.out.println(one);
    }
}
