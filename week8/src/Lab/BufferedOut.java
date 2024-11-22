package Lab;

import java.nio.file.*;
import java.io.*;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.*;

public class BufferedOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        Path file = Paths.get("./src/Lab/" + fileName);


        try {
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE, TRUNCATE_EXISTING));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            writer.write("Hello World!");

            writer.flush();
            writer.close();

        } catch (Exception e) {
            System.out.println("No such file");
        }
    }
}
