package week05CodingAssignment;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String Log) {
		StringBuilder string = new StringBuilder();
		
		for (int i = 0; i < Log.length(); i++) {
			if (i > 0) {
				string.append(" ");
			}
			
		string.append(Log.charAt(i));
		
		}
		System.out.println(string.toString());
	}

	@Override
	public void Error(String Error) {
			StringBuilder string = new StringBuilder();
			
			for (int i = 0; i < Error.length(); i++) {
				if (i > 0) {
					string.append(" ");
				}
				
			string.append(Error.charAt(i));
			
			}
			System.out.println("ERROR: " + string.toString());
		
		
	}
	
	

}
