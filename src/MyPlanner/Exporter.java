package MyPlanner;

import java.io.IOException;

public class Exporter<T extends Doc> {
    public Doc doc;


    public Exporter(T format, Database db) throws IOException {
        doc = format;
        doc.fileExport(db);
    }


}
