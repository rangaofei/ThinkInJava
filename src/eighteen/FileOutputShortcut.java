package eighteen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class FileOutputShortcut {
    static String file = "FileOutputShortCut.out";

    public static void main(String[] args) throws IOException {
        BufferedReader in =
                new BufferedReader(new StringReader(BufferedInputFile.read("FileOutputShortCut.java")));
        PrintWriter out = new PrintWriter(file);
        int lineCount = 1;
        String s;
        while ((s = in.readLine()) != null) {
            out.println(lineCount++ + ":" + s);
            out.close();
        }
    }
}
