package menu;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SectionImpl implements Section{
	@Override
	public void selectMenuProc(Parent root) {
		// TODO Auto-generated method stub
		Stage selectPopUI = new Stage();
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("selectPopUI.fxml"));
		
		Parent selectpop = null;
		try {
			selectpop = loader.load();
			selectPopUI.setScene(new Scene(selectpop));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		TestController ctrl = loader.getController();
		
		ctrl.setSectionUI(selectpop);
		selectPopUI.setTitle("메뉴 옵션 선택");
		selectPopUI.show();
		
		
	}
}
