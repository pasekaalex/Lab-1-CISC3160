package weatherproblem;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Converter {

		public static void main(String[] args) throws FileNotFoundException {
			//read week file, convert from F to C then C to F, and output to file
			float tempweek;
			Scanner week = new Scanner(new File("src/weatherweek.txt"));
			PrintWriter weekwriter = new PrintWriter(new File("src/weekconvert.txt"));
			int dayweek = 1;
			week.nextLine();
			while(week.hasNextLine()) {
				String weekread;
				weekread = week.nextLine();
				tempweek = Float.parseFloat(weekread);
				weekwriter.print("Fahrenheint for the date of December ");
				weekwriter.print(dayweek);
				weekwriter.print(" : ");
				weekwriter.print(tempweek);
				weekwriter.println();
				tempweek = ((tempweek - 32)*5)/9;
				weekwriter.print("Converted to Celsius for the date of December ");
				weekwriter.print(dayweek);
				weekwriter.print(" : ");
				weekwriter.print(tempweek);
				weekwriter.println();
				tempweek = ((tempweek*(9/5))+32);
				weekwriter.print("Converted back to Fahrenheint for the date of December ");
				weekwriter.print(dayweek);
				weekwriter.print(" : ");
				weekwriter.print(tempweek);
				weekwriter.println();
				weekwriter.println();
				dayweek++;
			}
			week.close();
			weekwriter.close();
		}
}

