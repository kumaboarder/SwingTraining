package springWork.visual;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSplitPane;

import springWork.utility.SampleStringUtility;

public class SampleScreen extends JFrame {

	private SampleSplitPane splitpane = null;
	private TicketJPanel leftPanel = null;
	private TicketJPanel rightPanel = null;

	public SampleScreen(){
		super();
		setTitle("SampleAppliationDefaultTitle");
		setBounds(10,10,1200,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private TicketJPanel getLeftPanel(){
		if (leftPanel == null){
			leftPanel = new TicketJPanel();
			leftPanel.setBackground(Color.BLUE);
		}
		return leftPanel;
	}
	private TicketJPanel getRightPanel(){
		if (rightPanel == null){
			rightPanel = new TicketJPanel();
			rightPanel.setBackground(Color.RED);
		}
		return rightPanel;
	}
	/* *******************************************************
	 * SplitPaneに関するメソッド群　ここから
	 */
	private SampleSplitPane getSpiltPane(){
		return getSpiltPane(JSplitPane.HORIZONTAL_SPLIT);
	}
	private SampleSplitPane getSpiltPane(int SplitPaneLayout){
		if (splitpane == null){
			splitpane = new SampleSplitPane(SplitPaneLayout);
			System.out.println(splitpane.getLayout().toString());
		}
		return splitpane;
	}
	/*
	 * SplitPaneに関するメソッド群　ここまで
	 * *******************************************************/

	public void setContent(){
		JButton jb = new JButton("button");
		jb.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO 自動生成されたメソッド・スタブ
				System.out.println(e.getSource().getClass().getName());
			}
		});
		getLeftPanel().add(jb);

		getSpiltPane().add(getLeftPanel());
		getSpiltPane().add(getRightPanel());
		getContentPane().add(getSpiltPane());
		getSpiltPane().toString();
	}

	public String toString(){
		SampleStringUtility.outStartEnd(this, SampleStringUtility.OUT_START);

		StringBuffer retSb = new StringBuffer();

		// output to component list
		Component[] coms = getContentPane().getComponents();
		for(Component com : coms){
			retSb.append("com:" + com.toString());
			retSb.append(System.getProperty("line.separator"));
		}

		// output toBounds
		retSb.append("getBounds:" + getBounds().toString());
		retSb.append(System.getProperty("line.separator"));
		retSb.append("getLayout:" + getLayout().getClass().getName().toString());

		System.out.println(retSb.toString());
		SampleStringUtility.outStartEnd(this, SampleStringUtility.OUT_END);
		return retSb.toString();
	}
}
