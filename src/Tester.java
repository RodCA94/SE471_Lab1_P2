import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Tester extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("Lab 1");

        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 400, 200);

        stage.setTitle("SE 471");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
