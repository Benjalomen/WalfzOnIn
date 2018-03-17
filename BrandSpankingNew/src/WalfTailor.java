import java.util.Scanner;

public class WalfTailor {

	private Scanner input;

	public void measurementsTalk() {
		
		// gd
		Scanner input = new Scanner(System.in);
		
		//collect haunch measurement
		System.out.println("\"Now that you stand among our prestigious ranks, those old rags will never do!\nyou'll have to be fitted for your wolf club trousers.\nHow wide are your haunches, my friend? measured in wolf cubits, of course!\"");
		int haunchwidth = input.nextInt();
		if (haunchwidth == 4 || haunchwidth == 6) {
			System.out.println("\"These are appropriate proportions for a wolf club initiate.");
		} else if (haunchwidth < 4 || haunchwidth > 6) {
			System.out.println("\"Such horrendous proportions! You are a FREAK fit for a walfing sideshow!!");
		} else if (haunchwidth == 5) {
			System.out.println("\"YOUR BODY IS A MASTAPIECE!");
		}
		//collect tail diameter
		System.out.println("Now, for your tail's Diameter. please use the offical walf metric for tail measurement.\"\n\nYou observe the official Wolf club tail measurement placard. \n Frankfurter, Garden Hose, or Baseball Bat?");
		String tailDiameter = input.next();
		if (tailDiameter.equals("Frankfurter")) {
			System.out.println("The tailor snickers, and you are filled with jealousy at the girth of her tail");
		} else if (tailDiameter.equals("Garden")) {
			System.out.println("\"Very impressive.\"");
		} else if (tailDiameter.equals("Baseball")) {
			System.out.println("\"Gracious! What a Tail!\"");
		}
		if (haunchwidth < 4 || haunchwidth > 6) {
				System.out.println("\"I'm afraid that because of your... irregular body type... It will take some time \nfor me to customize your trousers. in the mean time, take this.\"\n\n You have recieved Wolf Club Loin Cloth");
		} else if (haunchwidth == 4 || haunchwidth == 6) {
			System.out.println("The tailor takes a pair of trousers from a nearby shelf and places them on the counter in front of you.\n\"These should suit you just fine!\" \n\n You Have recieved Standard Issue Walf Trousers");
		} else if (haunchwidth == 5) {
			System.out.println("\"Your proportions are described in the ancient prophecies. Take these, and weild their power with great caution!\"\n\n You have recieved Ancient Golden Walf Pants");
		}
	}	
}
