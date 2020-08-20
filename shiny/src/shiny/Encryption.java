package shiny;


import java.util.*;
import java.io.*;

public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.print("enter a file input");
			Scanner input =new Scanner(System.in);
			String data=input.nextLine();
			File file=new  File(data);
			
			
			
			System.out.print("==encryption==");
			String password="shalini";
			System.out.println(password);
			String encryptedString=getEncodedString(password);
			System.out.println(encryptedString);
			
			
			System.out.println("==decryption==");
			String decryptedString=getDecodeString(encryptedString);
			System.out.println(decryptedString);
		}
	private static String getDecodeString(String encryptedString) {
		return new String(Base64.getMimeDecoder().decode(encryptedString));

	}

	private static String getEncodedString(String password) {
		return Base64.getEncoder().encodeToString(password.getBytes());	



	}

}
