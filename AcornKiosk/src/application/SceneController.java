package application;

import java.io.IOException;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;

import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SceneController {
	Stage stage;
	private Scene scene;
	@SuppressWarnings("unused")
	private Parent root;

	@FXML 
	private Button canclebutton;
	@FXML 
	private Pane ScenePane;

	public void switchToScene0(ActionEvent event) throws IOException, InterruptedException {
		Parent root = FXMLLoader.load(getClass().getResource("page00.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		Thread.sleep(500);
	}

	public void switchToScene1(ActionEvent event) throws IOException, InterruptedException {
		Parent root = FXMLLoader.load(getClass().getResource("addOrderUI1.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		Thread.sleep(500);
	}
	
	public void switchToScene2(ActionEvent event) throws IOException, InterruptedException {
		Parent root = FXMLLoader.load(getClass().getResource("PayMethodUI1.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		Thread.sleep(500);
	}

	public void switchToScene3(ActionEvent event) throws IOException, InterruptedException {
		Parent root = FXMLLoader.load(getClass().getResource("InputCoupUI.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		Thread.sleep(5000);
		
	}

	public void switchToScene4(ActionEvent event) throws IOException, InterruptedException {
		Parent root = FXMLLoader.load(getClass().getResource("CardCashingUI.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		Thread.sleep(2000);
//		root = FXMLLoader.load(getClass().getResource("../page09.fxml"));
//		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//		scene = new Scene(root);
//		stage.setScene(scene);
//		stage.show();
	
	}

	public void switchToScene5(ActionEvent event) throws IOException, InterruptedException {
		Parent root = FXMLLoader.load(getClass().getResource("CardCashingFinishUI.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		Thread.sleep(4000);
	
	}
	public void switchToScene05(ActionEvent event) throws IOException, InterruptedException {
		Parent root = FXMLLoader.load(getClass().getResource("CardCashingFinishUI.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		Thread.sleep(500);
		
	
	}
	public void switchToScene6(ActionEvent event) throws IOException, InterruptedException {
		Parent root = FXMLLoader.load(getClass().getResource("ShowReceiptUI.fxml"));



		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		Thread.sleep(500);

	}
	public void cancel(ActionEvent event)throws IOException, InterruptedException {

		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("cancle");
		alert.setHeaderText("주문취소창");
		alert.setHeaderText("주문 취소 하시겠습니까?");

		if(alert.showAndWait().get()==ButtonType.OK) {
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			System.out.println("주문 취소되었습니다");
			stage.close();
		}
		Thread.sleep(500);

	}

	public void print(ActionEvent event) throws IOException, InterruptedException {
		Parent root = FXMLLoader.load(getClass().getResource("CardCashingUI.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		System.out.println("출력되었습니다.");
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		Thread.sleep(500);

		
	}

}


