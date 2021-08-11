package com.poly.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    // man hinh chao
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.show();
        progressDialog.setMessage("Xin cho 2 giay ....");

        Timer timer
                = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                // goi sang man hinh 2 o day
                Intent intent =
                        new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);

            }
        }, 2000);


    }
}