package Helper;

import javax.swing.JOptionPane;

public class Helper {

		public static void showMsg(String str) {
			String msg;
			
			switch(str) {
			case "fill":
				msg = "Please fill in the all fields...";
				break;
			case "success":
				msg = "Success...";
				break;
			default:
				msg = str;
			}
			JOptionPane.showMessageDialog(null, msg, "Mesaj", JOptionPane.INFORMATION_MESSAGE);
		}
		
		public static boolean confirm(String str) {
			String msg;
			switch(str){
			case "sure":
				msg = "Are you sure for this process?";
				break;
			default:
				msg = str;
				break;
			}
			int res = JOptionPane.showConfirmDialog(null, msg, "Attention", JOptionPane.YES_NO_OPTION);
			if(res == 0) {
				return true;
			}else {
				return false;
			}
		}
}
