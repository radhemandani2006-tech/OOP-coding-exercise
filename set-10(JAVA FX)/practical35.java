import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class practical35 extends Application {

    public void start(Stage stage) {

        VBox projectBox = createBar("Projects - 20%", 20, Color.RED);
        VBox quizBox = createBar("Quizzes - 10%", 10, Color.BLUE);
        VBox midtermBox = createBar("Midterm - 30%", 30, Color.GREEN);
        VBox finalBox = createBar("Final - 40%", 40, Color.ORANGE);

        HBox root = new HBox(20);
        root.setStyle("-fx-alignment: center;");

        root.getChildren().addAll(projectBox, quizBox, midtermBox, finalBox);

        Scene scene = new Scene(root, 600, 400);

        stage.setTitle("Grade Distribution Bar Chart");
        stage.setScene(scene);
        stage.show();
    }

    private VBox createBar(String label, int percent, Color color) {

        Rectangle bar = new Rectangle();

        bar.setWidth(50);
        bar.setHeight(percent * 5);
        bar.setFill(color);

        Text text = new Text(label);

        VBox box = new VBox(10);
        box.setStyle("-fx-alignment: bottom-center;");

        box.getChildren().addAll(bar, text);

        return box;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
