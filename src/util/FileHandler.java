package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class FileHandler {

    public static String readXmlToString(String fileNameParam) {
        try {

            Path filename = Path.of(fileNameParam);
            String content = "";
            Files.writeString(filename, content);
            return content;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String read2(String fileNameParam) {
        try {
            return Files.lines(Paths.get(fileNameParam)).collect(Collectors.joining("\n"));
        } catch (IOException e) {

        }
        return null;
    }
}
