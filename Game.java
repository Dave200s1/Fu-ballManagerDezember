public class Game{
    private Team home;
    private Team away;
    private int goalsHome;
    private int goalsAway;
    
    
    public Game(Team home, Team away)
    {
        this.home = home;
        this.away = away;
     
    }
       
    public String toString()
    {
        return home.getName()+ " - " + away.getName();
    }
    
    public void increaseHomeGoals(){
        this.goalsHome++;
    }
    
     public void increaseAwayGoals(){
        this.goalsAway++;
    }
     
    public String getScore(){
        return this.goalsHome + " : " + this.goalsAway;
    }
    
    
}
