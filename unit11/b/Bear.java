package unit11.b;

// let's explore inheritance!
public class Bear {
    private Zoo whereILive;
    private String name;

    public Bear(){
        name = "Mr.Bear";
    }

    public Bear(String name){
        this.name = name;
    }

    public String getName(String name){
        return name;
    }

    public static void main (String [] args){
        Bear uwu = new Panda("uwu");
        Bear mrBear = new Bear();
        //Panda pandabear = new Panda();

    }

}

// https://wwf.panda.org/wwf_news/?163461/Is-the-giant-panda-a-bear
class Panda extends Bear {
    public Panda(String name){
        //always have to call one constructor
        //implicit contruct called if it exists
        //super(); (called implicitly)
    }
    //private String pandaName;
    //public Panda(String pandaName){
        //super(pandaName); can't set private instance variables even on super class
        //this.pandaName = name;
    }


// https://en.wikipedia.org/wiki/List_of_giant_pandas
class Zoo {
    //composition
    private Panda inhabitant;

}

// Zookeeper, Visitor, etc.
