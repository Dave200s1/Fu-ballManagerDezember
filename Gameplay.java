import java.util.Random;

/**
 *
 * @author David Stefanov-Azubi
 */
public class Gameplay {
   
    
    private static final int PLAYINGTIME = 90;
    private static final int MAX_ADDITIONAL_TIME = 5;
    private static final int MAX_DURATION_UNTIL_NEXT_ACTION = 15;
    private Game game;
    
    public Gameplay(Game game)
    {
        this.game = game;
        
    }
    
    
    private int calculateForceOfTheTeam(Team team)
    {
        int force = team.getTotalMotivation()+ team.getCoachXP();
        Random rnd = new Random();
        int ergebnis = force + rnd.nextInt(-3) - 3;
        return 0;
    }
    
    private void doGameAction(Player player, GoalKeeper goalkeeper,int minute, Team team)
    {
        if(goalkeeper.ballHold(player.powerAtGoalKick)==true ){
        System.out.println(minute+" Minute");
        System.out.println("Chance for .. "+ team.getName());
        System.out.println(player.getName()+" zieht ab");
        player.addGoal();
        System.out.println("Goal!! "+ game.getScore() + player.getName()+"("+player.numberOfGoals+")");
        }else{
        System.out.println(minute+" Minute");
        System.out.println("Chance for .. "+ team.getName());
        System.out.println(player.getName()+" zieht ab");
        player.addGoal();
        System.out.println( player.getName()+"pariert glantzvoll");
        }
        
    }
    
    private void delay(){
    for(long i=0; i<214740000;i++){
        for(long j =0; j<10; j++){
        }
    }
    }
    
    public void play()
    {
        System.out.println(game.getScore());
        System.out.println("Dauer: "+ PLAYINGTIME);
        System.out.println("NachspielZeit: " +  MAX_ADDITIONAL_TIME );
        System.out.println("MaxNachspielZeit: " +  MAX_DURATION_UNTIL_NEXT_ACTION );
    }
    
}
