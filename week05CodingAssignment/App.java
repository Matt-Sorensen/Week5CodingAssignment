package week05CodingAssignment;

public class App {

	public static void main(String[] args) {

		Logger question4 = new AsteriskLogger();
		
		question4.Log("Banana");
		
		System.out.println();
		
		
		Logger question5 = new AsteriskLogger();
		
		question5.Error("Banana");

		System.out.println();

		
		
		Logger question6 = new SpacedLogger();
		
		question6.Log("Banana");
		
		System.out.println();

		
		
		Logger question7 = new SpacedLogger();
		
		question7.Error("Banana");
		
		
		


	}

}
