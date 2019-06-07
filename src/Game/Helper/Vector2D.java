package Game.Helper;

public class Vector2D {
   private int X;
   private int Y;
   Vector2D(){
      X = 0;
      Y = 0;
   }
   Vector2D(int X,int Y){
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
