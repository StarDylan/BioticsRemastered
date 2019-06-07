package com.company;

import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class Main {

    public static void main(String[] args) throws Exception{
       new Server.BioticWebServer().runServer();


    }
}

