package Game.Helper;

import Game.Biotic;
import Game.Settings;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Trigger{

   private String trigger;

   public Trigger(String trigger){
      this.trigger = trigger;
   }

   /**
    * @param currentBiotic
    * @param otherBioticList
    * @return
    */
   //Returns whether a given Biotic matches the parameters
   public ArrayList<Biotic> filter(Biotic currentBiotic, ArrayList<Biotic> otherBioticList) {
      ArrayList<String> triggers = new ArrayList<>();

      ArrayList<Biotic> filteredBiotics = new ArrayList<>();

      //Separates Tokens with a underscore (_)
      StringTokenizer andTokens = new StringTokenizer(trigger, "_");
      while (andTokens.hasMoreTokens()) {
         String andToken = andTokens.nextToken();

         triggers.add(andToken);
      }

      //Goes through the AND statements
      for (String property : triggers) {
         //Goes Through the List of Biotics
         for (Biotic otherBiotic : otherBioticList) {
            //Checks if it is within vision
            if(currentBiotic.distance(otherBiotic) > Settings.VISION_RADIUS){
               continue;
            }
            //Checks if an IF
            StringTokenizer tokenizer = new StringTokenizer(property, ":");
            String token = tokenizer.nextToken();
            if (token.equals("IS"))

               //Check for Color Here

               //Will Run against properties of other biotic
               switch (tokenizer.nextToken()) {
                  //Check the IS statement to see if true for the current otherBiotic and property.
                  //If False, Don't add it to the new list, if true, add it to filteredBiotics

                  //Example
               }
            else {
               //Test about self properties
               switch (token) {
                  //If it is true, return the other biotic list, else return a blank list
               }
            }
         }
      }
      return filteredBiotics;
   }
}

