package michaelgame;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Main extends JFrame{
	
	public static void main(String[] args){
		
		JFrame game = new JFrame();
		Game g = new Game();

	
		g.setTitle("JEU 2048");
		
		g.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		g.setSize(1000,1000);
		
		g.setResizable(true);
		g.setVisible(true);

		g.Tableau();
		
		for (int x = 0; x < 3; x++){
			g.Ajouternombre();
		}
		g.Tableau();
		
		for (int x =0; x < 3; x++){
			g.Ajouternombre();
			g.Tableau();
			g.haut();
			
			g.Tableau();
			g.Ajouternombre();
			g.Tableau();
			g.bas();
			
			g.Tableau();
			g.Ajouternombre();
			g.Tableau();
			g.gauche();
			
			g.Tableau();
			g.Ajouternombre();
			g.Tableau();
			g.droite();
			
			g.Tableau();
		}
	}
	
}
