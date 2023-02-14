package member.service;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class CommonServiceImpl implements CommonService {
	public void errorMsg(String subject, String head, String content) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle(subject);
		alert.setHeaderText(head);
		alert.setContentText(content);
		alert.showAndWait();		
	}
}
