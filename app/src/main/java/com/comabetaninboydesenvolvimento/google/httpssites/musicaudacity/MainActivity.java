package com.comabetaninboydesenvolvimento.google.httpssites.musicaudacity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void startListaActivity (View view) {
        Intent lista = new Intent(this, ListaActivity.class);
        startActivity(lista);
    }

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
