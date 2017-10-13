import java.util.Scanner;

public class WalfShaman {
	public void greetings() {
		
		Scanner input = new Scanner(System.in);
		
		// Input name
		System.out.println("\nYour name... TELL ME YOUR NAME!!");
		String name = input.next();
		
		// Response #1
		System.out.println("\nWeeehhhlcome,  " + name + ".  Welcome.");
		
		System.out.println("\n\t1 Greetings, esteemed Shaman");
		System.out.println("\t2 What yo name be, ya dirty old fox?!");
		int aResponse = input.nextInt();
		System.out.print("\n");
		
		if (aResponse == 1){
			System.out.println("White Fang smiles upon you.");
		} else if (aResponse == 2){
			System.out.println("WHA- NEVER IN A THOUSAND MOONS...");
		}
			
		// Response #2
		System.out.println("I... am ANTHONY! Wizard of wolfery and mouthpiece of His Toothfulness\n");
		
		System.out.println("\t1 May the moonlight ever guide his claw");
		System.out.println("\t2 Lawrence, my man. " + name + "'s just here for the rabbit.");
		int bResponse = input.nextInt();
		System.out.print("\n");
		
		if (bResponse == 1){
			System.out.println("QUIT YOUR SNOVELING " + name + "!  You boy!  A true Walfson knows his place, yet SPEAKS HIS MIND!");
		} else if (bResponse == 2){
			System.out.println("Ahhhhh. Brutish, yet forthright. Hrmm, you may just rise quickly in this order " + name + ", my boy.");
		}
		
		// Hallway
		System.out.println("Pass through these dangly beads and go see the tailor for fitting down the hall");
		System.out.print("\n");
		
		System.out.println("\t1 Shuffle down the hallway meekly");
		System.out.println("\t2 Pee on Anthony's robe and boulder down the hallway");
		int cResponse = input.nextInt();
		System.out.print("\n");
		
		if (cResponse == 1){
			System.out.println("Anthony pees on you as you go");
		} else if (cResponse == 2){
			System.out.println("Angrily, Anthony casts a spell on you as you run away significantly widening the size of your haunches...");
			System.out.println("This could be trouble");
		}
		
		System.out.print("\n");
		}
}
