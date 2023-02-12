package menu;


import javafx.scene.Parent;
import javafx.scene.control.Button;

import javafx.scene.image.ImageView;

public class SelectSectionImpl implements SelectSection{
	
	@Override
	public void selectSecBtn(Parent root) {
		// TODO Auto-generated method stub
		//해야될 거 한 섹션 누르면 다른 버튼 섹션 강제 비활성화
		//섹션 버튼  누르면 색 변경
		
		
	}

	@Override
	public void btnImg(Parent root) {
		// TODO Auto-generated method stub
		Button btn1 = (Button) root.lookup("#secbtn1");
		System.out.println(btn1.getId());
		Button btn2 = (Button) root.lookup("#secbtn2");
		

		btn1.setGraphic(new ImageView("../menuImg/coffee/1.png"));
		
		btn2.setGraphic(new ImageView("../menuImg/coffee/1.png"));
	}
	
	
	
	
}
