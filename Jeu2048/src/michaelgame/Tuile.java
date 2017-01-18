package michaelgame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


import javax.swing.JFrame;

public class Tuile extends JFrame{
	//VARIABLES
	private int valeur; 
	int score; 
	Tuile tuile = new Tuile();
	Game g = new Game();
	boolean gagne = false; 
	boolean perdu = false;
	public static final int SIZE = 4;
	private Tuile[][] tuiles = new Tuile[SIZE][SIZE];
	
	public Tuile(){
		this(0);
	}
	
	//CONSTRUCTEUR
	public Tuile(int valeur) {
		this.valeur = valeur;
	}
	//SETTTERS
	public void setValue(int valeur){
		this.valeur = valeur;
	}
	//GETTERS
	public int getValeur(){
		return valeur;
	}
	public Game getGame()
	{
		return this.g;
	}
	
	public void gagne(){
		if(score == 2048){
			gagne = true; 
		}else{
			perdu = true;
		}
	}
	 public void bouger()
	 {
			
			 }	
	}
	 
	
			