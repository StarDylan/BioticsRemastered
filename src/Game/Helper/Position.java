package Game.Helper;

public class Position {
   private int X;
   private int Y;
   public Position(){
      X = 0;
      Y = 0;
   }
   public Position(int X, int Y){
      this.X = X;
      this.Y = Y;
   }
   public int getX(){
      return X;
   }
   public int getY(){
      return Y;
   }
   public void setX(int x){
      X = x;
   }
   public void setY(int y){
      Y = y;
   }

}

