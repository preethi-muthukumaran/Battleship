
public class Board {
	
	//x axis boundary variables
	//to be used in the attacker method of player and opponnent
	//or need to be used in conjunction with the mouse get method
	
	int x0;
	int x1;
	int x2;
	int x3;
	int x4;
	int x5;
	int x6;
	int x7;
	int x8;
	int x9;
	int x10;
	
	//y axis boundary variables
	//to be used in the attacker method of player and opponnent
	//need to be used with mouse get method
	
	int y0;
	int y1;
	int y2;
	int y3;
	int y4;
	int y5;
	int y6;
	int y7;
	int y8;
	int y9;
	int y10;
	

	
	//Board constructor - Default Only -- takes in 2d array
	public Board(boolean[][] theBoard){
		x0 = 0;
		x1 = 100;
		x2 = 200;
		x3 = 300;
		x4 = 400;
		x5 = 500;
		x6 = 600;
		x7 = 700;
		x8 = 800;
		x9 = 900;
		x10 = 1000;
		
		y0 = 0;
		y1 = 100;
		y2 = 200;
		y3 = 300;
		y4 = 400;
		y5 = 500;
		y6 = 600;
		y7 = 700;
		y8 = 800;
		y9 = 900;
		y10 = 1000;
		
		//setup the bool board - initialize everything to false
		theBoard = new boolean[10][10];
		for(int r = 0; r < 10; r++){
			for(int c = 0; c<10; c++){
				theBoard[r][c] = false;
			}
		}
	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
