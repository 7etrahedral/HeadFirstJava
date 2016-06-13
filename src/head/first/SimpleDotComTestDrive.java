package head.first;

public class SimpleDotComTestDrive {
	
	public static void main(String[] args) {
		int numOfGuessses = 0;
		GameHelper helper = new GameHelper();
		
		SimpleDotCom dot = new SimpleDotCom();
		int randomNum = (int) (Math.random() * 5);
		
		int[] locations = {randomNum, randomNum+1, randomNum+2};
		dot.setLocationCells(locations);
		boolean isAllive  = true;
		
		while(isAllive == true) {
			String userGuess = helper.getUserInput("enter a number");
			String result = dot.checkYourself(userGuess);
			numOfGuessses++;
		
			if (result.equals("kill")) {
				isAllive = false;
			System.out.println("you took " + numOfGuessses + " guesses");
			}
		}
	}

}
