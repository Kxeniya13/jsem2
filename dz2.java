import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class dz2 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (PrintWriter pr = new PrintWriter(file)) {
            pr.println((textMult("TEST", 100)));
            System.out.println("Файл записан");
        } catch (IOException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
    public static String textMult(String arg, int count) {
        return String.valueOf(arg).repeat(Math.max(0, count));
    }
}


