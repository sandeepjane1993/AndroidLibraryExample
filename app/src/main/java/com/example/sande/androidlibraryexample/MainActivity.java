package com.example.sande.androidlibraryexample;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mylibrary.Message;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Message msgObj = new Message();
        msgObj.toastMessage(this,"yingShing");
    }
}
