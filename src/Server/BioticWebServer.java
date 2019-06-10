package Server;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.util.StringTokenizer;

import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class BioticWebServer {

   Logger log =new Logger();

   private static String pathToMainHTML = "\\HTML\\TestHTML.html";

   public void runServer() throws Exception {
      HttpServer server = HttpServer.create(new InetSocketAddress(80), 0);
      server.createContext("/postBiotic", new BioticSender());

      server.setExecutor(null); // creates a default executor
      server.start();
   }

   static class BioticSender implements HttpHandler {
      @Override
      public void handle(HttpExchange t) throws IOException {
         String response = new String(readAllBytes(get(System.getProperty("user.dir") + BioticWebServer.pathToMainHTML)));
         t.sendResponseHeaders(200, response.length());

         //Gets the IF and THEN Statement Strings
         String ifStatements = t.getRequestHeaders().get("IF").get(0);
         String thenStatements =  t.getRequestHeaders().get("THEN").get(0);

         //Returns the ELSE IF statements (Still has the AND statements such as HUNGRY_TIRED)
         StringTokenizer ifTokens = new StringTokenizer(ifStatements," ");

         StringTokenizer thenTokens = new StringTokenizer(thenStatements," ");

         /*while(ifTokens.hasMoreTokens()){
            String ifToken = ifTokens.nextToken();
         }*/

         Logger.info("IF: "+ t.getRequestHeaders().get("IF").get(0));
         Logger.info("THEN: " + t.getRequestHeaders().get("THEN").get(0));
         OutputStream os = t.getResponseBody();
         os.write(response.getBytes());
         os.close();
      }
   }

}