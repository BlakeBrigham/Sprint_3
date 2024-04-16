package Views;


import Models.ViewTransitionalModelInterface;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class SidebarController {

	ViewTransitionalModelInterface model;
	
	public void setModel(ViewTransitionalModelInterface newModel)
	{
		model = newModel;
	}
	
	/**
	@FXML 
	void showUserPage()
	{
		model.showUserPageView();
	}
	
	**/
	
	@FXML
	void onClickHome(ActionEvent event)
	{
		System.out.println("Home clicked");
		model.showHomePageView();
		
	}
	
	@FXML
	void onClickFeed(ActionEvent event)
	{
		System.out.println("Profile clicked");
		
	}
	
	@FXML
	void onClickProfile(ActionEvent event)
	{
		System.out.println("Profile clicked");
		model.showUserPageView();
	}
	
	
}
