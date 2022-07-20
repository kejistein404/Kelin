package com.codepractice.kelin.design_pattern.state_pattern;

/**
 * FileName: StopState
 * Author: kejun
 * Date: 7/15/22 10:09 AM
 */
public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}