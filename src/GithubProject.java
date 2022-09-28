import java.util.Scanner;
public class GithubProject {

public static void main(String[] args) {	

		//Hi guys, you can add your comments here: 
		
		// Viktória Szabó's comment
		// Sujan Tiwari's commnet
		// Susha Andrei's comment
		// Tiainen Jenina's comment		
		
		int i, j, rows;
		 Scanner myObj = new Scanner(System.in);
		 System.out.println("How many rows?");
		 rows = myObj.nextInt();
		    
		 for (i=0; i<rows; i++) {  
		 for (j=(rows-i-2); j>=0; j--) {  
		 System.out.print(" ");   
		 }   
		 for (j=0; j<=i; j++ ) {   
		 System.out.print("*");   
		 }   
		 System.out.println();   
		 } 		
	}

}
