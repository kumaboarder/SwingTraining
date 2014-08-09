package springWork.visual.main;

import springWork.visual.SampleScreen;

public class SampleGUIApplication {

	public static void main(String[] args){
		SampleGUIApplication sampleGUI = new SampleGUIApplication();
		sampleGUI.makeScreenBoxLayout();
		sampleGUI.makeScreen();
	}

	private void makeScreenBoxLayout(){
		SampleScreen screen = new SampleScreen();
		screen.setContent();
		screen.setTitle("makeScreenBoxLayout");
		screen.setVisible(true);
		screen.toString();
	}
	private void makeScreen(){
		SampleScreen screen = new SampleScreen();
//		screen.setLayout(new BoxLayout(screen, BoxLayout.LINE_AXIS));
		screen.setContent();
		screen.setTitle("makeScreenBoxLayout");
		screen.setVisible(true);
		screen.toString();
	}
}
