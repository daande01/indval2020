package grafik;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Grafik1 extends JFrame implements ActionListener {

	int i = 0;
	JButton b1 = new JButton("send");
	JLabel l1 = new JLabel("light off");

	public Grafik1() {

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(300, 300);
		add(b1);
		add(l1);
		b1.addActionListener(this);

	}

	public static void main(String[] args) {
		new Grafik1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (i == 0) {
			l1.setText("light on");
			i = 1;
		} else  {
			l1.setText("light off");
			i = 0;
		}

	}
}
