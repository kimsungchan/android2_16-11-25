package com.example.a403.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.ViewStubCompat;
import android.text.Layout;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    CheckBox c1;
    View l1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1=(View) findViewById(R.id.linear);
        setCheckBox();
    }
    void setCheckBox(){
        c1=(CheckBox)findViewById(R.id.checkBox);
       if(c1.isChecked()){

       }
    }
}
