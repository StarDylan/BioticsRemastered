package Game;

import java.util.ArrayList;

public class Board {

    ArrayList<Biotic> biotics = new ArrayList<Biotic>();

    public Board(){
    }

    public void addBiotic(Biotic biotic){
        biotic.bioticList = biotics;
        biotics.add(biotic);
    }
}
