import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class DisplayTextAndImage extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Text and Image Display");

        Label label = new Label("Hello, JavaFX!");

        // Keep imagePath.jpg in the same folder as this Java file,
        // or change the path below to the location of your image.
        Image image = new Image("file:imagePath.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(400);
        imageView.setFitHeight(300);
        imageView.setPreserveRatio(true);

        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().addAll(label, imageView);

        Scene scene = new Scene(vbox, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
