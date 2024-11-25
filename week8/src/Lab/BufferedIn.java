package Lab;

import java.nio.file.*;
import java.io.*;
import java.util.Scanner;


public class BufferedIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        Path file = Paths.get("./src/Lab/" + fileName);


        try {
            InputStream input = new BufferedInputStream(Files.newInputStream(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (Exception e) {
            System.out.println("No such file");
        }
    }
}
