package com.codepractice.kelin.design_pattern.memento_pattern;

/**
 * FileName: Originator
 * Author: kejun
 * Date: 7/14/22 4:39 PM
 */

// 被 备忘的 对象
public class Originator {

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    //为这个对象 新建一个备忘录
    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    //根据备忘录 获取备忘的信息
    public void getStateFromMemento(Memento Memento) {
        state = Memento.getState();
    }

}
