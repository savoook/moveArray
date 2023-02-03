package testTasks.uniqIpAddress;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileParser {

    public long countUniq(File file) {
        return parse(file).stream().distinct().count();
    }

    private List<String> parse(File file) {
        List<String> ips = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                ips.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return ips;
    }
}
