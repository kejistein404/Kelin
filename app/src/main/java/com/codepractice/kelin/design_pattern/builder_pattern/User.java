package com.codepractice.kelin.design_pattern.builder_pattern;

import android.content.Context;


public class User {

    private final String name;
    private final int age;
    private final String address;
    private final String nation;

    public User(Builder builder) {
        this.name = builder.mName;
        this.age = builder.mAge;
        this.address = builder.mAddress;
        this.nation = builder.mNation;
    }


    public static final class Builder {
        private final Context mContext;
        private  String mName;  //必填项
        private  int mAge;   //必填项
        private String mAddress;
        private String mNation;


        public Builder(Context context) {
           this.mContext = context;
        }

        public Builder setName(String name){
            this.mName = name;
            return this;
        }

        public Builder setAge(int age){
            this.mAge = age;
            return this;
        }

        public Builder setAddress(String address) {
            this.mAddress = address;
            return this;
        }

        public Builder setNation(String nation) {
            this.mNation = nation;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }
}
