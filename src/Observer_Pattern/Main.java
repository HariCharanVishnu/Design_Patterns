package Observer_Pattern;

public class Main {
    public static void main(String[] args) {

        Channel techChannel = new Channel();

        User s1 = new User("Hari");
        User s2 = new User("Balu");
        User s3 = new User("Karthik");
        User s4 = new User("KJ");
        User s5 = new User("Sai");

        techChannel.subscribe(s1);
        techChannel.subscribe(s2);
        techChannel.subscribe(s3);
        techChannel.subscribe(s4);
        techChannel.subscribe(s5);

        techChannel.uploadVideo();
    }
}
