package test;

import javax.swing.UIManager;

import model.CounterModel;
import view.CalcView;
import view.ColorView;
import view.CounterView;
import view.MouseLocationView;
import view.ReadButtonView;
import view.SearchView;

public class Test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			MouseLocationView mouseLocationView = new MouseLocationView();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
