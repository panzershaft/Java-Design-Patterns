package singleton_pattern;

public class Singleton {
    private static Singleton instance = null;
    
    private Singleton(){
        System.out.println("SINGLETON-OBJECT CREATED\n");
    }
    
    public static Singleton getInstance(){
        if (instance == null) instance = new Singleton();
        return instance;
    }

}

class Runner {
    public static void main(String[] args){
        Singleton instance_one = Singleton.getInstance();
        Singleton instance_two = Singleton.getInstance();
        Singleton instance_three = Singleton.getInstance();

        System.out.println("instance_one points to -> " + instance_one.hashCode());
        System.out.println("instance_two points to -> " + instance_two.hashCode());
        System.out.println("instance_three points to -> " + instance_three.hashCode());

        if ( instance_one == instance_two && instance_two == instance_three)
            System.out.println("\nAll three instances point to the same object");

    }
}


