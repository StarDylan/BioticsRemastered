package Game;

import Game.Helper.Position;

import java.awt.*;
import java.util.Vector;

public class Biotic {

   boolean isFood = false;

   //Color Object
   Color color;
   public Color getColor(){return color; }

   //Position object
   Position position = new Position();
   public Position getPos(){return position;}

   //Calculates Distance between 2 biotics
   public double distance(Biotic otherBiotic){
      double distance;
      distance = Math.sqrt((otherBiotic.getPos().getX() - this.getPos().getX()) * (otherBiotic.getPos().getX() - this.getPos().getX()) +
                           (otherBiotic.getPos().getY() - this.getPos().getY()) * (otherBiotic.getPos().getY() - this.getPos().getY()));
      return distance;
   }
}
