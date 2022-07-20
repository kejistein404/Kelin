package com.codepractice.kelin.design_pattern.chain_pattern;

/**
 * FileName: ErrorLogger
 * Author: kejun
 * Date: 7/14/22 5:05 PM
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
