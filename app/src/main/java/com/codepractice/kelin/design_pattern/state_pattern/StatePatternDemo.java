package com.codepractice.kelin.design_pattern.state_pattern;

/**
 * FileName: StatePatternDemo
 * Author: kejun
 * Date: 7/15/22 10:09 AM
 */
public class StatePatternDemo {

    public StatePatternDemo() {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}

//输出结果
//Player is in start state
//Start State
//Player is in stop state
//Stop State

//Android中的应用场景
//WI-FI管理中的状态模式
