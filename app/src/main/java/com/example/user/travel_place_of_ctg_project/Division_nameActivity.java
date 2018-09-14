package com.example.user.travel_place_of_ctg_project;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;

public class Division_nameActivity extends AppCompatActivity implements View.OnClickListener {
private CardView dhaka,ctg,bar,khulna,raj,syl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division_name);
        dhaka=(CardView) findViewById(R.id.Dhaka);
        ctg=(CardView) findViewById(R.id.Ctg);
        bar=(CardView) findViewById(R.id.Barisal);
        khulna=(CardView) findViewById(R.id.Khulna);
        raj=(CardView) findViewById(R.id.Raj);
        syl=(CardView) findViewById(R.id.sylhet);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        dhaka.setOnClickListener(this);
        ctg.setOnClickListener(this);
        bar.setOnClickListener(this);
        khulna.setOnClickListener(this);
        raj.setOnClickListener(this);
        syl.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()){
            case R.id.Dhaka: i=new Intent(this,DhakaActivity.class);
                startActivity(i);
                break;
            case R.id.Ctg: i=new Intent(this,SecondActivity.class);
                startActivity(i);
                break;
            case R.id.Barisal: i=new Intent(this,BarisalActivity.class);
                startActivity(i);
                break;
            case R.id.Khulna: i=new Intent(this,KhulnaActivity.class);
                startActivity(i);
                break;
            case R.id.Raj: i=new Intent(this,RajsahiActivity.class);
                startActivity(i);
                break;
            case R.id.sylhet: i=new Intent(this,SylhetActivity.class);
                startActivity(i);
                break;
            default:break;
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()== android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void onBackPressed()
    {  AlertDialog.Builder builder= new AlertDialog.Builder(Division_nameActivity.this);
        builder.setMessage("Do you want to exit? ");
        builder.setCancelable(true);
        builder.setNegativeButton("Close", new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        AlertDialog alertDialog= builder.create();
        alertDialog.show();
        moveTaskToBack(false);
    }
}
