package Main;

import javax.swing.SwingUtilities;

import GUI.DangNhapForm;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                new DangNhapForm().setVisible(true);
	            }
	        }
	        );
	}

}
