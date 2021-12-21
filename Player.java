import java.util.Random;

public class Player extends Person {
    protected int force;
    protected int powerAtGoalKick;
    protected int motivation;
    protected int numberOfGoals;

    public Player(String name, int age, int force, int powerAtGoalKick, int motivation, int numberOfGoals) {
        super(name, age);
        this.force = force;
        this.powerAtGoalKick = powerAtGoalKick;
        this.motivation = motivation;
        this.numberOfGoals = numberOfGoals;
    }

    public int shootAtGoal(){
        Random rnd = new Random();
        int shot = this.powerAtGoalKick + rnd.nextInt(4) - 2;
        return validate(shot);
    }

    protected int validate(int number){
        if(number < 1)
            return 1;
        if(number > 10)
            return 10;
        else
            return number;
    }

    public void addGoal(){
        this.numberOfGoals++;
    }

    public int getMotivation(){
        return this.motivation;
    }

    @Override
    public String toString() {
        return "\nSpieler\n" +
                "Name: " + this.name +
                "\nAlter: " + this.age +
                "\nStärke: " + this.force +
                "\nTorschusshärte: " + this.powerAtGoalKick +
                "\nMotivation: " + this.motivation +
                "\nAnzahl Tore: " + this.numberOfGoals;
    }

    public int getForce() {
        return this.force;
    }
    
}
