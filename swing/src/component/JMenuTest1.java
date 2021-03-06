package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//메뉴만들기
//1. 메뉴바를 만든다
//2. 메뉴를 만들어 메뉴바에 붙인다
//3. 메뉴 아이템을 생성하여 메뉴에 붙인다
//4. 메뉴바를 프레임에 붙인다

public class JMenuTest1 extends JFrame {

	private JPanel contentPane;
	private JLabel imgLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JMenuTest1 frame = new JMenuTest1();
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
	public JMenuTest1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		// 1.메뉴바 만들기
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		// 2.메뉴 만들어 메뉴바에 붙이기
		JMenu screenMenu = new JMenu("Screen");
		menuBar.add(screenMenu);

		JMenuItem load = new JMenuItem("Load");
		load.addActionListener(new MenuActionListener());
		screenMenu.add(load);

		JMenuItem hide = new JMenuItem("Hide");
		hide.addActionListener(new MenuActionListener());
		screenMenu.add(hide);

		JMenuItem reshow = new JMenuItem("ReShow");
		reshow.addActionListener(new MenuActionListener());
		screenMenu.add(reshow);

		JSeparator separator = new JSeparator();
		screenMenu.add(separator);

		JMenuItem exit = new JMenuItem("Exit");
		exit.addActionListener(new MenuActionListener());
		screenMenu.add(exit);

		JMenu editMenu = new JMenu("Edit");
		menuBar.add(editMenu);

		JMenu sourceMenu = new JMenu("Source");
		menuBar.add(sourceMenu);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(contentPane, popupMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("load");
		popupMenu.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("hide");
		popupMenu.add(mntmNewMenuItem_1);
				
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		imgLabel = new JLabel();
		add(imgLabel,BorderLayout.CENTER);
	}

	private class MenuActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			String cmd = e.getActionCommand();

			switch (cmd) {
			case "Load": //이미지 라벨에 아이콘 담은 후 보여주기
				if(imgLabel.getIcon()!=null)
					return;
				
				imgLabel.setIcon(new ImageIcon
						(JMenuTest1.class.getResource("/component/rock.png")));
				
				break;
			case "Hide": //이미지 레이블 숨기기
				imgLabel.setVisible(false);
				break;
			case "ReShow": //이미지 다시 라벨 보여주기
				imgLabel.setVisible(true);
				break;
			case "Exit":
				System.exit(0);//종료하기
				break;
		
			}

		}

	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
