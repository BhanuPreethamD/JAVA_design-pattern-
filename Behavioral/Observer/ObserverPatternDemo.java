package Behavioral.Observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer emailNotifier = new EmailNotifier();
        stockMarket.addObserver(emailNotifier);

        stockMarket.setStockPrice(100.5); // Email Notifier: Stock price updated to 100.5
        stockMarket.setStockPrice(101.0); // Email Notifier: Stock price updated to 101.0
    }
}
