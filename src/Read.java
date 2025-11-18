import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Read {

    public static int read() throws IOException {
        int points = 0;
        File f = new File("Guesses.txt");
        Scanner s = new Scanner(f);
        while (s.hasNext()) {
            WordMatch w = new WordMatch(s.next());
            points += w.scoreGuess(w.findBetterGuess(s.next(), s.next()));
        }

        return points;
    }
    public static void main(String[] args) throws IOException {
        System.out.println(read());
    }
}
