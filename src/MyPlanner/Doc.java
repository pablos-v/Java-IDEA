package MyPlanner;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

interface Doc {
    void start(StringBuilder sb);

    void add(StringBuilder sb, String item);

    void end(StringBuilder sb);

    void fileImport(Path path, Database db) throws IOException;
}
