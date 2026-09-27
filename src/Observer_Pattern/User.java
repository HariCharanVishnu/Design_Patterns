package Observer_Pattern;

public class User implements Observer{
    private String name;

    User(String name){
        this.name = name;
    }
    @Override
    public void update() {
        System.out.println("User "+name+" has been uploaded");
    }
}
