package SystemasDeCalculo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Potencia extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        
        Parent root2 = FXMLLoader.load(getClass().getResource("Calculadora.fxml"));

        stage.setTitle("Calculadora");
        stage.setResizable(false);
        stage.setScene(new Scene(root2));
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
