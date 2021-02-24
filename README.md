# Lab-1-CISC3160
Lab  1 - Spotify chart, weather conversion, api endpoint

1) Reporting
I downloaded the CSV file for the top 200 spotify songs during the week of 05/28/2020 globally. There was a persistent issue of having a difficulty splitting the columns into a string array due to recurring commas in featured artists on song names. The csv file is encoded to prevent editing plays. There was honestly no way around this. I had to copy the contents to a text file and edit out the commas in the featured artists. 

I wrote the code in java due to familiarity and past experience with reading and sorting files. I made an Artist class that is structured to hold the artist name and the amount of song plays. When the program is executed it reads the data.txt that was made from the original data.csv, skipping the first two lines then a while loop reads each line and splits it by the commas between number on list, song name, artist name, plays, and link to spotify. It makes a string array of five spots or rather [4] and saves the third[2] and fourth[3] elements of the array as the two variables for the artist class. Then the override for the toString method makes it print out the output in a structured manner. 

The main method makes an array for the artist object then reads the file directly into the array and then outputs it.  It also writes it to a file. It uses the show method to output the structured sorted list.  

2) Math calculations
I made two text files. The first line states the month and year (december 2020 in this case) and it is skipped. The weatherweek.txt has a week of temps while weathermonth.txt has all 31 days. I used Java for this as it seemed simple enough to read a file and convert it and write it to another file in a structured manner. I used a weather history website to get the highest temp for each day that month. 

Converter.Java processes the week data while ConverterMonth.java processes the month file. They both use a scanner to read the file in a while loop while using a printwriter to write the conversion output to a new file. This was simple to do but tedious to write out very primitively. An inputstream probably would've been better than using the scanner but the output is the same. 

3) Web Development
Make a request on an API endpoint (Nasa’s pic of the day) and display contents.
I used javascript because of NodeJs’ ability to easily send requests to API endpoints. I got a personal API key from https://api.nasa.gov/#apod. I also used JsFiddle, an online IDE for HTML, CSS, and JavaScript. With some simple html formatting and the request on the NASA API. It displays a webpage that has the  contents. The date, followed by the image, followed by a block of informational text. 
I’m not sure how this could have been easier, but it would’ve been harder without JsFiddle because then I would have to host my own node.js server to get the request info. 
