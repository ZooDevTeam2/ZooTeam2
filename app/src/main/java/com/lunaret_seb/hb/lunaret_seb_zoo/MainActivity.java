package com.lunaret_seb.hb.lunaret_seb_zoo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final TextView textList = (TextView)findViewById(R.id.text_list);

        FloatingActionButton fab_anim = (FloatingActionButton) findViewById(R.id.fab_anim);
        fab_anim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   textList.setText("Liste des animaux du zoo");
                Intent intent = new Intent(MainActivity.this, Listeanimaux.class);
                startActivity(intent);
            }
        });



        FloatingActionButton fab_enclos = (FloatingActionButton) findViewById(R.id.fab_enclos);
        fab_enclos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textList.setText("Liste des enclos du zoo");
            }
        });
        FloatingActionButton fab_stock = (FloatingActionButton) findViewById(R.id.fab_stock);
        fab_stock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textList.setText("Liste des stock du zoo");
            }
        });
        FloatingActionButton fab_tiquet = (FloatingActionButton) findViewById(R.id.fab_tiquet);
        fab_tiquet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Bouton Tiquets", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                textList.setText("Liste des tiquet du zoo");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}