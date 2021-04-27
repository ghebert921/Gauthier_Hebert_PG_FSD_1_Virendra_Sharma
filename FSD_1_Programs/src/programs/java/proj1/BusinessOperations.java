package programs.java.proj1;

import java.io.*;
import java.lang.System;
import java.util.Scanner;
import java.util.Arrays;

public class BusinessOperations {
	
	
	public static void Add() {
		try {
			System.out.print("Enter the name of the file you wish to add: ");
			Scanner filename = new Scanner(System.in);
			String fileAdd = filename.nextLine();
            File file = new File(fileAdd);
            if (file.createNewFile()) {  
                System.out.println("New File is created!");  
            } else {                   
                if(file.exists())
                {
                    System.out.println("File already exists.");	
                    System.out.println("File path:" + file.getAbsolutePath());
                    System.out.println("File name:  " + file.getName());
                    System.out.println("File class:  " + file.getClass());
                    System.out.println("File parent:  " + file.getParent());
                    System.out.println("File space allocated:  " + file.getUsableSpace());
                    System.out.println("File length: " + file.length());
                    System.out.println("File list:   " + file.list());	                    
                }
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }
	}
	
	public static void Delete() { 
		System.out.print("Enter the name of the file you wish to delete: ");
		Scanner filename = new Scanner(System.in);
		String fileDelete = filename.nextLine();
        File file = new File(fileDelete);
        if(file.delete())
        {
        	System.out.println("Deletion successful");
        }
        else
        {
        	System.out.println("Deletion unsuccessful: File Not Found");
        }	
                
	}
	public static void Search() {
		System.out.print("Enter the name of the file you are searching for: ");
		Scanner filepath = new Scanner(System.in);
		String fileSearch = filepath.nextLine();
		File directory = new File(".");
        String[] flist = directory.list();
        int flag = 0;
        if (flist == null) {
            System.out.println("Empty directory.");
            System.out.println();
        
        }
        else {
            for (int i = 0; i < flist.length; i++) {
                String filename = flist[i];
                if (filename.equalsIgnoreCase(fileSearch)) {
                    System.out.println(filename + " found");
                    System.out.println();
                    flag = 1;
                    try {
                        File myObj = new File(fileSearch);
                        Scanner myReader = new Scanner(myObj);
                        while (myReader.hasNextLine()) {
                          String data = myReader.nextLine();
                          System.out.println(data);
                          System.out.println();
                        }
                        myReader.close();
                      } catch (FileNotFoundException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                      }
                }
            }
        }
  
        if (flag == 0) {
            System.out.println("File Not Found");
            System.out.println();
        }
    }

	public static void BusinessOptions() {
		System.out.println("Welcome to LockedMe.com's Business Operations");
		System.out.println("Please select one of the following four options:");
		System.out.println("1: Add files");
		System.out.println("2: Delete files");
		System.out.println("3: Search files");
		System.out.println("4: Exit to homepage");
		System.out.print("Please press 1, 2, 3, or 4 corresponding to the respective option: ");
		Scanner option = new Scanner(System.in);
		int optionInt = option.nextInt();
		while(optionInt != 4) {
			 if(optionInt == 1) {
				 Add();
			 }
			 if(optionInt == 2) {
				 Delete();
			 }
			 if(optionInt == 3) {
			 	 Search();
			 }
			 if(optionInt == 4) {
				 break;
			 }
			 System.out.println("Welcome to LockedMe.com's Business Operations");
			 System.out.println("Please select one of the following four options:");
			 System.out.println("1: Add files");
			 System.out.println("2: Delete files");
			 System.out.println("3: Search files");
			 System.out.println("4: Exit to homepage");
			 System.out.print("Please press 1, 2, 3, or 4 corresponding to the respective option");
			 Scanner newOption = new Scanner(System.in);
			 optionInt = newOption.nextInt();
		}
}
}