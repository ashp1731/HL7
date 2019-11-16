package hw12;
import java.io.*;
import java.util.*;

public class Ex14
{
	// Exercise : 12.14 Display numbers in the file, their sum & average
	/* Developer : Ashwini Pradhan
	 * Date : 11/16/2019
	 */
	public static void main(String[]args)
	{
		File scores = new File("Scores.txt");
		int sum = 0;
		try {
			Scanner input = new Scanner(scores);
			ArrayList<Integer> listNumbers = new ArrayList<>();
			int countNumbers = 0;
			while(input.hasNext()) {
				String strNumber = input.next();
				try {
					int number = Integer.parseInt(strNumber);
					countNumbers++;
					listNumbers.add(number);
					sum += number;
				}
				catch (Exception ex) {
					System.out.println(ex);
				}
			}
			double average = sum / countNumbers;
			System.out.println("List of Numbers : " + listNumbers);
			System.out.println("Sum : " + sum);
			System.out.println("Average : " + average);
		}
		catch(FileNotFoundException ex) {System.out.println(ex);}
	}
}