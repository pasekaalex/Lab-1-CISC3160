import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

class Artist
{
   //store artist info
   String artistName;
   int stream;
   //constructor
   public Artist(String na, int st)
   {
       artistName = na;
       stream = st;
   }
  
   //return stream
   public int getStrem()
   {
       return stream;
   }
  
   //override returning artist info
   public String toString()
   {
       return "\n Artist Name: " + artistName + "\t Stream: " + stream;
   }
}
//
public class spotifyproblem
{

   //read file contents and store in array
   static void readFile(ArrayList<Artist> artist)
   {
       Scanner sc = null;
       try
       {
           //scanner
    	   //had to copy the contents of the csv into a text file 
    	   //because its not possible to split the strings up 
    	   //due to ',' appearing in additional artists featured on the track
           sc = new Scanner(new File("src/data.txt"));
           sc.nextLine();
           sc.nextLine();
           while(sc.hasNext())
           {
               String data = sc.nextLine();
               //split with comma
               String[] record = data.split(",");
               //use constructor to create object and add to list
               artist.add(new Artist(record[2], Integer.parseInt(record[3])));
           }
           //close file
           sc.close();
       }
       catch(FileNotFoundException e)
       {
           System.out.println("Error: File Not Found.");
           e.printStackTrace();
       }        
   }
   //display arraylist
   static void show(ArrayList<Artist> artist) throws FileNotFoundException
   {
       //count total streams
       double total = 0;
       PrintWriter writer = new PrintWriter(new File("src/output.txt"));
	for(int c = 0; c < artist.size(); c++)
       {
           //addup total streams
           total += artist.get(c).getStrem();
           System.out.print(artist.get(c));
           writer.print(artist.get(c));
       }
      
       //average streams
       System.out.printf("\n\n Average Stream: %.2f", (total / artist.size()));
       writer.printf("\n\n Average Stream: %.2f", (total / artist.size()));
       writer.close();
   }
   //main
   public static void main(String []s) throws FileNotFoundException
   {
       ArrayList<Artist> artist = new ArrayList<Artist>();
       readFile(artist);
       show(artist);
   }
}