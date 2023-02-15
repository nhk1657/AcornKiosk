package menu;

import javafx.event.ActionEvent;

import javafx.scene.Parent;

import javafx.scene.control.TextField;
import javafx.stage.Stage;
import menu.db.MenuTest;
import menu.db.MenuTestImpl;
import menu.db.Orders;


public class SelectPopImpl implements SelectPop{
	MenuTest mt=new MenuTestImpl();
	SectionImpl se=new SectionImpl();
	OutputsImpl op = new OutputsImpl();
	static int menu_sell=0;
	static int tempers=0;
	static int size=0;
	static int sugar=0;
	Orders odrm=new Orders();

	@Override
	public void popClose(ActionEvent event) {
		// TODO Auto-generated method stub
		se.menu_id=0;
		se.menu_name=null;
		se.menu_price=0;
		Parent close =(Parent) event.getSource();
		Stage ClosePop = (Stage) close.getScene().getWindow();
		ClosePop.close();
	}

	@Override
	public void popChoice(ActionEvent event, Parent pop, Parent menuroot) {
		// TODO Auto-generated method stub
		TextField cnts=(TextField) pop.lookup("#counts");
		try{
			menu_sell=(Integer.parseInt(cnts.getText()));
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		if(menu_sell!=0) {
			se.menu_price= se.menu_price+tempers+size+sugar;
			odrm.setMenuid(se.menu_id);
			odrm.setMenuname(se.menu_name);
			odrm.setMenuprice(se.menu_price);
			odrm.setMenusell(menu_sell);
			mt.input(odrm);
			Parent choice =(Parent) event.getSource();
			Stage ChoicePop = (Stage) choice.getScene().getWindow();
			ChoicePop.close();
			op.menuSelect(menuroot);
		}else {
			
		}
	}

	@Override
	public void hot(Parent pop) {
		// TODO Auto-generated method stub
		tempers=0;
	}

	@Override
	public void cold(Parent pop) {
		// TODO Auto-generated method stub
		tempers=300;
	}

	@Override
	public void counts(Parent pop) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sizesmall(Parent pop) {
		// TODO Auto-generated method stub
		size=0;
	}

	@Override
	public void sizemid(Parent pop) {
		// TODO Auto-generated method stub
		size=500;
	}

	@Override
	public void sizelarge(Parent pop) {
		// TODO Auto-generated method stub
		size=1000;
	}

	@Override
	public void sugarsmall(Parent pop) {
		// TODO Auto-generated method stub
		sugar=0;
	}

	@Override
	public void sugarlarge(Parent pop) {
		// TODO Auto-generated method stub
		sugar=500;
	}

	

}
