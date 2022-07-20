package com.codepractice.kelin.design_pattern.memento_pattern;

/**
 * FileName: Memento
 * Author: kejun
 * Date: 7/14/22 4:37 PM
 */

//备忘录，用于存储需要备忘的信息
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
}
