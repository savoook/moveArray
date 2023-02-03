package testTasks.uniqIpAddress;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        FileParser parser = new FileParser();
        File file= new File("src\\testTasks\\uniqIpAddress\\file.txt");
        System.out.println(parser.countUniq(file));
    }
}
