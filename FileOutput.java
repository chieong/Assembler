import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
class FileOutput {
    private Path path;
    private final String HEADER = "v2.0 raw\n";
    private String output;

    public FileOutput(String fileName) {
        path = Paths.get(fileName);
        output = HEADER;
    }
    
    public void outputToFile() throws IOException {
        Files.writeString(path, output, StandardCharsets.UTF_8);
    }

    public void addCode(String hexCode) {
        output += hexCode + " "; 
    }
}