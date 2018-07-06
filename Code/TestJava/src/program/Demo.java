package program;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Demo extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane pane = new StackPane();
		pane.getChildren().add(new Button("Hello World"));
		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("JAVA");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}
