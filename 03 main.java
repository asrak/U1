public class main1 {

	public static void main(String[] args)
	{
		char first = new char[255], last = new char[255];
		String input = "";
		int read;
		System.out.println("Enter your first name: ");
		do {
			try {
				read = System.in.read(first, 0, 255);
				input = new String(first, 0, read);
				System.out.print(input);
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		} while(! input.equals("exit"+System.getProperty("line.separator")));
	
		System.out.println("Now enter your last name: ");
		do {
			try {
				read = System.in.read(last, 0, 255);
				input = new String(last, 0, read);
				System.out.print(input);
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		} while(! input.equals("exit"+System.getProperty("line.separator")));
	
		System.out.println("Hello %s %s!\n", first, last);
	}
}
