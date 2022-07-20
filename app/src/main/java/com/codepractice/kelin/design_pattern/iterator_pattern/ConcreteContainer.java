package com.codepractice.kelin.design_pattern.iterator_pattern;

public class ConcreteContainer implements Contanier {

    private String[] concreteList={"java","kotlin","dart","cpp","php"};

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator();
    }

    public class ConcreteIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            return index < concreteList.length;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return concreteList[index++];
            }
            return null;
        }
    }

}
