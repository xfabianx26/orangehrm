package co.com.orangehrm.project.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TempFile {

    private static final String TEMP_DIR = "src/test/resources/temp";

    public static String createTempResumeFile() throws IOException {

        Files.createDirectories(Paths.get(TEMP_DIR));

        File tempFile = new File(TEMP_DIR, "curriculum.pdf");

        try (FileWriter writer = new FileWriter(tempFile)) {
            writer.write("Este es un currículum de prueba.");
        }

        return tempFile.getAbsolutePath();
    }


    public static void deleteTempFiles() {
        File directory = new File(TEMP_DIR);
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                file.delete();
            }
        }
    }
}
