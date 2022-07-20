package com.codepractice.kelin.design_pattern.state_pattern;

/**
 * FileName: Context
 * Author: kejun
 * Date: 7/15/22 10:09 AM
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}