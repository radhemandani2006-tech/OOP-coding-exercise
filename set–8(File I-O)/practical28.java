import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class practical28 {

    public static void main(String[] args) {

        int lines = 0;
        int words = 0;
        int characters = 0;

        try {

            BufferedReader br = new BufferedReader(new FileReader("data.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                lines++;

                String[] wordArray = line.trim().split("\\s+");

                if (!line.trim().isEmpty()) {

                    words += wordArray.length;
                }

                characters += line.replace(" ", "").length();
            }

            br.close();

            System.out.println("Total Lines: " + lines);
            System.out.println("Total Words: " + words);
            System.out.println("Total Characters: " + characters);

        } catch (FileNotFoundException e) {

            System.out.println("File not found.");

        } catch (IOException e) {

            System.out.println("File Error: " + e.getMessage());
        }
    }
}
