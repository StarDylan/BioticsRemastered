package Game.Helper;

import Game.Biotic;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Trigger{

   private String trigger;



   //Returns whether a given Biotic matches the parameters
   public boolean equals(Biotic currentBiotic, Biotic otherBiotic) {
      ArrayList<String> triggers = new ArrayList<>();

      //Separates Tokens with a underscore (_)
      StringTokenizer andTokens = new StringTokenizer(trigger, "_");
      while (andTokens.hasMoreTokens()) {
         String andToken = andTokens.nextToken();

         triggers.add(andToken);
      }

      //Goes through the AND statements
      for (String property : triggers) {

         //Checks if an IF
         StringTokenizer tokenizer = new StringTokenizer(property, ":");
         String token = tokenizer.nextToken();
         if (token.equals("IS"))

            //Check for Color Here

            //Will Run against properties of other biotic
            switch (tokenizer.nextToken()) {
               //Check the IS statement to see if true for which in the list.
               //If False, return false, if true, don't do anything

               //Example
            }
         else {
            //Test about self properties
            switch (token) {
               //If it is true, return the other biotic list, else return a blank list
            }
         }
      }
      return true;
   }
}

