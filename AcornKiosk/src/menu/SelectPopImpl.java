package menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SelectPopImpl implements SelectPop{

	@Override
	public void popClose(ActionEvent event) {
		// TODO Auto-generated method stub
		Parent close =(Parent) event.getSource();
		Stage ClosePop = (Stage) close.getScene().getWindow();
		ClosePop.close();
	}

	@Override
	public void popChoice(ActionEvent event) {
		// TODO Auto-generated method stub
		Parent choice =(Parent) event.getSource();
		Stage ChoicePop = (Stage) choice.getScene().getWindow();
		ChoicePop.close();
	}

	@Override
	public void popOption(Parent selectpop) {
		// TODO Auto-generated method stub
		Stage selectOptionUI = (Stage) selectpop.getScene().getWindow();
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("selectOptionUI.fxml"));
		
		Parent selectoption = null;
		try {
			selectoption = loader.load();
			
			selectOptionUI.setScene(new Scene(selectoption));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		TestController ctrl = loader.getController();
		ctrl.setSectionUI(selectoption);
		
		
		selectOptionUI.setTitle("옵션 선택");
		selectOptionUI.show();
	}

}
