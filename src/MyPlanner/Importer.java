package MyPlanner;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.File;

public class Importer {
    Path path;
    Database db;

    public Importer(Path path, Database db) {
        this.path = path;
        this.db = db;
    }

    public void FileImport() throws IOException {
        if (Files.exists(path) && Files.isRegularFile(path)) {
            String ext = getFileExtension(path);
            switch (ext.toLowerCase()) {
                case ("xml") -> {
                    XML xml = new XML();
                    xml.fileImport(path, db);
                }
                case ("csv") -> {
                    CSV csv = new CSV();
                    csv.fileImport(path, db);
                }
                case ("json") -> {
                    JSON json = new JSON();
                    json.fileImport(path, db);
                }
                default -> System.out.println("File extension issue, try another file.");
            }
        }
    }


    private static String getFileExtension(Path path) {
        File file = new File(String.valueOf(path));
        String fileName = file.getName();
        // если в имени файла есть точка и она не является первым символом в названии файла
        if (fileName.contains(".") && fileName.lastIndexOf(".") != 0)
            // то вырезаем все знаки после последней точки в названии файла, то есть ХХХХХ.txt -> txt
            return fileName.substring(fileName.lastIndexOf(".") + 1);
            // в противном случае возвращаем заглушку
        else return "";
    }
}
