package MyPlanner;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

interface FileImport {

    default void fImport(Path path, Database db) throws IOException {
        List<String> list = Files.readAllLines(path);
        db.add(list);
    }

}
