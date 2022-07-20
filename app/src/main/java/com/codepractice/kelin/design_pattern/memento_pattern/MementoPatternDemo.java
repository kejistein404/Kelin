package com.codepractice.kelin.design_pattern.memento_pattern;

/**
 * FileName: MementoPatternDemo
 * Author: kejun
 * Date: 7/14/22 4:40 PM
 */
public class MementoPatternDemo {

    public MementoPatternDemo() {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
//

    }

}
