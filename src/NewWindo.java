import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewWindo {

	private JFrame frmFirstwindow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewWindo window = new NewWindo();
					window.frmFirstwindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NewWindo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFirstwindow = new JFrame();
		frmFirstwindow.setTitle("firstwindow");
		frmFirstwindow.setBounds(100, 100, 326, 253);
		frmFirstwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFirstwindow.getContentPane().setLayout(null);
		
		JButton btnNormalCalculator = new JButton("Normal Calculator");
		btnNormalCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				NormalCalculator nw = new NormalCalculator();
				nw.Normal();
			}
		});
		btnNormalCalculator.setBounds(64, 28, 171, 71);
		frmFirstwindow.getContentPane().add(btnNormalCalculator);
		
		JButton btnScientificCalculator = new JButton("Scientific Calculator");
		btnScientificCalculator.setBounds(64, 110, 171, 71);
		frmFirstwindow.getContentPane().add(btnScientificCalculator);
	}
}
