public class Coach extends Person {
    
    //private String name;
   // private int age;
    private int experience;
    
    
    Coach(String name, int age, int experience)
    {
        super(name,age);
        //this.name = name;
        //this.age = age;
        this.experience = experience;
    }
    
    
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    
    public int getXP()
    {
        return  experience;
    }
    
    @Override
    public String toString() {
    return "\nCoach\n" +
            "name: " + this.name +
            "\nage: " + this.age +
            "\nexperience: " + this.experience;
    }
    
    
    
 
}
