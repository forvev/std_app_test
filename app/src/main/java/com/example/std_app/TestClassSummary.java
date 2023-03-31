package com.example.std_app;

import android.location.Criteria;
import android.os.Message;
import android.os.Parcel;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;


import java.nio.ShortBuffer;
import java.security.SecureRandom;
import java.util.OptionalDouble;

public class TestClassSummary {
    String my_string1;
    Integer my_integer;
    TestClassSummary2 test_class_summary;
    int int_1;
    char char_1;
    TextView textView;
    EditText editText;

    SecureRandom dvd;
    Message_m message;
    Criteria criteria;

    public TestClassSummary(String first_arg, int second_arg){
        System.out.println("Here is my example");
        criteria = new Criteria();
        criteria.describeContents();
        message = new Message_m();
        System.out.println(message.arg1);

    }

    public String getPath(){
        String my_field="";

        return my_field;
    }

    public int getType(){
        return 0;
    }

    public String toString(){
        return "";
    }

    public void writeToParcel(Parcel parent, int x){

    }

    public void first_additional_method(int x){

    }

    public void second_additional_method(){

    }

}
