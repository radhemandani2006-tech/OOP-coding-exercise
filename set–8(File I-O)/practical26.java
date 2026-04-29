import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class practical26 {

    public static void main(String[] args) {

        int characters = 0;
        int words = 0;
        int lines = 0;

        try {

            FileReader fr = new FileReader(args[0]);

            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {

                lines++;

                characters += line.length();

                String[] wordList = line.trim().split("\\s+");

                if (!line.trim().isEmpty()) {

                    words += wordList.length;
                }
            }

            br.close();

            System.out.println("Number of Lines: " + lines);
            System.out.println("Number of Words: " + words);
            System.out.println("Number of Characters: " + characters);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Please provide file name.");

        } catch (IOException e) {

            System.out.println("File Error: " + e.getMessage());
        }
    }
}
