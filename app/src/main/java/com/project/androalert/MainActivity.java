package com.project.androalert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.project.androalertdialog.AndroAlert;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        new AndroAlert(this).alertMessageSuccess("Haaas");
    }
}
