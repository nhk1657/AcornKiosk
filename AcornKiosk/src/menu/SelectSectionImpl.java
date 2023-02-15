package menu;




import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SelectSectionImpl implements SelectSection{

	Stage stage;
	static int secnum=0;
	
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
		
		Controller ctrl = loader.getController();
		ctrl.setmenu(cof);
		
		Cofbtn.setScene(new Scene(cof));
		Cofbtn.setTitle("주문목록");
		Cofbtn.show();
		secnum=0;
	}

	@Override
	public void smobtn(Parent root) {
		// TODO Auto-generated method stub
		Parent smo=null;
		
		Stage Smobtn =(Stage) root.getScene().getWindow();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/menu/menuAll2UI.fxml"));
		
		try {
			smo=loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Controller ctr = loader.getController();
		ctr.setmenu(smo);
		
		
		Smobtn.setScene(new Scene(smo));
		Smobtn.setTitle("주문목록");
		Smobtn.show();
		secnum=1;
	}

	@Override
	public void adebtn(Parent root) {
		// TODO Auto-generated method stub
		Parent ade=null;
		Stage Adebtn = (Stage) root.getScene().getWindow();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/menu/menuAll3UI.fxml"));
		
		try {
			ade=loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Controller ctr = loader.getController();
		ctr.setmenu(ade);
		
		
		Adebtn.setScene(new Scene(ade));
		Adebtn.setTitle("주문목록");
		Adebtn.show();
		secnum=2;
	}

	@Override
	public void teabtn(Parent root) {
		// TODO Auto-generated method stub
		Parent tea=null;
		Stage Teabtn = (Stage) root.getScene().getWindow();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/menu/menuAll4UI.fxml"));
		
		try {
			tea=loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Controller ctr = loader.getController();
		ctr.setmenu(tea);
		
		
		Teabtn.setScene(new Scene(tea));
		Teabtn.setTitle("주문목록");
		Teabtn.show();
		secnum=3;
	}

	

	

	
	
	
	
	
}
