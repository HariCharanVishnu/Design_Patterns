package Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer){
        observers.add(observer);
    }
    public void unsubscribe(Observer observer){
        observers.remove(observer);
    }
    public void uploadVideo(){
        System.out.println("Video Uploaded");
        notifySubscribers();
    }
    public void notifySubscribers(){
        for(Observer observer : observers){
            observer.update();
        }
    }
}
