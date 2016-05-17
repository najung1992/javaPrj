package netio.multi.chat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ChatClientWindow extends JFrame implements Runnable {

	private 	Socket socket;	
	private PrintStream nout;
	private Scanner nscan;
	
	//메뉴객체의 구조
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem miExit;
	private JMenu mnTool;
	private JMenuItem miConnect;
	private JMenuItem miSetting;
	
	
	private JButton btnSend;
	private JTextArea txtInput;
	private JTextArea txtOutput;
	private JPanel panel;

	public ChatClientWindow() {

		setSize(370,370);
		getContentPane().setBackground(Color.pink);
		setVisible(true);
		
		addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}
		});
		
		menuBar= new JMenuBar();
		mnFile = new JMenu("File");
		miExit= new JMenuItem("Exit");
		
		mnTool= new JMenu("Tool");
		miConnect = new JMenuItem("Connect");
		miConnect.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			//	JOptionPane.showConfirmDialog(null,"hello");

				try {
					
					socket = new Socket("211.238.142.105",10000);
					
					if(socket.isConnected())
						txtOutput.setText("connected to ");
//					txtInput.setEnabled(true);
					
					InputStream is = socket.getInputStream();
					OutputStream os = socket.getOutputStream();
					
					nscan = new Scanner(is);
					nout= new PrintStream(os,true);
					//자동으로 flush되게 true설정해쥼ㅋ
					new Thread(ChatClientWindow.this).start();
					
									
				} catch (UnknownHostException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
						
			}
		});
		miSetting = new JMenuItem("Setting");
		
		mnFile.add(miExit);
		menuBar.add(mnFile);
		
		mnTool.add(miConnect);
		mnTool.add(miSetting);
		menuBar.add(mnTool);

		setJMenuBar(menuBar);

		panel = new JPanel();
		panel.setLayout(new BorderLayout());

		btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String msg = txtInput.getText();
				
				nout.println(msg);
				/*
				 * //네트워크로 전달
				 * 
				 * if(msg.isEmpty()) { msg = txtInput.getText(); } else { msg +=
				 * "\n" + txtInput.getText(); }
				 * 
				 * txtOutput.setText(msg); txtInput.setText("");
				 */

//				txtOutput.append(txtOutput.getText() + "\n");
//				txtInput.setText("");

			}
		});

		panel.add(btnSend, BorderLayout.LINE_END);
		// this.add(btnSend); //버튼의크기와위치를지정하지않았다

		txtInput = new JTextArea();
		txtInput.setPreferredSize(new Dimension(100, 70));
//		txtInput.setEnabled(false);
		txtInput.setBorder(BorderFactory.createLineBorder(Color.darkGray, 1));

		panel.add(txtInput, BorderLayout.CENTER);

		txtOutput = new JTextArea();
		txtOutput.setEditable(false);
		txtOutput.setBorder(BorderFactory.createLineBorder(Color.darkGray, 1));
		this.add(txtOutput, BorderLayout.CENTER);

		this.add(panel, BorderLayout.PAGE_END);

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true){
			String msg = nscan.nextLine();
			txtOutput.setText(msg);
			
		}
		
	}

}
