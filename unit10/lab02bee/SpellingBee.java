import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class SpellingBee {

    private char[] letters;
    private char mustUse;
    // private String str;

    public SpellingBee(char[] letters, char mustUse) {
        this.letters = letters;
        this.mustUse = mustUse;
    }

    public boolean checkWord(String word) {
        boolean x = true;
        if (word.length() >= 4) {
            int i = 0;
            while (i != word.length() && x == true) {
                x = false;
                for (int j = 0; j < letters.length; j++) {
                    if (word.charAt(i) == letters[j]) {
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    // public boolean mustUseCheck(String word) {
    //     boolean y = false;
    //     for (int i = 0; i <= word.length(); i++) {
    //         if (word.indexOf(i) == mustUse) {
    //             y = true;
    //         }
    //         // } else {
    //         // y=false;
    //         // return false;
    //         // }
    //     }
    //     return y;
    // }

    // public boolean lettersValid(String word) {
    //     boolean x = true;
    //     for (int i = 0; i < word.length(); i++) {
    //         boolean charValid = false;
    //         for (int j = 0; j < letters.length; j++) {
    //             if (word.charAt(i) == letters[j]) {
    //                 charValid = true;
    //                 break;
    //             }
    //         }
    //         if (!charValid) {
    //             x = false;
    //             break;
    //         }
    //     }
    //     return x;
    // }

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
        for (int i = 0; i < words.length; i++) {
            if (bee.checkWord(words[i])) {
                System.out.println(words[i]);
            } else {
                System.out.println("No words :(");
                break;
            }
        }

        // TODO sort words!
        Arrays.sort(words);

        // TODO what position in the sorted list is the word "search" ?
        for (int j = 0; j < words.length; j++) {
            if (words[j].equals("search")) {
                System.out.println(j);
                break;
            }
        }
    }
}
