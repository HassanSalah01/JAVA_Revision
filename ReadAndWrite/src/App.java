import java.io.BufferedWriter;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {
        FileWriter f1 = new FileWriter("text.txt");
        BufferedWriter wri = new BufferedWriter(f1);
        wri.write("Hello WOrld !");
        wri.close();
    }
}
