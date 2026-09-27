package Singleton_Pattern;

public class Singleton {

    private static Singleton singleton;

    private Singleton(){
        System.out.println("Instance is created");
    }

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
