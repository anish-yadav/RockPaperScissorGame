import java.util.Scanner;  //importing scanner library  from the util package
public class MajorAssignment {    

	public static void main(String[] args) {

   Scanner sc = new Scanner (System.in);   //creating a Scanner object
   
   System.out.print("Enter encryption key : ");
   int key = sc.nextInt();                //accepting the key from the user via keyboard input
   
   System.out.print("Plaintext-uppercase letters ony : ");
   String text = sc.next();               //accepting the text to be encrypted using keyboard input
   
   int len = text.length();               // calculating the length of the text inputted above
   
   String st = "";                        //declaring a variable to store the ciphertext
   char ch1;                             // decrlaring a variable to store each character of the ciphertext
   
   //Starting the for loop to get each character of the text and to encrypt it
   for(int i = 0 ; i<len;i++)
   {
	int m;   // declaring an integer to  store the ASCII value of the ciphertext characters
	
	char ch = text.charAt(i);          // gets each character of the text to be encrypted             
	int ascii = (int)ch;               //gets the ASCII value of each text
	
	m = ascii+key;                     //gets the ASCII value of the encrypted text 
	
	
	/*Starting an if statement to check whether a character exceeds the limit of UPPERCASE character 
	 * And if it did then return it back from 'A'       */
	
	if(m>91) {
    m = 64+(m-91);
	}
	
	ch1 = (char)m;	     // return the character value from each encrypted ASCII values
	st = st+ch1;        // combines the character to form a string 
	   
   }
   //Display of Ciphertext 
   System.out.println("Ciphertext : "+st);
   System.out.println();
   System.out.println();
   
   //TO DISPLAY THE PLAIN TEXT FOR EACH ENCRYPTION KEY FROM 1 TO 25 
  
   System.out.print("Enter ciphertext-uppercase letters only : ");
   String cipher = sc.next();                // accepts the ciphertext whose plaintext is to be displayed
   
   System.out.println();
   System.out.println();
   System.out.println("Plaintext encryption key form 1 to 25 :");
   String st1=" ";                               //declaring a string to store the plaintext
   char ch2;                                     //declaring a character to store each character of the plaintext
   //Starting a for 
   for(int j = 1; j<=25;j++) {
	   st1 = "";                                 // Substituting the value of plaintext to blank after each key 
	   
	   //start of another for loop to  get the character of the ciphertext and convert it to plaintext
   for(int i = 0 ; i<cipher.length();i++)
   {
	int m;   
	char ch = cipher.charAt(i);
	int ascii = (int)ch;             //gets the ascii values of the cipher text
	m = ascii-j;                    //gets the ascii value of the plain text
	   
	//checks if the ascii value of the character is less than 'A'
	// if found so then starts the count from back i.e. 'Z'
	if(m<65) {
    m = 91-(65-m);
	
		
	}
	ch2 = (char)m;	     //gets each character of the plain text from its ascii values
	st1 = st1+ch2;       //assembles the text to form the string
	   
	   
	   
   }
   System.out.println("key "+j+":plaintext = "+st1);
   }
		
	}

}
