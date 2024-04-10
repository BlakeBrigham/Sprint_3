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
		model.showUserPageView();
		System.out.println("Login clicked");
    }
	
	
	@FXML
	void onClickHome(ActionEvent event)
	{
		System.out.println("Home clicked");
	}
	
	@FXML
	void onClickProfile(ActionEvent event)
	{
		System.out.println("Profile clicked");
	}
	
	
}
