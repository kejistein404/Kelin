package com.codepractice.kelin.design_pattern.proxy_pattern.dynamic_proxy;

import android.util.Log;

/**
 * FileName: ConcretePerson
 * Author: kejun
 * Date: 6/30/22 2:21 PM
 */
public class ConcretePerson implements IPerson {
    @Override
    public void eat(String what) {
        Log.e("ConcretePerson", "eat============"+what);
    }

    @Override
    public void sleep(int time) {
        Log.e("ConcretePerson", "sleep============"+time);
    }
}
