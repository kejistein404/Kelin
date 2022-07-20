package com.codepractice.kelin.design_pattern.iterator_pattern;

import android.util.Log;

public class IteratorDemo {
    public  IteratorDemo(){
      ConcreteContainer concreteContainer=new ConcreteContainer();
      // 意图：提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。
      // 使用场景 1、访问一个聚合对象的内容而无须暴露它的内部表示。 2、需要为聚合对象提供多种遍历方式。 3、为遍历不同的聚合结构提供一个统一的接口。
      for(Iterator iterator = concreteContainer.getIterator();iterator.hasNext();){
          Log.e("concreteList",(String)iterator.next());
      }
    }
}
