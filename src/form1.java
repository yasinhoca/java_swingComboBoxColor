import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class form1 extends JFrame {

	private JPanel contentPane;
	DefaultComboBoxModel rmodel = new DefaultComboBoxModel();
	DefaultComboBoxModel gmodel = new DefaultComboBoxModel();
	DefaultComboBoxModel bmodel = new DefaultComboBoxModel();
	int r,g,b,secim;
	private JTextField textfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form1 frame = new form1();
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
	public form1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		for(int i=0;i<256;i++) rmodel.addElement(i);
		for(int i=0;i<256;i++) gmodel.addElement(i);
		for(int i=0;i<256;i++) bmodel.addElement(i);
		
		JComboBox cred = new JComboBox();
		cred.setModel(rmodel);
		cred.setFont(new Font("Tahoma", Font.BOLD, 18));
		cred.setBackground(Color.RED);
		cred.setBounds(139, 24, 89, 35);
		contentPane.add(cred);
		
		JComboBox cgreen = new JComboBox();
		cgreen.setModel(gmodel);
		cgreen.setFont(new Font("Tahoma", Font.BOLD, 18));
		cgreen.setBackground(Color.GREEN);
		cgreen.setBounds(238, 24, 89, 35);
		contentPane.add(cgreen);
		
		JComboBox cblue = new JComboBox();
		cblue.setModel(bmodel);
		cblue.setFont(new Font("Tahoma", Font.BOLD, 18));
		cblue.setBackground(Color.BLUE);
		cblue.setBounds(337, 24, 89, 35);
		contentPane.add(cblue);
		
		JButton button = new JButton("BUTTON");
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button.setBounds(10, 163, 127, 46);
		contentPane.add(button);
		
		JLabel label = new JLabel("LABEL");
		label.setOpaque(true);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(157, 160, 102, 52);
		contentPane.add(label);
		
		textfield = new JTextField();
		textfield.setText("TextField");
		textfield.setFont(new Font("Tahoma", Font.BOLD, 18));
		textfield.setBounds(289, 163, 114, 36);
		contentPane.add(textfield);
		textfield.setColumns(10);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Button", "Label", "TextField"}));
		comboBox.setBounds(10, 24, 102, 35);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Mehmet Yasin \u00D6zsa\u011Flam");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNewLabel.setBounds(272, 239, 154, 24);
		contentPane.add(lblNewLabel);
		
		r = g = b = secim = 0;
		
		
		cred.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				r = (int) cred.getSelectedIndex();
				secim = (int) comboBox.getSelectedIndex();
				if(secim==0) {
					button.setBackground(new Color(r,g,b));
				} else if(secim==1) {
					label.setBackground(new Color(r,g,b));
				} else if(secim==2) {
					textfield.setBackground(new Color(r,g,b));
				} 
				
			}
		});
		
		cgreen.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				g = (int) cgreen.getSelectedIndex();
				secim = (int) comboBox.getSelectedIndex();
				if(secim==0) {
					button.setBackground(new Color(r,g,b));
				} else if(secim==1) {
					label.setBackground(new Color(r,g,b));
				} else if(secim==2) {
					textfield.setBackground(new Color(r,g,b));
				} 
				
			}
		});
		
		cblue.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				b = (int) cblue.getSelectedIndex();
				secim = (int) comboBox.getSelectedIndex();
				if(secim==0) {
					button.setBackground(new Color(r,g,b));
				} else if(secim==1) {
					label.setBackground(new Color(r,g,b));
				} else if(secim==2) {
					textfield.setBackground(new Color(r,g,b));
				} 
				
			}
		});
		
	}

}
