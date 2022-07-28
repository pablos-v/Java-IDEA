package MyPlanner;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileExport<T extends Doc> {
    public StringBuilder sb;
    public Doc doc;

    public FileExport(T format) {
        sb = new StringBuilder();
        doc = format;
        doc.start(sb);
    }

    public void addItems(String... items) {
        for (String item : items) {
            doc.add(sb, item);
        }
    }

    @Override
    public String toString() {
        doc.end(sb);
        return sb.toString();
    }

    //    default void fImport(Path path, Database db) throws IOException {
//        List<String> list = Files.readAllLines(path);
//        db.add(list);
//    }

}
