package com.example.user.travel_place_of_ctg_project;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListviewActivity extends AppCompatActivity {
    ListView listView;
    String Entry[]={"Foye's Lake","Chittagong Zoo","Mini Bangladesh",
            "Agrabad Karnaphuli baby park","ButterFly Park","Vatiary Golf & County club","Cafe 24 Vatiary",};
    ArrayAdapter<String> adapter;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listView=findViewById(R.id.listview);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Travel Place list");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        adapter = new ArrayAdapter<String>(this,R.layout.listview,R.id.alllistview,Entry);//intal
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent= new Intent(ListviewActivity.this,DetailsActivity.class);
                intent.putExtra("key",adapter.getItem(i));
                intent.putExtra("actionBartitle",Entry[i]);
                Toast.makeText(ListviewActivity.this, adapter.getItem(i) , Toast.LENGTH_SHORT).show();
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
        getMenuInflater().inflate(R.menu.menu, menu);
        MenuItem menuItem = menu.findItem(R.id.action_search);
        searchView = (SearchView) menuItem.getActionView();
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
