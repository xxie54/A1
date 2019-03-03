import java.util.Scanner;


public class assignment1 {



	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
 
		//Decide the number of friends
		System.out.print("How long will the array be? ");
		int numOfArray = Integer.parseInt(scan.nextLine());
 
		




		//Create a string array to store the names of your friends
		String arrayOfNames[] = new String[numOfArray];


		for (int i = 0; i < arrayOfNames.length; i++) {
			System.out.print("Enter a number " + (i+1) + " : ");
		        arrayOfNames[i] = scan.nextLine();
		}
		    
		//Now show your friend's name one by one
		for (int i = 0; i < arrayOfNames.length; i++) {
			System.out.print("The number you enter are  " + (i+1) + " : ");
		        System.out.print(arrayOfNames[i] + "\n");
		}
		  
 
		    
 
	}
 
}
