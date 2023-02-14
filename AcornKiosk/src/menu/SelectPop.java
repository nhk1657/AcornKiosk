package menu;

import javafx.event.ActionEvent;
import javafx.scene.Parent;

public interface SelectPop {
	public void hot(Parent pop);
	public void cold(Parent pop);
	public void counts(Parent pop);
	public void popClose(ActionEvent event);
	public void popChoice(ActionEvent event);
}
