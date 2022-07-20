package com.codepractice.kelin.design_pattern.chain_pattern;

/**
 * FileName: ConsoleLogger
 * Author: kejun
 * Date: 7/14/22 5:05 PM
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
