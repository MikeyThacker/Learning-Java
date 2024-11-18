import java.io.*;
import java.nio.file.*;

public class FileIO {
    void fileHandlingClasses() {
        /*
        Two main packages used:
            java.io.*,
            and java.nio.file.*

        Classes used:
            FileSystem - class to manage top-level files,
            Path - class for file paths and files,
            Paths,
            Files,
         */
    }
    Path getPath() {
        FileSystem fileSystem = FileSystems.getDefault(); // Separate windows from mac/linux
        Path filePath = fileSystem.getPath("fileName.txt");
        if (!Files.exists(filePath)) {
            // Check file exists
        }
        return filePath;
    }

    void paths(){
        /*
        toString() to return string representation of file path
        attributes(path) to return attributes of a path
            e.g., creation, modification, owner, size.

         */

    }

    void streams() {
        /*
        input/output - reading and writing bytes
        reader / writer - reading and writing characters
        scanner / printWriter/printStream - reading and writing strings

        use input.read() to get next character from stream
        - This can be very slow as only accessing one byte at a time

        -------
        Buffers
        -------

        Buffer allows reading a block of bytes at a time
        Buffer wraps around a fileReader/Writer
        Works line by line not byte by byte
        Only reads text, not special characters e.g., newline character
            Have to add newline character afterward if appending to new file

         */
    }


}
