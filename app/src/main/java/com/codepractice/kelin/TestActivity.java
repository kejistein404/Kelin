package com.codepractice.kelin;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.codepractice.kelin.design_pattern.iterator_pattern.IteratorDemo;
import com.codepractice.kelin.design_pattern.proxy_pattern.ImplJapanOrderService;
import com.codepractice.kelin.design_pattern.proxy_pattern.OrderService;
import com.codepractice.kelin.design_pattern.proxy_pattern.ProxyJapanOrder;
import com.codepractice.kelin.hook.HookUtils;

public class TestActivity extends AppCompatActivity {
    IteratorDemo iteratorDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_test);
    }
}
