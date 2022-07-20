package com.codepractice.kelin.design_pattern.observer_pattern;

import android.os.Handler;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public abstract class Observable {

    private Vector<Observer> observers = new Vector<>();


    //添加观察者
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    //移除观察者
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    //通知所有观察者
    public void update() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
