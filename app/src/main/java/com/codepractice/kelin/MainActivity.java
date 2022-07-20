package com.codepractice.kelin;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.codepractice.kelin.design_pattern.builder_pattern.User;
import com.codepractice.kelin.design_pattern.phototype_pattern.Shape;
import com.codepractice.kelin.design_pattern.phototype_pattern.ShapeCache;
import com.codepractice.kelin.design_pattern.proxy_pattern.dynamic_proxy.ConcretePerson;
import com.codepractice.kelin.design_pattern.proxy_pattern.dynamic_proxy.IPerson;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MainActivity extends AppCompatActivity {

    TextView mTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //建造者模式
        User user = new User.Builder(this)
                            .setAddress("china")
                            .setAge(1)
                            .setName("jake")
                            .setNation("han")
                            .build();


        mTv = findViewById(R.id.mTv);
        mTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("MainMapActivity",(0.1f*0.1f)+"");
//                final IPerson concretePerson = new ConcretePerson(); //被代理的对象
//                IPerson proxyPerson = (IPerson) Proxy.newProxyInstance(//根据被代理的对象，构建代理对象
//                        concretePerson.getClass().getClassLoader(),
//                        concretePerson.getClass().getInterfaces(),
//                        new InvocationHandler() {
//                            @Override
//                            /**
//                             * 调用目标对象的方法，可以在方法执行前后添加自己的操作
//                             * @param proxy 代理对象
//                             * @param method RealSubject对象中被Proxy调用的方法
//                             * @param args 被Proxy调用的方法参数列表
//                             * @return Proxy调用的方法的返回值
//                             * @throws Throwable
//                             */
//                            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                                //我们可以在方法调用之前添加自己的操作
//                                Log.e("proxyPerson","before invoke");
//                                //调用RealSubject的方法,当然也可以不调
//                                Object result = method.invoke(concretePerson, args);
//                                //我们可以在方法调用之后添加自己的操作
//                                Log.e("proxyPerson","after invoke");
//                                return result;
//                            }
//                        }); //根据被代理对象生成代理对象
//
//                proxyPerson.eat("apple");
//                proxyPerson.sleep(8000);
            }
        });
    }

}
