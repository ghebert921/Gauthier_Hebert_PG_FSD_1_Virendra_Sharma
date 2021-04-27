package programs.java.proj1;

import java.io.*;
import java.lang.System;
import java.util.Scanner;

public class Application {
	
	 public static void main(String args[]) throws IOException {
		 System.out.println("Welcome To LockedMe.com");
		 System.out.println("Please select one of the following three options:");
		 System.out.println("1: View current files");
		 System.out.println("2: Add, delete, or search files");
		 System.out.println("3: Close Application");
		 System.out.print("Please press 1, 2, or 3 corresponding to the respective option: ");
		 Scanner option = new Scanner(System.in);
		 int optionInt = option.nextInt();
		 while(optionInt != 3) {
			 if(optionInt == 1) {
				 FileSorter.FileNameSort();
			 }
			 if(optionInt == 2) {
				 BusinessOperations.BusinessOptions();
			 }
			 if(optionInt == 3) {
				 break;
			 }
			 System.out.println("Welcome To LockedMe.com");
			 System.out.println("Please select one of the following three options:");
			 System.out.println("1: View current files");
			 System.out.println("2: Add, delete, or search files");
			 System.out.println("3: Close Application");
			 System.out.print("Please press 1, 2, or 3 corresponding to the respective option: ");
			 Scanner newOption = new Scanner(System.in);
			 optionInt = newOption.nextInt();
		 }
}
}