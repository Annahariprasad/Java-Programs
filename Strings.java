
public class Strings {

	public static void main(String[] args) {
				
				//Note : String are Immutable or UnChangable.
				
				String message = "  Hello World"; //This is a String
				
				String message1 = "Annahari" + "!!"; //We Can add Strings
				
				System.out.println("This is a Message : " + message); //We printing the string
				
				System.out.println("This is My Name : " + message1); //We printing the string
				
				System.out.println("This is the length of the string : " + message1.length());//returns the length of the string
				
				System.out.println("Checking the string ends with specific character : " + message1.endsWith("!!"));//if its true or false
				
				System.out.println("Here We replacing the character in the string : " + message1.replace("!!","**"));//Replace the word or character in the string 
				
				System.out.println("Checking the index of a character : " + message1.indexOf("h"));//returns the index of a character or word
				
				System.out.println("Changing the string into UpperCase : " + message1.toUpperCase());//changing the string into uppercase
				
				System.out.println("Changing the string into LowerCase : " + message1.toLowerCase());//changing the string into lowercase
				
				System.out.println("We removing the spaces in the string : " + message.trim());//trim is used to removing the spaces in the strings
				
	}

}
