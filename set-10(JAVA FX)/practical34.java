import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class practical34 extends Application {

    public void start(Stage stage) {

        TextField rollField = new TextField();
        TextField nameField = new TextField();
        TextField ageField = new TextField();
        TextField emailField = new TextField();

        Button submit = new Button("Submit");

        GridPane grid = new GridPane();

        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(20));

        grid.add(new Label("Roll No:"), 0, 0);
        grid.add(rollField, 1, 0);

        grid.add(new Label("Name:"), 0, 1);
        grid.add(nameField, 1, 1);

        grid.add(new Label("Age:"), 0, 2);
        grid.add(ageField, 1, 2);

        grid.add(new Label("Email:"), 0, 3);
        grid.add(emailField, 1, 3);

        grid.add(submit, 1, 4);

        submit.setOnAction(e -> {

            try {

                int roll = Integer.parseInt(rollField.getText());
                int age = Integer.parseInt(ageField.getText());

                String name = nameField.getText();
                String email = emailField.getText();

                if (!email.contains("@") || !email.contains(".")) {
                    throw new Exception("Invalid Email Format");
                }

                BufferedWriter bw = new BufferedWriter(new FileWriter("student_registration.txt"));

                bw.write("Roll No: " + roll);
                bw.newLine();
                bw.write("Name: " + name);
                bw.newLine();
                bw.write("Age: " + age);
                bw.newLine();
                bw.write("Email: " + email);

                bw.close();

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Success");
                alert.setContentText("Registration Successful\nRoll: " + roll + "\nName: " + name + "\nAge: " + age + "\nEmail: " + email);
                alert.show();

            } catch (NumberFormatException ex) {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setContentText("Roll No and Age must be integers");
                alert.show();

            } catch (Exception ex) {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setContentText(ex.getMessage());
                alert.show();

            } catch (IOException ex) {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("File Error");
                alert.setContentText("Unable to save data");
                alert.show();
            }
        });

        Scene scene = new Scene(grid, 400, 300);

        stage.setTitle("Registration Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
