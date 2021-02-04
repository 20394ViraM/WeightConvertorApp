package WeightCoverter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.awt.event.ActionEvent;

public class WeightConvertorApp {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WeightConvertorApp window = new WeightConvertorApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WeightConvertorApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Weight Convertor");
		frame.setBounds(100, 100, 483, 452);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter the weight in one of the text boxes and press the Convert button:");
		lblNewLabel.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		lblNewLabel.setBounds(6, 6, 471, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel1 = new JLabel("Metric tons:");
		lblNewLabel1.setFont(new Font("Helvetica", Font.PLAIN, 15));
		lblNewLabel1.setBounds(31, 34, 90, 39);
		frame.getContentPane().add(lblNewLabel1);
		
		JLabel lblNewLabel2 = new JLabel("Kilograms:");
		lblNewLabel2.setFont(new Font("Helvetica", Font.PLAIN, 15));
		lblNewLabel2.setBounds(31, 74, 90, 39);
		frame.getContentPane().add(lblNewLabel2);
		
		JLabel lblNewLabel3 = new JLabel("Grams:");
		lblNewLabel3.setFont(new Font("Helvetica", Font.PLAIN, 15));
		lblNewLabel3.setBounds(31, 114, 90, 39);
		frame.getContentPane().add(lblNewLabel3);
		
		JLabel lblNewLabel4 = new JLabel("Milligrams:");
		lblNewLabel4.setFont(new Font("Helvetica", Font.PLAIN, 15));
		lblNewLabel4.setBounds(31, 154, 90, 39);
		frame.getContentPane().add(lblNewLabel4);
		
		JLabel lblNewLabel5 = new JLabel("Pounds:");
		lblNewLabel5.setFont(new Font("Helvetica", Font.PLAIN, 15));
		lblNewLabel5.setBounds(31, 274, 90, 39);
		frame.getContentPane().add(lblNewLabel5);
		
		JLabel lblNewLabel6 = new JLabel("Ounces:");
		lblNewLabel6.setFont(new Font("Helvetica", Font.PLAIN, 15));
		lblNewLabel6.setBounds(31, 314, 90, 39);
		frame.getContentPane().add(lblNewLabel6);
		
		JLabel lblNewLabel7 = new JLabel("Stones:");
		lblNewLabel7.setFont(new Font("Helvetica", Font.PLAIN, 15));
		lblNewLabel7.setBounds(31, 234, 90, 39);
		frame.getContentPane().add(lblNewLabel7);
		
		JLabel lblNewLabel8 = new JLabel("Micrograms:");
		lblNewLabel8.setFont(new Font("Helvetica", Font.PLAIN, 15));
		lblNewLabel8.setBounds(31, 194, 90, 39);
		frame.getContentPane().add(lblNewLabel8);
		
		textField = new JTextField();
		textField.setBounds(120, 34, 243, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(120, 74, 243, 39);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(120, 154, 243, 39);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(120, 114, 243, 39);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(120, 314, 243, 39);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(120, 274, 243, 39);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(120, 234, 243, 39);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(120, 194, 243, 39);
		frame.getContentPane().add(textField_7);
		
		JButton btnNewButton1 = new JButton("Convert");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String t = textField.getText();
				
				textField.setText(new BigDecimal(t).multiply(new BigDecimal("1.0"))+" t");
				textField_1.setText(new BigDecimal(t).multiply(new BigDecimal("1000.0"))+" Kg");
				textField_3.setText(new BigDecimal(t).multiply(new BigDecimal("1000000.0"))+" g");
				textField_2.setText(new BigDecimal(t).multiply(new BigDecimal("1000000000.0"))+" mg");
				textField_7.setText(new BigDecimal(t).multiply(new BigDecimal("1000000000000.0"))+" mcg");
				textField_6.setText(new BigDecimal(t).multiply(new BigDecimal("157.473"))+" st");
				textField_5.setText(new BigDecimal(t).multiply(new BigDecimal("2204.623"))+" lb");
				textField_4.setText(new BigDecimal(t).multiply(new BigDecimal("35273.96"))+" oz");
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(frame , "Enter Valid Number Only");
				}
				
			}
		});
		btnNewButton1.setFont(new Font("Helvetica", Font.PLAIN, 15));
		btnNewButton1.setBounds(375, 34, 90, 39);
		frame.getContentPane().add(btnNewButton1);
		
		JButton btnNewButton2 = new JButton("Convert");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				
				String k = textField_1.getText();
				
				textField.setText(new BigDecimal(k).multiply(new BigDecimal("0.001"))+" t");
				textField_1.setText(new BigDecimal(k).multiply(new BigDecimal("1.0"))+" Kg");
				textField_3.setText(new BigDecimal(k).multiply(new BigDecimal("1000.0"))+" g");
				textField_2.setText(new BigDecimal(k).multiply(new BigDecimal("1000000.0"))+" mg");
				textField_7.setText(new BigDecimal(k).multiply(new BigDecimal("1000000000.0"))+" mcg");
				textField_6.setText(new BigDecimal(k).multiply(new BigDecimal("0.157473"))+" st");
				textField_5.setText(new BigDecimal(k).multiply(new BigDecimal("2.204623"))+" lb");
				textField_4.setText(new BigDecimal(k).multiply(new BigDecimal("35.27396"))+" oz");
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(frame , "Enter Valid Number Only");
				}
			}
		});
		btnNewButton2.setFont(new Font("Helvetica", Font.PLAIN, 15));
		btnNewButton2.setBounds(375, 74, 90, 39);
		frame.getContentPane().add(btnNewButton2);
		
		JButton btnNewButton3 = new JButton("Convert");
		btnNewButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String m = textField_2.getText();
				
				textField.setText(new BigDecimal(m).multiply(new BigDecimal("0.000000001"))+" t");
				textField_1.setText(new BigDecimal(m).multiply(new BigDecimal("0.000001"))+" Kg");
				textField_3.setText(new BigDecimal(m).multiply(new BigDecimal("0.001"))+" g");
				textField_2.setText(new BigDecimal(m).multiply(new BigDecimal("1.0"))+" mg");
				textField_7.setText(new BigDecimal(m).multiply(new BigDecimal("1000.0"))+" mcg");
				textField_6.setText(new BigDecimal(m).multiply(new BigDecimal("0.000000157473"))+" st");
				textField_5.setText(new BigDecimal(m).multiply(new BigDecimal("0.000002204623"))+" lb");
				textField_4.setText(new BigDecimal(m).multiply(new BigDecimal("0.00003527396"))+" oz");
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(frame , "Enter Valid Number Only");
				}
			}
		});
		btnNewButton3.setFont(new Font("Helvetica", Font.PLAIN, 15));
		btnNewButton3.setBounds(375, 154, 90, 39);
		frame.getContentPane().add(btnNewButton3);
		
		JButton btnNewButton4 = new JButton("Convert");
		btnNewButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String g = textField_3.getText();
				
				textField.setText(new BigDecimal(g).multiply(new BigDecimal("0.000001"))+" t");
				textField_1.setText(new BigDecimal(g).multiply(new BigDecimal("0.001"))+" Kg");
				textField_3.setText(new BigDecimal(g).multiply(new BigDecimal("1.0"))+" g");
				textField_2.setText(new BigDecimal(g).multiply(new BigDecimal("1000.0"))+" mg");
				textField_7.setText(new BigDecimal(g).multiply(new BigDecimal("1000000.0"))+" mcg");
				textField_6.setText(new BigDecimal(g).multiply(new BigDecimal("0.000157473"))+" st");
				textField_5.setText(new BigDecimal(g).multiply(new BigDecimal("0.002204623"))+" lb");
				textField_4.setText(new BigDecimal(g).multiply(new BigDecimal("0.03527396"))+" oz");
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(frame , "Enter Valid Number Only");
				}
			}
		});
		btnNewButton4.setFont(new Font("Helvetica", Font.PLAIN, 15));
		btnNewButton4.setBounds(375, 114, 90, 39);
		frame.getContentPane().add(btnNewButton4);
		
		JButton btnNewButton5 = new JButton("Convert");
		btnNewButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				String l = textField_4.getText();
				
				textField.setText(new BigDecimal(l).multiply(new BigDecimal("0.00002834952"))+" t");
				textField_1.setText(new BigDecimal(l).multiply(new BigDecimal("0.02834952"))+" Kg");
				textField_3.setText(new BigDecimal(l).multiply(new BigDecimal("28.34952"))+" g");
				textField_2.setText(new BigDecimal(l).multiply(new BigDecimal("28349.52"))+" mg");
				textField_7.setText(new BigDecimal(l).multiply(new BigDecimal("28349520"))+" mcg");
				textField_6.setText(new BigDecimal(l).multiply(new BigDecimal("0.004464286"))+" st");
				textField_5.setText(new BigDecimal(l).multiply(new BigDecimal("0.0625"))+" lb");
				textField_4.setText(new BigDecimal(l).multiply(new BigDecimal("1.0"))+" oz");
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(frame , "Enter Valid Number Only");
				}
			}
		});
		btnNewButton5.setFont(new Font("Helvetica", Font.PLAIN, 15));
		btnNewButton5.setBounds(375, 314, 90, 39);
		frame.getContentPane().add(btnNewButton5);
		
		JButton btnNewButton6 = new JButton("Convert");
		btnNewButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String l = textField_5.getText();
				
				textField.setText(new BigDecimal(l).multiply(new BigDecimal("0.0004535924"))+" t");
				textField_1.setText(new BigDecimal(l).multiply(new BigDecimal("0.4535924"))+" Kg");
				textField_3.setText(new BigDecimal(l).multiply(new BigDecimal("453.5924"))+" g");
				textField_2.setText(new BigDecimal(l).multiply(new BigDecimal("453592.4"))+" mg");
				textField_7.setText(new BigDecimal(l).multiply(new BigDecimal("453592400.0"))+" mcg");
				textField_6.setText(new BigDecimal(l).multiply(new BigDecimal("0.07142857"))+" st");
				textField_5.setText(new BigDecimal(l).multiply(new BigDecimal("1.0"))+" lb");
				textField_4.setText(new BigDecimal(l).multiply(new BigDecimal("16.0"))+" oz");
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(frame , "Enter Valid Number Only");
				}
			}
		});
		btnNewButton6.setFont(new Font("Helvetica", Font.PLAIN, 15));
		btnNewButton6.setBounds(375, 274, 90, 39);
		frame.getContentPane().add(btnNewButton6);
		
		JButton btnNewButton7 = new JButton("Convert");
		btnNewButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String s = textField_6.getText();
				
				textField.setText(new BigDecimal(s).multiply(new BigDecimal("0.006350293"))+" t");
				textField_1.setText(new BigDecimal(s).multiply(new BigDecimal("6.350293"))+" Kg");
				textField_3.setText(new BigDecimal(s).multiply(new BigDecimal("6350.293"))+" g");
				textField_2.setText(new BigDecimal(s).multiply(new BigDecimal("6350293.0"))+" mg");
				textField_7.setText(new BigDecimal(s).multiply(new BigDecimal("6350293000.0"))+" mcg");
				textField_6.setText(new BigDecimal(s).multiply(new BigDecimal("1.0"))+" st");
				textField_5.setText(new BigDecimal(s).multiply(new BigDecimal("14.0"))+" lb");
				textField_4.setText(new BigDecimal(s).multiply(new BigDecimal("224.0"))+" oz");
				} catch(Exception e1) {
					JOptionPane.showMessageDialog(frame , "Enter Valid Number Only");
				}
				
			}
		});
		btnNewButton7.setFont(new Font("Helvetica", Font.PLAIN, 15));
		btnNewButton7.setBounds(375, 234, 90, 39);
		frame.getContentPane().add(btnNewButton7);
		
		JButton btnNewButton8 = new JButton("Convert");
		btnNewButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String mg = textField_7.getText();
				
				textField.setText(new BigDecimal(mg).multiply(new BigDecimal("0.000000000001"))+" t");
				textField_1.setText(new BigDecimal(mg).multiply(new BigDecimal("0.000000001"))+" Kg");
				textField_3.setText(new BigDecimal(mg).multiply(new BigDecimal("0.000001"))+" g");
				textField_2.setText(new BigDecimal(mg).multiply(new BigDecimal("0.001"))+" mg");
				textField_7.setText(new BigDecimal(mg).multiply(new BigDecimal("1.0"))+" mcg");
				textField_6.setText(new BigDecimal(mg).multiply(new BigDecimal("0.000000000157473"))+" st");
				textField_5.setText(new BigDecimal(mg).multiply(new BigDecimal("0.000000002204623"))+" lb");
				textField_4.setText(new BigDecimal(mg).multiply(new BigDecimal("0.00000003527396"))+" oz");
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(frame , "Enter Valid Number Only");
				}
			}
			
		});
		btnNewButton8.setFont(new Font("Helvetica", Font.PLAIN, 15));
		btnNewButton8.setBounds(375, 194, 90, 39);
		frame.getContentPane().add(btnNewButton8);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s="";
				
				textField_1.setText(s);
				textField_2.setText(s);
				textField_3.setText(s);
				textField_4.setText(s);
				textField_5.setText(s);
				textField_6.setText(s);
				textField_7.setText(s);
				textField.setText(s);
			}
		});
		btnNewButton.setFont(new Font("Helvetica", Font.PLAIN, 15));
		btnNewButton.setBounds(273, 365, 126, 39);
		frame.getContentPane().add(btnNewButton);
	}
}
