package Main;

import Models.ViewTransitionalModel;
import Views.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage stage) throws Exception
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("../Views/MainView.fxml"));
		BorderPane view = loader.load();
		MainController cont = loader.getController();
		ViewTransitionalModel vm = new ViewTransitionalModel(view);
		cont.setModel(vm);
		vm.showLoginView();
		
		Scene s = new Scene(view);
		stage.setScene(s);
		stage.show();

	}
	
	public static void main(String [] args)
	{
		launch(args);
	}

}
