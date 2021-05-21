import java.util.ArrayList;

// T is a bounded type paramater, you caan use an interface or an abstract
//
public class Team<T extends  Player> implements Comparable<Team<T>> {
    //This is a base class
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    // Constructor
    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //You can get player as a  abstract class
    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            // Doing extends player you dont have to add a cast
            //System.out.println(((Player) player).getName() + "Already exists");
            System.out.println(player.getName() + "Already exists");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + "player added" + this.name);
            return true;

        }
    }
            public int numPlayers() {
                 return this.members.size();
            }
            public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
                if(ourScore > theirScore) {
                    won++;
                } else if (ourScore == theirScore) {
                    tied++;
                } else {
                    lost++;
                }
                played++;
                if(opponent != null) {
                    opponent.matchResult(null, theirScore, ourScore);
                }

    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }
}
