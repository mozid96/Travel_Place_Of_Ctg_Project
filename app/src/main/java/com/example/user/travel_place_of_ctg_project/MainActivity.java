package com.example.user.travel_place_of_ctg_project;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread thread=new Thread()
        {
            @Override
            public void run()
            {
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                   Intent intent=new Intent(MainActivity.this,Division_nameActivity.class);
                   startActivity(intent);
                }
            }




        };
        thread.start();
    }
}
