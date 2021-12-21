import java.util.Random;

public class GoalKeeper extends Player{
    private int reaction;
    
    
    
        public GoalKeeper(String name, int age, int strength, int powerAtGoalKick, int motivation, int reaction) {
        super(name, age, strength, powerAtGoalKick, motivation, 0);
        this.reaction = reaction;
        }
    
       public boolean ballHold(int powerAtGoalKick){
        Random r = new Random();
        //Reaktion kann um 1 abweichen[+1,0,-1]
        int ret = this.reaction + r.nextInt(3) -1;
        validate(ret);
        if(ret >= powerAtGoalKick)
            return true; //Ball gehalten
        else
            return false;//Tor
    }
       
        @Override
    public String toString() {
        return "\nGoalkeeper\n" +
                "name: " + name +
                "\nage: " + age +
                "\nstrength: " + force +
                "\npowerAtGoalKick: " + powerAtGoalKick +
                "\nmotivation: " + motivation +
                "\nnumberOfGoals: " + numberOfGoals +
                "\nReaktion: " + this.reaction;
    }
}
