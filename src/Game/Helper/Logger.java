package Game.Helper;

import java.util.logging.*;

public class Logger {
   private final static java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(Logger.class.getName());

   public Logger(){
      LOGGER.setLevel(Level.INFO);
   }
   public static void severe( String message){
      LOGGER.log(Level.SEVERE,message);
   }
   public static void warning( String message){
      LOGGER.log(Level.WARNING,message);
   }
   public static void info( String message){
      LOGGER.log(Level.INFO,message);
   }
   public static void fine( String message){
      LOGGER.log(Level.FINE,message);
   }

}
