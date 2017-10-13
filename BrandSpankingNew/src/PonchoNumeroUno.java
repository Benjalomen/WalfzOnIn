import java.util.Scanner;

public class PonchoNumeroUno {
	public static void main(String[] arg){
		// Declare Scanner
		Scanner input = new Scanner(System.in);
				
		// Start your conversation
		formalGreeting("Gregory");
		System.out.println("What three pesky numbers do you want to add?");
		
		int firstNumber = input.nextInt();
		int secondNumber = input.nextInt();
		int thirdNumber = input.nextInt();
		
		System.out.println("The answer is " + combineWithMath(firstNumber, secondNumber, thirdNumber));
	}
	
	public static void formalGreeting(String name){
		System.out.println("Why hello there my dear " + name);
	}
	
	public static int combineWithMath(int first, int second, int third){
		int answer = first + second + third;
		return answer;
	}
	
}