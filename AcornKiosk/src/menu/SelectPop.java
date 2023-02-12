package menu;

import javafx.event.ActionEvent;
import javafx.scene.Parent;

public interface SelectPop {
	public void popClose(ActionEvent event);
	public void popChoice(ActionEvent event);
	public void popOption(Parent selectpop);
}
