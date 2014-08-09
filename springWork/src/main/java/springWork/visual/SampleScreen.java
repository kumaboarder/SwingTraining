package springWork.visual;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SampleScreen extends JFrame {
	public SampleScreen(){
		super();
		setTitle("SampleAppliation");
		setBounds(10,10,600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void setContent(){
		TicketJPanel ticketpanael = new TicketJPanel();
		ticketpanael.setBackground(Color.RED);

		final TicketJPanel ticketpanael2 = new TicketJPanel();
		ticketpanael2.setBackground(Color.BLUE);
		JButton jb = new JButton("button");
		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自動生成されたメソッド・スタブ
				System.out.println(e.getSource().getClass().getName());
				getLayeredPane().setLayer(ticketpanael2,100);
			}
		});
		ticketpanael.add(jb);

		getLayeredPane().add(ticketpanael);
		getLayeredPane().add(ticketpanael2);

		getLayeredPane().setLayer(ticketpanael, NORMAL);
		getLayeredPane().setLayer(ticketpanael2, NORMAL);

//		getContentPane().add(ticketpanael,BorderLayout.SOUTH);
//		getContentPane().add(ticketpanael2,BorderLayout.NORTH);

		Component[] coms = getLayeredPane().getComponents();
		for(Component com : coms){
			System.out.println("com:" + com.getName());
		}

	}

}
