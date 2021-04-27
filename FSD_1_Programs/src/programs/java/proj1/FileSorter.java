package programs.java.proj1;

import java.io.*;

public class FileSorter {
	public static void FileNameSort() {
		//1. Identify files
		//2. Sort files
		File f1 = new File(".");
		String fileArr[] = f1.list();
		for(int i = 0; i < fileArr.length; i++) {
			System.out.println(fileArr[i]);
		}
	}
}
