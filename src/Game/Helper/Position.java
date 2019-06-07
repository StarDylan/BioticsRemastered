package Game.Helper;

public class Position {
   private int X;
   private int Y;
   Position(){
      X = 0;
      Y = 0;
   }
   Position(int X, int Y){
      this.X = X;
      this.Y = Y;
   }
   int getX(){
      return X;
   }
   int getY(){
      return Y;
   }
   void setX(int x){
      X = x;
   }
   void setY(int y){
      Y = y;
   }

}

