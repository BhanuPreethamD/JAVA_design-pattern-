package Behavioral.Observer;

public class EmailNotifier implements Observer {
    @Override
    public void update(double stockPrice) {
        System.out.println("Email Notifier: Stock price updated to " + stockPrice);
    }
}
