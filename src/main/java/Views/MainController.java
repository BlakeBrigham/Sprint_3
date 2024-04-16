package Views;


import Models.ViewTransitionalModelInterface;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainController {

	ViewTransitionalModelInterface model;
	
	public void setModel(ViewTransitionalModelInterface newModel)
	{
		model = newModel;
	}
	
	@FXML
    void OnClickLogin(ActionEvent event) {
		model.showSidebarView();
		
		System.out.println("Login clicked");
    }
	
}
