package com.example.user.travel_place_of_ctg_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
private CardView chittagong,Entry,NoEntry,Nearestplace;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        chittagong=(CardView) findViewById(R.id.chittagong);
        Entry=(CardView) findViewById(R.id.entryfee);
        Nearestplace=(CardView) findViewById(R.id.nearestplace);
        NoEntry=(CardView) findViewById(R.id.withoutfee);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        chittagong.setOnClickListener(this);
        Entry.setOnClickListener(this);
        NoEntry.setOnClickListener(this);
        Nearestplace.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()){
            case R.id.chittagong: i=new Intent(this,ListviewActivity.class);
            startActivity(i);
            break;//withoutentryfee
            case R.id.entryfee: i=new Intent(this,CtgActivity.class);
            startActivity(i);
            break;
            case R.id.nearestplace: i=new Intent(this,NearestPlaceActivity.class);
            startActivity(i);
            break;
            case R.id.withoutfee: i=new Intent(this,WithOutFeeActivity.class);
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
}
