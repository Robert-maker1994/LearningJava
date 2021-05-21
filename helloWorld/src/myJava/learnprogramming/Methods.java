package myJava.learnprogramming;

public class Methods {
	
	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
	    System.out.println("Your final score was " + highScore);
	
	    int highScorePosistion = calculateHighScorePosition(1500);
	    displayHighScorePostition("from", highScorePosistion) ;
	
	    highScorePosistion = calculateHighScorePosition(500);
	    displayHighScorePostition("liam", highScorePosistion) ;
	    
	    highScorePosistion = calculateHighScorePosition(200);
	    displayHighScorePostition("bob", highScorePosistion) ;
	
	
	}
		
		
		public static int calculateScore(boolean gameOver,
				int score, int levelCompleted, int bonus) {
			
			if (gameOver) {
				int finalScore = score + (levelCompleted * bonus);
				finalScore += 1000;
				return finalScore ;
			} else {
				return -1;
			}
		}
		public static void displayHighScorePostition(String name,int scoreTable) {
			System.out.println( name + "I'm in position  " +  scoreTable);
		}
		public static int calculateHighScorePosition( int score) {
 
					if (score > 1000) {
					return  1;
					} else if (score > 500 && score < 1000) {
						return 2;
					} else if (score > 100 && score < 500) {
						return 3;
					} else {
						return 4;
					}
		}
	}
