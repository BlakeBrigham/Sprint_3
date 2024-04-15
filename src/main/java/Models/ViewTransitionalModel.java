package Models;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

public class ViewTransitionalModel implements ViewTransitionalModelInterface {

	BorderPane mainview;
	
	public ViewTransitionalModel(BorderPane view)
	{
		mainview = view;
	}
	

	@Override
	public void showHomePageView()
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ViewTransitionalModel.class
				.getResource("../Views/HomePageView.fxml"));
		try
		{
			Node view = loader.load();
			mainview.setCenter(view);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void showHomeView()
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ViewTransitionalModel.class
				.getResource("../Views/HomeView.fxml"));
		try
		{
			Node view = loader.load();
			mainview.setCenter(view);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void showSidebarView()
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ViewTransitionalModel.class
				.getResource("../Views/SidebarView.fxml"));
		try
		{
			Node view = loader.load();
			mainview.setCenter(view);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}


	@Override
	public void showUserPageView()
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ViewTransitionalModel.class
				.getResource("../Views/UserPageView.fxml"));
		try
		{
			Node view = loader.load();
			mainview.setCenter(view);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	@Override
	public void showLoginView()
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ViewTransitionalModel.class
				.getResource("../Views/LoginView.fxml"));
		try
		{
			Node view = loader.load();
			mainview.setCenter(view);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
