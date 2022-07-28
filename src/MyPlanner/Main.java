package MyPlanner;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Database db = new Database();
        Path path = Path.of("D:\\GB\\Training\\JAVA-in-IDEA\\training\\src\\MyPlanner\\PlannerToImport.xml");

        Importer importPlanner = new Importer(path, db);
        importPlanner.FileImport();

        db.print(db);

    }
}
