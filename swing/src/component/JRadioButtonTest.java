package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JRadioButtonTest extends JFrame implements ItemListener{

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioButtonTest frame = new JRadioButtonTest();
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
	public JRadioButtonTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("\uC120\uD0DD\uD55C \uC560\uC644\uB3D9\uBB3C\uC740?");
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JRadioButton rdo1 = new JRadioButton("\uACE0\uC591\uC774");
		rdo1.addItemListener(this);
		contentPane.add(rdo1);
		
		JRadioButton rdo2 = new JRadioButton("\uAC15\uC544\uC9C0");
		rdo2.addItemListener(this);
		contentPane.add(rdo2);
		
		JRadioButton rdo3 = new JRadioButton("\uD584\uC2A4\uD130");
		rdo3.addItemListener(this);
		contentPane.add(rdo3);
		
		JRadioButton rdo4 = new JRadioButton("\uD1A0\uB07C");
		rdo4.addItemListener(this);
		contentPane.add(rdo4);
		
		JRadioButton rdo5 = new JRadioButton("\uACE0\uC2B4\uB3C4\uCE58");
		rdo5.addItemListener(this);
		contentPane.add(rdo5);
		
		
		//여러개중 하나만 선택하게 하려면, 버튼을 그룹으로 잡아야 함
		ButtonGroup group = new ButtonGroup();
		group.add(rdo1);
		group.add(rdo2);
		group.add(rdo3);
		group.add(rdo4);
		group.add(rdo5);
		
	
	}

	@Override
	//선택과 해제가 일어나기 때문에 두번 일어남
	public void itemStateChanged(ItemEvent e) {
	JRadioButton radio = (JRadioButton) e.getItem();
	textField.setText(radio.getText());
	
		
	}

}
