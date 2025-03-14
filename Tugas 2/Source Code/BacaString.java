import java.io.BufferedReader;
import java.io.IOException; 
import java.io.InputStreamReader; 

public class BacaString { 
	public static void main(String[] args) throws IOException { 
		String str;  

		BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));

		System.out.print ("Baca string dan Integer: \n");
		System.out.print("masukkan sebuah string: ");
		str= datAIn.readLine();
		System.out.println ("String yang dibaca : "+ str);
	}
}