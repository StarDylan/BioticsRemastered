package Game.Helper;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Colors {
   public static final Color[] colorArray = {Color.BLACK};
   public static final ArrayList<Color> colorArrayList = new ArrayList<>(Arrays.asList(colorArray));

   public Color toColor(String name){
      switch (name){
         case "BLUE":
            return Color.BLUE;
         default:
            return Color.BLACK;
      }
   }

}
