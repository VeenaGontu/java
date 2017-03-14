import javax.swing.JFrame;
import javax.swing.JLabel;



public class Window {
	public static void main(String[] args) {
		
		int b = 5;
		JFrame window = new JFrame();
		window.setSize(800, 900);
		window.setVisible(true);
		window.setTitle("Veena's window");
		
		JLabel label = new JLabel();
		
		label.setText(" My Label");
		window.add(label);
		
	}
	

}
