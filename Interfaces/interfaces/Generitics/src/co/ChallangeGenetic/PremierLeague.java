package co.ChallangeGenetic;

import java.util.ArrayList;

public class PremierLeague<T extends Teams> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int drawn = 0;

    private ArrayList<T> premierLeagueTeam = new ArrayList<>();

    public PremierLeague(String name) {
        this.name = name;
    }



    public boolean addTeam(T club) {
        if(premierLeagueTeam.contains(club)) {
            System.out.println(club.getTeam() + " is already in the premier league.");
            return false;
        } else {
            premierLeagueTeam.add(club);
            System.out.println("added" + club );
            return true;
        }
    }


}
