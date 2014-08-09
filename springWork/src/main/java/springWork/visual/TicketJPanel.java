package springWork.visual;

import java.awt.BorderLayout;

import javax.swing.JButton;

public class TicketJPanel extends AbctractSamplePanel {

	public TicketJPanel() {
		// TODO 自動生成されたコンストラクター・スタブ
		super();
		setBounds(10, 10, 300, 300);
		JButton button = new JButton();
		button.setBounds(10,10,100,50);
		button.setText("button");
		add(button, BorderLayout.NORTH);
	}

}
