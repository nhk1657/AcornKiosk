package menu;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.Initializable;

public class SelectOptionImpl implements SelectOption{

	@Override
	public void optionClose(Parent selectoption) {
		// TODO Auto-generated method stub
		Stage selectPopUI = (Stage) selectoption.getScene().getWindow();
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("selectPopUI.fxml"));
		
		Parent selectpop = null;
		try {
			selectpop = loader.load();
			
			selectPopUI.setScene(new Scene(selectpop));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		TestController ctrl = loader.getController();
		ctrl.setSectionUI(selectpop);
		
		
		selectPopUI.setTitle("옵션 선택");
		selectPopUI.show();
	}

	@Override
	public void optionChoice(Parent selectoption) {
		// TODO Auto-generated method stub
		Stage selectPopUI = (Stage) selectoption.getScene().getWindow();
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("selectPopUI.fxml"));
		
		Parent selectpop = null;
		try {
			selectpop = loader.load();	
			selectPopUI.setScene(new Scene(selectpop));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		TestController ctrl = loader.getController();
		ctrl.returnOptUI(selectpop);
		
		
		selectPopUI.setTitle("옵션 선택");
		selectPopUI.show();
	}


}
