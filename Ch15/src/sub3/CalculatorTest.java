package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorTest extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorTest frame = new CalculatorTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculatorTest() {
		setTitle("나의 계산기 v1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 275, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("굴림", Font.BOLD, 16));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("0");
		textField.setBounds(12, 10, 235, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setBounds(74, 56, 50, 50);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("7");
		btnNewButton_1_1.setBounds(12, 56, 50, 50);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("9");
		btnNewButton_1_2.setBounds(136, 56, 50, 50);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("/");
		btnNewButton_1_3.setBounds(198, 56, 50, 50);
		contentPane.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("4");
		btnNewButton_1_4.setBounds(12, 116, 50, 50);
		contentPane.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("5");
		btnNewButton_1_5.setBounds(74, 116, 50, 50);
		contentPane.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("6");
		btnNewButton_1_6.setBounds(136, 116, 50, 50);
		contentPane.add(btnNewButton_1_6);
		
		JButton btnNewButton_1_7 = new JButton("X");
		btnNewButton_1_7.setBounds(198, 116, 50, 50);
		contentPane.add(btnNewButton_1_7);
		
		JButton btnNewButton_1_8 = new JButton("1");
		btnNewButton_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_8.setBounds(12, 176, 50, 50);
		contentPane.add(btnNewButton_1_8);
		
		JButton btnNewButton_1_9 = new JButton("2");
		btnNewButton_1_9.setBounds(74, 176, 50, 50);
		contentPane.add(btnNewButton_1_9);
		
		JButton btnNewButton_1_10 = new JButton("3");
		btnNewButton_1_10.setBounds(136, 176, 50, 50);
		contentPane.add(btnNewButton_1_10);
		
		JButton btnNewButton_1_11 = new JButton("-");
		btnNewButton_1_11.setBounds(198, 176, 50, 50);
		contentPane.add(btnNewButton_1_11);
		
		JButton btnNewButton_1_12 = new JButton("0");
		btnNewButton_1_12.setBounds(12, 236, 50, 50);
		contentPane.add(btnNewButton_1_12);
		
		JButton btnNewButton_1_13 = new JButton("C");
		btnNewButton_1_13.setBounds(74, 236, 50, 50);
		contentPane.add(btnNewButton_1_13);
		
		JButton btnNewButton_1_14 = new JButton("=");
		btnNewButton_1_14.setBounds(136, 236, 50, 50);
		contentPane.add(btnNewButton_1_14);
		
		JButton btnNewButton_1_15 = new JButton("+");
		btnNewButton_1_15.setBounds(198, 236, 50, 50);
		contentPane.add(btnNewButton_1_15);
	}

}
