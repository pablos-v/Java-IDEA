package MyPlanner;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class XML implements Doc {

    @Override
    public void start(StringBuilder sb) {
        sb.append("<xml>\n");
    }

    @Override
    public void add(StringBuilder sb, String item) {
        sb.append("    <item>").append(item).append("</item>\n");
    }

    @Override
    public void end(StringBuilder sb) {
        sb.append("</xml>\n");
    }

    @Override
    public void fileImport(Path path, Database db) throws IOException {
        List<String> file = Files.readAllLines(path);
        int length = file.size();

        for (int i = 1; i < length - 1 ; i++) {
            String ls = file.get(i).strip();
            int begin = "<item>".length()+1;
            int end = ls.length() - "</item>".length();

            db.add(Arrays.stream(ls.substring(begin,end).split(",")).toList());
        }
    }
}
