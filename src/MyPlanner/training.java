package MyPlanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class training {

        public static void main(String[] args) {
            StringBuilder sb = new StringBuilder();

            try (BufferedReader reader = Files.newBufferedReader(Paths.get("D:\\GB\\Training\\JAVA-in-IDEA\\training\\src\\MyPlanner\\names.txt"))) {

                String line;
                while ((line = reader.readLine()) != null) {
                    sb.append(line).append(System.lineSeparator());
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println(sb);
        }

}
