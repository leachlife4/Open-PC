import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine())
			System.out.println(sc.nextLine() + "                     " );
				
		BufferedWriter out = new BufferedWriter(new FileWriter("blarg.txt"));
		out.write("asfsdaf");
		out.close();
		
		Runtime.getRuntime().exec("touch asdf");
	}
}
