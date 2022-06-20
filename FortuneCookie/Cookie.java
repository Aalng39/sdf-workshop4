package FortuneCookie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
public class Cookie {
        // add throws to main method to handle exceptions
        public static void main(String[] args)
            throws IOException
        {
            List<String> listOfStrings = new LinkedList<String>();
            String randomCookie = "";
            // load the data from file
            listOfStrings = Files.readAllLines(Paths.get("cookie_file.txt"));
            // convert arraylist to array
            // String[] array = listOfStrings.toArray(new String[0]);
            // print each line of string in array -> need change to random the array and choose an random one
            // for (String eachString : array) {
                //System.out.println(eachString);
            Random rand = new Random();
                randomCookie = listOfStrings.get(rand.nextInt(listOfStrings.size()));
                System.out.println(randomCookie);
        }
 }

