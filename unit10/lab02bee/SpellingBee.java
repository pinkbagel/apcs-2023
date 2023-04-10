import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SpellingBee {

    private char[] letters;
    private char mustUse;
    private String str;

    public SpellingBee(char[] letters, char mustUse) {
        this.letters = letters;
        this.mustUse = mustUse;
    }

    public boolean checkWord(String word) {

        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (word.equals(chars[i])) {

            }
        }
        for (int j = 0; j < str.length(); j++) {
            if (str.contains(word.substring(0, 1)
                    && str.contains(mustUse))
                    && word.length() >= 4) {
                return true;
                System.out.println("correct");
                
            }
        }
        return false;
    }

    /**
     * Loads the contents of file "filename" as a String.
     * 
     * @param filename the file to load
     * @return the contents of file "filename"
     */
    public static String loadFile(String filename) {
        String contents = "";
        Path path = Paths.get(filename);
        try {
            path = Path.of(ClassLoader.getSystemResource(filename).toURI());
            contents = Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return contents;
    }

    public static void main(String[] args) {
        String[] words = loadFile("words_dropped.txt").split("\n");
        System.out.println("Loaded " + words.length + " words");
        // TODO solve me!
        SpellingBee bee = new SpellingBee("ranglty".toCharArray(), 'y');
        // SpellingBee.checkWord("tangy");

        // TODO sort words!

        // TODO what position in the sorted list is the word "search" ?

    }
}
