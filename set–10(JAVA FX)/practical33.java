import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Random;

public class practical33 extends Application {

    public void start(Stage stage) {

        VBox root = new VBox(10);
        root.setStyle("-fx-alignment: center;");

        Random rand = new Random();

        for (int i = 1; i <= 5; i++) {

            Text text = new Text("Text " + i);

            text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));

            Color color = Color.color(rand.nextDouble(), rand.nextDouble(), rand.nextDouble());

            double opacity = 0.3 + (rand.nextDouble() * 0.7);

            text.setFill(color);
            text.setOpacity(opacity);

            root.getChildren().add(text);
        }

        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("JavaFX Text Display");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
