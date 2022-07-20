package com.codepractice.kelin.design_pattern.visitor_pattern;

import android.util.Log;

/**
 * FileName: ComputerPartDisplayVisitor
 * Author: kejun
 * Date: 4/27/22 10:31 AM
 */

//创建访问者实体类
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Keyboard keyboard) {
        Log.e("ComputerPartDisplay","visit keyboard");
        System.out.println("visit keyboard");
    }

    @Override
    public void visit(Monitor monitor) {
        Log.e("ComputerPartDisplay","visit monitor");
        System.out.println("visit monitor");
    }

    @Override
    public void visit(Mouse mouse) {
        Log.e("ComputerPartDisplay","visit mouse");
        System.out.println("visit mouse");
    }

    @Override
    public void visit(Computer computer) {
        Log.e("ComputerPartDisplay","visit computer");
        System.out.println("visit computer");
    }
}
