package org.example.ObserverDesignPattern.Observable;

import org.example.ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver notificationAlertObserver);
    public void remove(NotificationAlertObserver notificationAlertObserver);
    public void notifySubscribers();
    public void setStockCount(int newStockAdded);
    public int getStockCount();
}
