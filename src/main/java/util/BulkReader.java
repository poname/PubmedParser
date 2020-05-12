package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.function.Consumer;

public class BulkReader {
    public static <T> void read(Class<T> clazz, Consumer<T> action) throws PubmedException {
        try {
            Scanner scanner = new Scanner(new File("urls"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.endsWith("md5"))
                    continue;

                T dataSet = XmlGzParser.parse("/media/danial/mamanpaz/pubmed/" + line, clazz);
                // process the line

                action.accept(dataSet);
            }
        } catch (FileNotFoundException e) {
            throw new PubmedException(e.getMessage());
        }

    }
}
