import java.io.BufferedWriter;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {
        String[] sub = {"Math","Science","English","french"};
        FileWriter f1 = new FileWriter("text.txt");
        BufferedWriter wri = new BufferedWriter(f1);
        for (String s : sub){
            wri.write(s+"\n");
        }
        wri.close();
    }
}
