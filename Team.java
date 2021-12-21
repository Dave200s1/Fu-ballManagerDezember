import java.util.ArrayList;  // Nicht vergessen !!!

//Assoziation implementieren zur Coach , GoalKeeper
public class Team {
    private String  name;
    private Coach coach;
    private GoalKeeper goalKeeper;
    
    private ArrayList<Player> squad;
    
    
    public Team(String name, Coach coach, GoalKeeper goalKeeper)
    {
        this.coach = coach;
        this.name = name;
        this.goalKeeper = goalKeeper;
        this.squad=new ArrayList<Player>();
       
    }
    
    public void addPlayer(Player player) {
        this.squad.add(player);
    }
    
    public int getTotalMotivation(){
        int sum = this.goalKeeper.getMotivation();
        for (int index = 0; index<this.squad.size(); index++)
        {
            sum = sum + this.squad.get(index).getMotivation();
        }
        return sum/11;
    }
    
     @Override
    public String toString()
    {
         String result="";
        result += "***Mannschaft***\n";
        result += "Trainer: "+this.coach.getName();
        result += "\nTorhüter: " + this.goalKeeper.getName()+"\n";
        for(int i = 0; i<this.squad.size(); i++)
            result= result + "Spieler: " +this.squad.get(i).getName() +"\n";
        return result;
    }
    
      public String getName(){
        return this.name;
    }
      
    public int getCoachXP()
    {
            return coach.getXP();
    }
    
    //Ende
}
