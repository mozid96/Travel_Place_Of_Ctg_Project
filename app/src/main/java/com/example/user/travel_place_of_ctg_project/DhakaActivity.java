package com.example.user.travel_place_of_ctg_project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Locale;

public class DhakaActivity extends AppCompatActivity {
    ListView listView;
    String Entry[]={"Hatir Zill","Lalbag Fort","Dream Holiday Park",
            "Botanical Garden","nandan Park","Ahsan Manjil","Tara Mosque",
            "Novo Theatre","Nohash Polli","National muscium","Jatiyo Sriti Shoudho","Fantasy-Kingdom"};
    ArrayAdapter<String> adapter;
    SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka);
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
                Intent intent= new Intent(DhakaActivity.this,DetailsActivity.class);
                intent.putExtra("key",adapter.getItem(i));
                intent.putExtra("actionBartitle",Entry[i]);
                Toast.makeText(DhakaActivity.this, adapter.getItem(i), Toast.LENGTH_SHORT).show();
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
    @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu,menu);
            MenuItem menuItem=menu.findItem(R.id.action_search);
            searchView=(SearchView)menuItem.getActionView();
            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String s) {

                    return false;
                }

                @Override
                public boolean onQueryTextChange(String s) {
                    adapter.getFilter().filter(s);
                    return false;
                }
            });
            searchView.setSubmitButtonEnabled(true);
            return true;
    }





}
