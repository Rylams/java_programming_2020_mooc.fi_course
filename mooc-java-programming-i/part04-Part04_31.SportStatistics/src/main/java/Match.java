
public class Match {
    
    private String team;
    private String visiTeam;
    private int tPoints;
    private int vPoints;
    
    public Match(String team, String visiTeam, int tPoints, int vPoints) {
        this.team = team;
        this.visiTeam = visiTeam;
        this.tPoints = tPoints;
        this.vPoints = vPoints;
    }
    
    public String getTeam() {
        return team;
    }
    
    @Override
    public String toString() {
        return team + "," + visiTeam;
    }
}
