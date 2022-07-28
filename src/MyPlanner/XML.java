package MyPlanner;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class XML implements Doc {

    @Override
    public void fileImport(Path path, Database db) throws IOException {
        List<String> file = Files.readAllLines(path);
        int length = file.size();

        for (int i = 1; i < length - 1; i++) {
            String ls = file.get(i).strip();
            int begin = "<item>".length();
            int end = ls.length() - "</item>".length();

            db.add(Arrays.stream(ls.substring(begin, end).split(",")).toList());
        }
    }

    @Override
    public void fileExport(Database db) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedWriter writer = Files.newBufferedWriter(Paths.get("src\\MyPlanner\\export.xml"));
        writer.write("<xml>");
        writer.newLine();

        for (var entry : db.map.entrySet()) {
            writer.write(sb.append("    <item>").append(entry.getKey()).append(", ").append(entry.getValue()).append("</item>").toString());
            sb.setLength(0);
            writer.newLine();
        }

        writer.write("</xml>");
        writer.close();
    }
}
