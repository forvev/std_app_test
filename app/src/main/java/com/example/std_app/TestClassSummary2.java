package com.example.std_app;

import android.util.Pair;

//Summary with changed order of methods
public class TestClassSummary2 {

    Object object1, object2;
    TestClassSummary testClassSummary;
    int int_1;
    String string_1;
    long long_1;

    public Pair<Object, Object> create(Object o1, Object o2){
        Pair<Object,Object> p1 = new Pair<>(o1,o2);
        return p1;
    }

    public String toString(){
        return "";
    }

    TestClassSummary2(Object ob1, Object ob2){
        object1 = ob1;
        object2 = ob2;
    }

}
