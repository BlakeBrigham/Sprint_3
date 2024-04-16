package Views;

import Models.ViewTransitionalModelInterface;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import Models.UserModel;


public class UserPageController
{
	ViewTransitionalModelInterface model;
	
	public void setModel(ViewTransitionalModelInterface newModel)
	{
		model = newModel;
	}
	
	
	private TextField UserPageViewName;
	@FXML
	void fillUserPage(UserModel user)
	{
		UserPageViewName.setText("Billy Joe Bob Joe McFace");
	}
	
	
	
	
	/**
	@FXML 
	void showUserPage()
	{
		model.showUserPageView();
	}
	
	@FXML
	void onClickHome(ActionEvent event)
	{
		System.out.println("Home clicked");
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
	}
	
	**/
	
	
}
