package com.techelevator;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
	public class WordSearch{

		public static void main (String[]args){
		int lineNumber = 1;
		Scanner userInput = new Scanner(System.in);
		System.out.print("What is the fully qualified name of the file that should be searched? ");
		String filePath = userInput.nextLine();
		File bookFile = new File(filePath);
		System.out.print("What is the search word you are looking for? ");
		String searchWord =  userInput.nextLine();
		System.out.print("Should the search be case sensitive? (Y/N) : ");
		String caseSensitive = userInput.nextLine();
		boolean isCaseSensitive = caseSensitive.equalsIgnoreCase("Y");
		try {
			Scanner fileInput = new Scanner(bookFile);
			while (fileInput.hasNextLine()){
				String textInLine = fileInput.nextLine();

				String[]splitSentence = textInLine.split(" ");
				for (String s : splitSentence) {
					if (isCaseSensitive) {
						if (s.equals(searchWord)) {
							System.out.println(lineNumber + " " + textInLine);
						}
					} else if (s.equalsIgnoreCase((searchWord))) {
						System.out.println(lineNumber + " " + textInLine);
					}
				}
				lineNumber++;
			}
		} catch (FileNotFoundException e) {
			System.out.println("The file was not found: " + bookFile.getAbsolutePath());
		}
	}
}



















































