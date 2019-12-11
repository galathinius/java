package lab8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class main extends Application {

    @Override
    public void start(Stage primaryStage) {
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        Label label = new Label();
        Button button = new Button("divide");
        button.setOnAction(new Controller.DivisionEventListener(textField1, textField2, label)::listen);

        VBox root = new VBox();
        root.getChildren().addAll(textField1, textField2, button, label);
        Scene scene = new Scene(root, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
