package com.codepractice.kelin.design_pattern.state_pattern;

/**
 * FileName: StartState
 * Author: kejun
 * Date: 7/15/22 10:08 AM
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }

}