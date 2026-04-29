import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class practical27 {

    public static void main(String[] args) {

        BufferedWriter bw = null;
        BufferedReader br = null;

        try {

            bw = new BufferedWriter(new FileWriter("students.txt"));

            bw.write("101 Radhe 85");
            bw.newLine();

            bw.write("102 Krishna 90");
            bw.newLine();

            bw.write("103 Mohan 78");
            bw.newLine();

            System.out.println("Student records written to file.\n");

            bw.close();

            br = new BufferedReader(new FileReader("students.txt"));

            String line;

            System.out.println("Student Records:");

            while ((line = br.readLine()) != null) {

                System.out.println(line);
            }

        } catch (IOException e) {

            System.out.println("File Error: " + e.getMessage());

        } finally {

            try {

                if (bw != null) {
                    bw.close();
                }

                if (br != null) {
                    br.close();
                }

            } catch (IOException e) {

                System.out.println("Error closing file.");
            }
        }
    }
}
