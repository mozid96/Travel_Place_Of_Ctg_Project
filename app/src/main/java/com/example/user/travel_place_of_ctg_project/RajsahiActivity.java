package com.example.user.travel_place_of_ctg_project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

public class RajsahiActivity extends AppCompatActivity {
    ListView listView;
    String Entry[]={"Putia Rajbari","Mohastongod","Paharpor Buddhist Vihar",
            "Baga Mosjid","Safina Park","Alta Digi","Jia Park",
            "Borendu Goveshona"};
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajsahi);
        listView=findViewById(R.id.listview);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Travel place list");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        adapter = new ArrayAdapter<String>(this,R.layout.listview,R.id.alllistview,Entry);//intal
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent= new Intent(RajsahiActivity.this,DetailsActivity.class);
                intent.putExtra("key",Entry[i]);
                intent.putExtra("actionBartitle",Entry[i]);
                Toast.makeText(RajsahiActivity.this, Entry[i] , Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });

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
