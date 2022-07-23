package ClassWork;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class files {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Path path = Paths.get(scanner.nextLine());

        if (Files.exists(path)) {
            System.out.printf("%n%s exists", path.getFileName());
            System.out.printf("%n%s exists", Files.isDirectory(path) ? "is" : "is not");
            System.out.printf("%n Last modified time %s", Files.getLastModifiedTime(path));
            System.out.printf("%n Size: %s", Files.size(path));
            System.out.printf("%n Absolute: %s,", path.toAbsolutePath());


        }
        else {
            System.out.printf("File don't not exist");
        }
    }


}
