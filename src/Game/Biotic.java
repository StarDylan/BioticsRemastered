package Game;

import Game.Helper.Position;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Vector;

public class Biotic {

   public ArrayList<Biotic> bioticList;
   boolean isFood = false;

   Position position = new Position();
   Color color;

   public Biotic(Position position){
      this.position = position;
   }


   public Color getColor(){return color; }
   public Position getPos(){return position;}

   //Calculates Distance between 2 biotics
   public double distance(Biotic otherBiotic){
      double distance;
      distance = Math.sqrt((otherBiotic.getPos().getX() - this.getPos().getX()) * (otherBiotic.getPos().getX() - this.getPos().getX()) +
                           (otherBiotic.getPos().getY() - this.getPos().getY()) * (otherBiotic.getPos().getY() - this.getPos().getY()));
      return distance;
   }


   // ACTIONS //
   public boolean die(){
      bioticList.remove(this);
      return true;
   }
}
