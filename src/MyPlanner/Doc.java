package MyPlanner;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

interface Doc {


    void fileImport(Path path, Database db) throws IOException;

    void fileExport(Database db) throws IOException;
}
