
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task1_ListFileStructure {

    public static void main(String[] args) throws IOException {

        Path outputDir = Paths.get("src");
        
        System.out.println(Files.list(outputDir));
    }
}
