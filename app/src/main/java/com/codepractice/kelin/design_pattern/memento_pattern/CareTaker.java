package com.codepractice.kelin.design_pattern.memento_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName: CareTaker
 * Author: kejun
 * Date: 7/14/22 4:39 PM
 */

//相当于是备忘录管理类
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
