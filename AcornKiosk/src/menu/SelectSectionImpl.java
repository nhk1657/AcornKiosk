package menu;




import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SelectSectionImpl implements SelectSection{

	Stage stage;
	
	@Override
	public void cofbtn(Parent root) {
		// TODO Auto-generated method stub
		//이전화면 안꺼짐 왜지?
		Stage Cofbtn = (Stage) root.getScene().getWindow();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/menu/menuAll1UI.fxml"));
		
		Parent cof=null;
		try {
			cof = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		TestController ctrl = loader.getController();
		ctrl.setcofbtn(cof);
		
		Cofbtn.setScene(new Scene(cof));
		Cofbtn.setTitle("주문목록");
		Cofbtn.show();
	}

	@Override
	public void smobtn(Parent root) {
		// TODO Auto-generated method stub
		Parent smo=null;
		
		Stage Smobtn = new Stage();//(Stage) root.getScene().getWindow();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/menu/menuAll2UI.fxml"));
		
		try {
			smo=loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TestController ctr = loader.getController();
		ctr.setsmobtn(smo);
		
		
		Smobtn.setScene(new Scene(smo));
		Smobtn.setTitle("주문목록");
		Smobtn.show();
		
	}

	@Override
	public void adebtn(Parent root) {
		// TODO Auto-generated method stub
		Parent ade=null;
		Stage Adebtn = new Stage();//(Stage) root.getScene().getWindow();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/menu/menuAll3UI.fxml"));
		
		try {
			ade=loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TestController ctr = loader.getController();
		ctr.setadebtn(ade);
		
		
		Adebtn.setScene(new Scene(ade));
		Adebtn.setTitle("주문목록");
		Adebtn.show();
	}

	@Override
	public void teabtn(Parent root) {
		// TODO Auto-generated method stub
		Parent tea=null;
		Stage Teabtn = new Stage();//(Stage) root.getScene().getWindow();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/menu/menuAll4UI.fxml"));
		
		try {
			tea=loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TestController ctr = loader.getController();
		ctr.setteabtn(tea);
		
		
		Teabtn.setScene(new Scene(tea));
		Teabtn.setTitle("주문목록");
		Teabtn.show();
	}

	

	

	
	
	
	
	
}
