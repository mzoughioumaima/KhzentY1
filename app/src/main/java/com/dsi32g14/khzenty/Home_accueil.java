package com.dsi32g14.khzenty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home_accueil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_accueil);
    }

    //Button sign_up
    public void sign_up(View view) {
        startActivity(new Intent(Home_accueil.this,Login.class));
    }
    //button sign_in
   public void sign_in(View view) {
        startActivity(new Intent(Home_accueil.this,Logup.class));
    }
}
