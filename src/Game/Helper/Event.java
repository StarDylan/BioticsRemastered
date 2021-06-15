package Game.Helper;

import Game.Biotic;


import java.util.ArrayList;

/**
 *
 */
public class Event {
   private ArrayList<Trigger> triggers = new ArrayList<>();
   private String action;
   private Biotic currentBiotic;


   /**
    * @param currentBiotic Biotic that Event object is located in
    */
   Event(Biotic currentBiotic){
      this.currentBiotic = currentBiotic;
   }


   void addTrigger(String trigger){
      triggers.add(new Trigger(trigger));
   }
   public void addAction(String actionStr){
      action = actionStr;
   }


   /**
    * Tests conditions and runs the action if succeeds
    * @param allOtherBiotics ArrayList of all Biotics
    * @return Whether the Event ran successfully
    */
   public boolean run( ArrayList<Biotic> allOtherBiotics){
      ArrayList<Biotic> filteredBiotics;
      filteredBiotics = allOtherBiotics;
      for(Trigger trigger: triggers){
         filteredBiotics = trigger.filter(currentBiotic,filteredBiotics);
         if(filteredBiotics.size() == 0){
            return false;
         }
      }

      //Finds the closest Biotic if there is more than 1 in the list
      double smallestDistance = Double.MAX_VALUE;
      Biotic smallestDistanceBiotic = null;
      if(filteredBiotics.size() != 1){
         for(Biotic biotic: filteredBiotics){
            if(biotic.distance(currentBiotic) < smallestDistance){
                  smallestDistance = biotic.distance(currentBiotic);
                  smallestDistanceBiotic = biotic;
            }
         }
      }
      else{
         smallestDistanceBiotic = filteredBiotics.get(0);
      }
      if(smallestDistanceBiotic == null){
         Logger.severe("ERROR! SmallestDistanceBiotic is null");
      }
      return runAction(action,currentBiotic,smallestDistanceBiotic);

   }


   /**
    * @param str String of action to be run
    * @param currentBiotic Biotic that is executing action
    * @param otherBiotic Closest Biotic chosen to execute action on if needed
    * @return Returns whether the action has executed successfully.
    */
   private boolean runAction( String str, Biotic currentBiotic,Biotic otherBiotic){
      switch (str){
         case "KILL":
            break;
         case "SPLIT":
            break;
         case "FOLLOW":
            break;
         case "RUNAWAY":
            break;
         case "WANDER":
            break;
         case "DIE":
            return currentBiotic.die();
         case "CONTROL":
            break;
         case "COLLECT":
            break;
         default:
            Logger.severe("INVALID STRING in RunAction");
            return false;



      }
      return true;
   }


}
/*
   KILL,
   SPLIT,
   FOLLOW,
   RUNAWAY,
   WANDER,
   DIE,
   CONTROL,
   COLLECT
*/