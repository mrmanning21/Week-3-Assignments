
public class Box {

		//Declaring my instance variable.
		int size = 0;
		
	//Creating printBox method.
	public void printBox() {

		//Setting my x,y column/row loops and printing stars that space.
		for(int x = 0; x < size; x++) {

		for(int y = 0; y < size; y++) 

		System.out.print("*");
		System.out.println();
	}
}

	//Bringing back in the main method to invoke printBox and size.
	public static void main(String[] args) {

		//object creation.
		Box starBox = new Box();

		//Size listed using dot operator.
		starBox.size = 5;

		starBox.printBox();
	}

}