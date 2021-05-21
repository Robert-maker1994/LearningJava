package myJava.learnprogramming;

public class ConditonalLogic {
//	public static void main(String[] /*args*/) {
//		
//		
//		boolean isAlien = false; 
//			if (isAlien == false) {
//			System.out.println("it is not an alien");
//			}
//			
//			
//			int topScore = 100;
//			if (topScore > 100) {
//				System.out.println("Hello");
//			}
//	}
public static void main(String[] args) {
	boolean gameOver = true;
	int score = 800;
	int levelCompleted = 5;
	int bonus = 100;
	
	
	if (gameOver) {
		int finalScore = score =(levelCompleted * bonus);
		System.out.println("The fina score was  " + finalScore);
	}

}

}
