package menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import menu.db.MenuTest;

public class SelectPopImpl implements SelectPop{
	MenuTest mt;
	SectionImpl se= new SectionImpl();
	int count;
	String name;
	int price;
	int searchid=se.num();
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
		name=mt.orderName(searchid);
		System.out.println(name);
		Parent choice =(Parent) event.getSource();
		Stage ChoicePop = (Stage) choice.getScene().getWindow();
		ChoicePop.close();
	}

	@Override
	public void hot(Parent pop) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cold(Parent pop) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void counts(Parent pop) {
		// TODO Auto-generated method stub
		TextField cnts=(TextField) pop.lookup("#counts");
		try{
			count=Integer.parseInt(cnts.getText());
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
	}

	

}
