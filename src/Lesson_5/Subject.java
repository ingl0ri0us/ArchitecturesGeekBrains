package Lesson_5;

public interface Subject {

    void attach(Observer o);

    void detach(Observer o);

    void notifyUpdate(Message m);

}
