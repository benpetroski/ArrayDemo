
public class Array {

	public static void main(String args[]) {
		String[] favoriteThings = new String[3];
		
		favoriteThings[0] = "Playing";
		favoriteThings[1] = "Eating";
		favoriteThings[2] = "Sleeping";
		
		for (int i = 0; i<favoriteThings.length; i++) {
			System.out.print(i+1+". ");
			System.out.println(favoriteThings[i]);
		}
	}

}
