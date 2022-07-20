package com.codepractice.kelin.design_pattern.chain_pattern;

/**
 * FileName: FileLogger
 * Author: kejun
 * Date: 7/14/22 5:05 PM
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}