package MyPlanner;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class CSV implements Doc {

    @Override
    public void fileImport(Path path, Database db) {
        throw new UnsupportedOperationException("fileImport");
    }

    @Override
    public void fileExport(Database db) {
        throw new UnsupportedOperationException("fileExport");
    }
}
