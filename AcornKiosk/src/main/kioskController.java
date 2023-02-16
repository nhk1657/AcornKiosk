package main;


import javafx.scene.Parent;
import javafx.stage.Stage;
import member.LoginMain;

public class kioskController {
	private Parent kioskMainRoot;
	public void setRoot(Parent kioskMainRoot) {
		// TODO Auto-generated method stub
		this.kioskMainRoot = kioskMainRoot;
	}
	public void Letstart() {
		Stage start = (Stage) kioskMainRoot.getScene().getWindow();
		LoginMain lm= new LoginMain();
		try {
			lm.start(start);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}