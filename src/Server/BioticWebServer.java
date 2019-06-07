package Server;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;

import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;


public class BioticWebServer {

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

         String ifStatements = t.getRequestHeaders().get("IF").get(0);
         String thenStatements =  t.getRequestHeaders().get("THEN").get(0);
         //Gets the IF and THEN
         System.out.println("IF: "+ t.getRequestHeaders().get("IF"));
         System.out.println("THEN: " + t.getRequestHeaders().get("THEN").get(0));
         OutputStream os = t.getResponseBody();
         os.write(response.getBytes());
         os.close();
      }
   }

}