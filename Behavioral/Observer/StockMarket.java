package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class StockMarket {
    private List<Observer> observers = new ArrayList<>();
    private double stockPrice;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockPrice);
        }
    }
}
