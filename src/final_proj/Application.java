package final_proj;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import final_proj.Application;
import final_proj.Login;

public class Application extends JFrame{
	JPanel p;
	public Application()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		p=new Login(this);
		add(p);
		pack();
		setVisible(true);
		setLocationRelativeTo(null); //locate based to width & height
	}	//function load jpanel- swiche screen
	public void changePanel(JPanel p)
	{
		invalidate();
		setVisible(false);
		getContentPane().removeAll();
		this.p = p;
		add(p);
		pack();
		setLocationRelativeTo(null); //locate based to width & height
		validate();
		setVisible(true);
	}
	
	public static void main(String[] args) {
			SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					new Application();
				}
			});
	}
}