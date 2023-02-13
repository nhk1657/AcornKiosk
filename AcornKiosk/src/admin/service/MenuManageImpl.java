package admin.service;

import admin.dataTest.dataTest;
import admin.dataTest.dataTestImpl;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class MenuManageImpl extends Application implements MenuManage{
dataTest dt;
private ObservableList<ObservableList> data;
private TableView tableview;
	public MenuManageImpl() {
		dt = new dataTestImpl();
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		//TableView
        tableview = new TableView();
        

        //Main Scene
        Scene scene = new Scene(tableview);        

      
	}
	public static void main(String[] args) {
		launch();
	}
	
	
}
