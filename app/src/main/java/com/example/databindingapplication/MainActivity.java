package com.example.databindingapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.os.Bundle;

import com.example.databindingapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person p1 = new Person("Huy", "huy123@gmail.com");

        activityMainBinding = DataBindingUtil.setContentView(
                this, R.layout.activity_main);
        activityMainBinding.setPerson(p1);
    }
}