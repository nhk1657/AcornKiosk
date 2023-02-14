package menu;




import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Slider;


public class TestController implements Initializable{

	@FXML
	private Parent root;
	@FXML
	private Parent selectpop;
	@FXML
	private Parent selectopt;
	@FXML
	private ActionEvent event;
	@FXML
	private Section se;
	@FXML
	private SelectSection ss;
	@FXML
	private SelectPop sp;
	@FXML
	private SelectOption so;
	@FXML
	private Slider slider;
	
	public TestController() {
		ss=new SelectSectionImpl();
		se=new SectionImpl();
		sp=new SelectPopImpl();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	public void setRoot(Parent root) {
		// TODO Auto-generated method stub
		this.root = root;
		
	}
	
	public void setSectionUI(Parent selectpop) {
		this.selectpop= selectpop;
	}
	
	public void returnOptUI(Parent selectopt) {
		this.selectopt=selectopt;
	}
	
	
	
	
	public void selectMenuProc() {
		se.selectMenuProc(root); 
	}
	
	public void popClose(ActionEvent event) {
		sp.popClose(event);
	}
	
	public void popChoice(ActionEvent event) {
		sp.popChoice(event);
	}
	
	public void popOption() {
		sp.popOption(selectpop);
	}
	
	public void optionChoice() {
		so.optionChoice(selectopt);
	}
	
	public void optionClose() {
		so.optionClose(selectopt);
	}
	

	@FXML public void selectSecBtn() {
		ss.selectSecBtn(event, root);
	}
	

	
	
	
}
