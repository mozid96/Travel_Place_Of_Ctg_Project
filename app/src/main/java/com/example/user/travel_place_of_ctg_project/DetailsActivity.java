package com.example.user.travel_place_of_ctg_project;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    TextView textView,text1;
    ImageView imageView;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
      textView=findViewById(R.id.detail);
      text1=findViewById(R.id.text1);
      imageView=findViewById(R.id.imageview);
        ActionBar actionBar=getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        name = getIntent().getExtras().getString("key") ;
        getIntent().getStringExtra("actionBartitle");
        if(name.equals("Foye's Lake")){
            textView.setText("Foye's Lake");
            imageView.setImageResource(R.drawable.lake);
            actionBar.setTitle("Foye's lake");
            text1.setText(R.string.lake);
        }
        if(name.equals("Chittagong Zoo")){
            textView.setText("Chittagong Zoo");
            actionBar.setTitle("Chittagong Zoo");
            imageView.setImageResource(R.drawable.zoo);
            text1.setText(R.string.lake);
        }
        if(name.equals("Mini Bangladesh")){
            textView.setText("Mini Bangladesh");
            imageView.setImageResource(R.drawable.chittagong);
            text1.setText(R.string.MiniBd);
            actionBar.setTitle("Mini Bangladesh");
        }
        if(name.equals("Agrabad Karnaphuli baby park")){
            textView.setText("Agrabad Karnaphuli baby park");
            actionBar.setTitle("Agrabad Karnaphuli baby park");
            text1.setText(R.string.jamburipark);
            imageView.setImageResource(R.drawable.jumbori);
        }
        if(name.equals("ButterFly Park")){
            textView.setText("ButterFly Park");
            text1.setText(R.string.lake);
            actionBar.setTitle("ButterFly Park");
            imageView.setImageResource(R.drawable.butterfly);

        }
        if(name.equals("Vatiary Golf & County club")){
            textView.setText("Vatiary Golf & County club");
            text1.setText(R.string.vatiary);
            actionBar.setTitle("Vatiary Golf & County club");
           imageView.setImageResource(R.drawable.vatiary);
        }
        if(name.equals("Cafe 24 Vatiary")){
            textView.setText("Cafe 24 Vatiary");
            actionBar.setTitle("Cafe 24 Vatiary");
            text1.setText(R.string.vatiary);
            imageView.setImageResource(R.drawable.vatiary);
        }

        if(name.equals("Jamburi park")){
            textView.setText("Jamburi park");
            actionBar.setTitle("Jamburi park");
            text1.setText(R.string.jamburipark);
            imageView.setImageResource(R.drawable.jumbori);
        }
        if(name.equals("Patenga")){
            textView.setText("Patenga");
            actionBar.setTitle("Patenga");
            text1.setText(R.string.potenga);
            imageView.setImageResource(R.drawable.patenga);
        }
        if(name.equals("DC hill")){
            textView.setText("DC hill");
            actionBar.setTitle("DC hill");
            text1.setText(R.string.dchill);
            imageView.setImageResource(R.drawable.dchill);
        }
        if(name.equals("Neval 2")){
            textView.setText("Neval 2");
            actionBar.setTitle("Neval 2");
           text1.setText(R.string.potenga);
            imageView.setImageResource(R.drawable.patenga);
        }
        if(name.equals("War cemetery")){
            textView.setText("War cemetery");
            actionBar.setTitle("War cemetery");
            text1.setText(R.string.warsimtry);
            imageView.setImageResource(R.drawable.worldwar);
        }
        if(name.equals("CRB hill")){
            textView.setText("CRB hill");
            actionBar.setTitle("CRB hill");
            text1.setText(R.string.dchill);
            imageView.setImageResource(R.drawable.dchill);
        }
        if(name.equals("Air Port")){
            textView.setText("Air Port");
            actionBar.setTitle("Air Port");
            text1.setText(R.string.potenga);
            imageView.setImageResource(R.drawable.airport);
        }
        if(name.equals("Cox's Bazar")){
            textView.setText("Cox's Bazar");
            actionBar.setTitle("Cox's Bazar");
            text1.setText(R.string.coz);
            imageView.setImageResource(R.drawable.coxsbazar);
        }
        if(name.equals("Rangamati")){
            textView.setText("Rangamati");
            actionBar.setTitle("Rangamati");
            text1.setText(R.string.happyisland);
            imageView.setImageResource(R.drawable.sajekvalley);
        }
        if(name.equals("Mohamia Lake")){
            textView.setText("Muhamia Lake");
            actionBar.setTitle("Muhamia Lake");
            text1.setText(R.string.mohamia);
            imageView.setImageResource(R.drawable.mohamia);
        }
        if(name.equals("Bandorban")){
            textView.setText("Bandorban");
            actionBar.setTitle("Bandorban");
            text1.setText(R.string.bandarbon);
            imageView.setImageResource(R.drawable.bogalakeban);
        }
        if(name.equals("Kaptai")){
            textView.setText("Kaptai");
            actionBar.setTitle("Kaptai");
            text1.setText(R.string.kaptai);
            imageView.setImageResource(R.drawable.kaptai);
        }
        if(name.equals("Sitakonda")){
            textView.setText("Sitakonda");
            actionBar.setTitle("Sitakonda");
            text1.setText(R.string.mohamia);
            imageView.setImageResource(R.drawable.sitakonda);
        }
        if(name.equals("Parky chor")){
            textView.setText("Parky chor");
            actionBar.setTitle("Parky chor");
            text1.setText(R.string.coz);
            imageView.setImageResource(R.drawable.sandip);
        }
        if(name.equals("Nafakom WaterFalls")){
            textView.setText("Nafakom WaterFalls");
            actionBar.setTitle("Nafakom WaterFalls");
            text1.setText(R.string.bandarbon);
            imageView.setImageResource(R.drawable.napakom);
        }
        //10 top
        if(name.equals("Boga Lake")){
            textView.setText("Boga Lake");
            actionBar.setTitle("Boga Lake");
            text1.setText(R.string.bandarbon);
            imageView.setImageResource(R.drawable.bogalakeban);
        }
        if(name.equals("Neval Beach")){
            textView.setText("Neval Beach");
            actionBar.setTitle("Neval Beach");
            text1.setText(R.string.potenga);
            imageView.setImageResource(R.drawable.patenga);
        }
        if(name.equals("Foy's Lake")){
            textView.setText("Foy's Lake");
            actionBar.setTitle("Foy's Lake");
            text1.setText(R.string.lake);
        }
        if(name.equals("Karnaphuli River")){
            textView.setText("Karnaphuli River");
            actionBar.setTitle("Karnaphuli River");
            imageView.setImageResource(R.drawable.karriver);
            text1.setText(R.string.potenga);
        }
        if(name.equals("Patenga Beach")){
            textView.setText("Patenga Beach");
            actionBar.setTitle("Patenga Beach");
            text1.setText(R.string.potenga);
            imageView.setImageResource(R.drawable.patenga);
        }
        if(name.equals("Vatiary Lake")){
            textView.setText("Vatiary Lake");
            actionBar.setTitle("Vatiary Lake");
            text1.setText(R.string.vatiary);
            imageView.setImageResource(R.drawable.vatiary);
        }
        if(name.equals("Khaiyachara Falls")) {
            textView.setText("Khaiyachara Falls");
            actionBar.setTitle("Khaiyachara Falls");
            text1.setText(R.string.mohamia);
            imageView.setImageResource(R.drawable.kai);
        }
            if(name.equals("Butterfly Park Bangladesh")){
                textView.setText("Butterfly Park Bangladesh");
                actionBar.setTitle("Butterfly Park Bangladesh");
                text1.setText(R.string.lake);
                imageView.setImageResource(R.drawable.butterfly);
            }
        if(name.equals("Chittagong Zoo")){
            textView.setText("Chittagong Zoo");
            actionBar.setTitle("Chittagong Zoo");
            text1.setText(R.string.lake);
            imageView.setImageResource(R.drawable.zoo);
        }
        if(name.equals("Dulahazra Safari Park")){
            textView.setText("Dulahazra Safari Park");
            actionBar.setTitle("Dulahazra Safari Park");
            imageView.setImageResource(R.drawable.zoo);
            //text1.setText(R.string.coz);
        }
        //dhaka divison
        if(name.equals("Hatir Zill")){
            textView.setText("Hatir Zill");
            actionBar.setTitle("Hatir Zill");
            text1.setText(R.string.hatirzil);
            imageView.setImageResource(R.drawable.hatir);
        }
        if(name.equals("Lalbag Fort")){
            textView.setText("Lalbag Fort");
            actionBar.setTitle("Lalbag Fort");
            text1.setText(R.string.lalbug);
            imageView.setImageResource(R.drawable.lal);
        }
        if(name.equals("Dream Holiday Park")){
            textView.setText("Dream Holiday Park");
            actionBar.setTitle("Dream Holiday Park");
            text1.setText(R.string.dream);
           imageView.setImageResource(R.drawable.dream);
        }
        if(name.equals("Botanical Garden")){
            textView.setText("Botanical Garden");
            actionBar.setTitle("Botanical Garden");
            text1.setText(R.string.botanical);
            imageView.setImageResource(R.drawable.botanical);
        }
        if(name.equals("nandan Park")){
            textView.setText("nandan Park");
            actionBar.setTitle("nandan Park");
            text1.setText(R.string.nandon);
            imageView.setImageResource(R.drawable.pantacy);
        }
        if(name.equals("Ahsan Manjil")){
            textView.setText("Ahsan Manjil");
            actionBar.setTitle("Ahsan Manjil");
            text1.setText(R.string.ahsan);
           imageView.setImageResource(R.drawable.ahsan);
        }
        if(name.equals("Tara Mosque")){
            textView.setText("Tara mosjid");
            actionBar.setTitle("Tara mosjid");
            text1.setText(R.string.taramosjid);
            imageView.setImageResource(R.drawable.tara);
        }
        if(name.equals("Novo Theatre")){
            textView.setText("Novo Theatre");
            actionBar.setTitle("Novo Theatre");
            text1.setText(R.string.novo);
            imageView.setImageResource(R.drawable.novo);
        }
        if(name.equals("Nohash Polli")){
            textView.setText("Nohash Polli");
            actionBar.setTitle("Nohash Polli");
            text1.setText(R.string.nohash);
            imageView.setImageResource(R.drawable.nohas);
        }
        if(name.equals("National muscium")){
            textView.setText("National Musuim");
            actionBar.setTitle("National Musuim");
            text1.setText(R.string.national);
            imageView.setImageResource(R.drawable.musium);
        }
        if(name.equals("Fantasy-Kingdom")){
            textView.setText("Fantasy-Kingdom");
            actionBar.setTitle("Fantasy-Kingdom");
            text1.setText(R.string.fantacy);
            imageView.setImageResource(R.drawable.pantacy);
        }
        if(name.equals("Jatiyo Sriti Shoudho")){
            textView.setText("Jatiyo Sriti Shoudho");
            actionBar.setTitle("Jatiyo Sriti Shoudho");
            text1.setText(R.string.sirity);
            imageView.setImageResource(R.drawable.jatiyosriti);
        }

  //khulna
        if(name.equals("Sundarban")){
            textView.setText("Sundarban");
            actionBar.setTitle("Sundarban");
            text1.setText(R.string.sondarban);
            imageView.setImageResource(R.drawable.sundarban);
        }
        if(name.equals("60 gombuj mosque")){
            textView.setText("60 gombuj mosque");
            actionBar.setTitle("60 gombuj mosque");
            text1.setText(R.string.gombuj);
          imageView.setImageResource(R.drawable.gumbj);
        }
        if(name.equals("Mongla Port")){
            textView.setText("Mongla Port");
            actionBar.setTitle("Mongla Port");
            text1.setText(R.string.mongla);
            imageView.setImageResource(R.drawable.mogla);
        }
        if(name.equals("Dublar Chor")){
            textView.setText("Dublar Chor");
            actionBar.setTitle("Dublar Chor");
            text1.setText(R.string.dovlarcor);
            imageView.setImageResource(R.drawable.kotka);
        }
        if(name.equals("Kotka Beach")){
            textView.setText("Kotka Beach");
            actionBar.setTitle("Kotka Beach");
            text1.setText(R.string.lokoncora);
            imageView.setImageResource(R.drawable.kotka);
        }
        if(name.equals("KhanJahan Ali Mousque")){
            textView.setText("KhanJahan Ali Mousque");
            actionBar.setTitle("KhanJahan Ali Mousque");
            text1.setText(R.string.khan);
            imageView.setImageResource(R.drawable.khan);
        }
        if(name.equals("Ropsa River")){
            textView.setText("Ropsa River");
            actionBar.setTitle("Ropsa River");
            text1.setText(R.string.dovlarcor);
            imageView.setImageResource(R.drawable.karriver);
        }
        if(name.equals("Prem Kanon")){
            textView.setText("Prem Kanon");
            actionBar.setTitle("Prem Kanon");
            text1.setText(R.string.dovlarcor);
            imageView.setImageResource(R.drawable.botanical);
        }
        if(name.equals("Nat Mondir")){
            textView.setText("Nat Mondir");
            actionBar.setTitle("Nat Mondir");
            text1.setText(R.string.dovlarcor);
            imageView.setImageResource(R.drawable.nath);
        }
        if(name.equals("Koakata")){
            textView.setText("Koakata");
            actionBar.setTitle("Koakata");
            text1.setText(R.string.coz);
            imageView.setImageResource(R.drawable.khuakata);
        }
        if(name.equals("shapla gram,satla")){
            textView.setText("shapla gram,satla");
            actionBar.setTitle("shapla gram,satla");
            text1.setText(R.string.dovlarcor);
            imageView.setImageResource(R.drawable.kotka);
        }
        if(name.equals("Durgasagor dighi")){
            textView.setText("Durgasagor dighi");
            actionBar.setTitle("Durgasagor dighi");
            text1.setText(R.string.dovlarcor);
            imageView.setImageResource(R.drawable.nath);
        }
        if(name.equals("Guthia Mosque")){
            textView.setText("Guthia Mosque");
            actionBar.setTitle("Guthia Mosque");
           text1.setText(R.string.taramosjid);
            imageView.setImageResource(R.drawable.tara);
        }
        if(name.equals("Miabari jame Mosque")){
            textView.setText("Miabari jame Mosque");
            actionBar.setTitle("Miabari jame Mosque");
            //text1.setText(R.string.coz);
        }
        if(name.equals("Putia Rajbari")){
            textView.setText("Putia Rajbari");
            actionBar.setTitle("Putia Rajbari");
            text1.setText(R.string.taramosjid);
            imageView.setImageResource(R.drawable.rahbari);
        }
        if(name.equals("Hajrat ShaJalal(R) Majar")){
            textView.setText("Hajrat ShaJalal(R) Majar");
            actionBar.setTitle("Hajrat ShaJalal(R) Majar");
            text1.setText(R.string.shajalal);
            imageView.setImageResource(R.drawable.majar);
        }
        if(name.equals("Jaflong")){
            textView.setText("Jaflong");
            actionBar.setTitle("Jaflong");
            text1.setText(R.string.jaflog);
            imageView.setImageResource(R.drawable.jaflong);
        }
        if(name.equals("Panthumai Waterfall,sylhet")){
            textView.setText("Panthumai Waterfall,sylhet");
            actionBar.setTitle("Panthumai Waterfall,sylhet");
            text1.setText(R.string.pantumai);
            imageView.setImageResource(R.drawable.kai);
        }
        if(name.equals("Malnicora tea garden")){
            textView.setText("Malnicora tea garden");
            actionBar.setTitle("Malnicora tea garden");
            text1.setText(R.string.lokoncora);
            imageView.setImageResource(R.drawable.jaflong);
        }
        if(name.equals("Kolomcoda")){
            textView.setText("Kolomcoda");
            actionBar.setTitle("Kolomcoda");
            text1.setText(R.string.lokoncora);
            imageView.setImageResource(R.drawable.kotka);
        }
        if(name.equals("Lokkhonchora,Sylhet")){
            textView.setText("Lokkhonchora,Sylhet");
            actionBar.setTitle("Lokkhonchora,Sylhet");
            text1.setText(R.string.lokoncora);
            imageView.setImageResource(R.drawable.kai);
        }
        if(name.equals("BichanaKandi,Sylhet")){
            textView.setText("BichanaKandi,Sylhet");
            actionBar.setTitle("BichanaKandi,Sylhet");
            text1.setText(R.string.lokoncora);
            imageView.setImageResource(R.drawable.kai);
        }
        if(name.equals("Ratargul")){
            textView.setText("Ratargul");
            actionBar.setTitle("Ratargul");
            text1.setText(R.string.jaflog);
            imageView.setImageResource(R.drawable.ratargul);
        }
        if(name.equals("Durgasagor dighi")){
            textView.setText("Durgasagor dighi");
            actionBar.setTitle("Durgasagor dighi");
            text1.setText(R.string.druga);
            imageView.setImageResource(R.drawable.durga);
        }
        if(name.equals("Guthia Mosque")){
            textView.setText("Guthia Mosque");
            actionBar.setTitle("Guthia Mosque");
            text1.setText(R.string.gutia);
            imageView.setImageResource(R.drawable.gutia);
        }
        if(name.equals("Putia Rajbari")){
            textView.setText("Putia Rajbari");
            actionBar.setTitle("Putia Rajbari");
            text1.setText(R.string.putia);
            imageView.setImageResource(R.drawable.rahbari);
        }
        if(name.equals("Safina Park")){
            textView.setText("Safina Park");
            actionBar.setTitle("Safina Park");
            text1.setText(R.string.safina);
            imageView.setImageResource(R.drawable.safina);
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
