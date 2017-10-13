import java.util.Scanner;

public class TheFreeWalfsons {
	public static void main(String[] args) {
		System.out.println("You cautiously enter through the large oak doors to a dark stone-laden hallway.");
		System.out.println("There you notice a ragged old wolf with piercing eyes");
		
		WalfShaman myShaman = new WalfShaman();
		myShaman.greetings();
		
		WalfTailor myWalfTailor	= new WalfTailor();
		myWalfTailor.measurementsTalk();
	}
}
