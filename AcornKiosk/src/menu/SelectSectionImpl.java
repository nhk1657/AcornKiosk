package menu;




import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class SelectSectionImpl implements SelectSection, Initializable{

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	Image Img1 = new Image(getClass().getResource("/menuImg/coffee/1.png").toExternalForm());
	@Override
	public void selectSecBtn(ActionEvent event, Parent root) {
		// TODO Auto-generated method stub
		//해야될 거 한 섹션 누르면 다른 버튼 섹션 강제 비활성화
		//섹션 버튼  누르면 색 변경
		Button btncof= new Button();
		
		btncof.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				btncof.setTextFill(Color.web("#FFFFFF"));
				
			}
		});
		
		Button btnImg1 = new Button();
		
		btnImg1.setGraphic(new ImageView(Img1));
		
	}

	

	

	
	
	
	
	
}
