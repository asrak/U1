public class main1 {

	public static void main(String[] args)
	{
		byte name[] = new byte[255];
		String input = "";
		int read;
		do {
			try {
				read = System.in.read(name, 0, 255);
				input = new String(name, 0, read);
				System.out.print(input);
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		} while(! input.equals("exit"+System.getProperty("line.separator")));
    }
}
