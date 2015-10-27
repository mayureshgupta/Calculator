import java.awt.EventQueue;

import javax.swing.JFrame;

public class NormalCalculator {

	private JFrame frmNormalCalculator;

	/**
	 * Launch the application.
	 */
	public static void Normal() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NormalCalculator window = new NormalCalculator();
					window.frmNormalCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NormalCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNormalCalculator = new JFrame();
		frmNormalCalculator.setTitle("Normal Calculator");
		frmNormalCalculator.setBounds(100, 100, 450, 300);
		frmNormalCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNormalCalculator.getContentPane().setLayout(null);
	}

}
