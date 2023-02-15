package menu;

import javafx.event.ActionEvent;
import javafx.scene.Parent;

public interface SelectPop {
	public void hot(Parent pop);
	public void cold(Parent pop);
	public void sizesmall(Parent pop);
	public void sizemid(Parent pop);
	public void sizelarge(Parent pop);
	public void sugarsmall(Parent pop);
	public void sugarlarge(Parent pop);
	public void counts(Parent pop);
	public void popClose(ActionEvent event);
	public void popChoice(ActionEvent event, Parent pop, Parent menuroot);
}
