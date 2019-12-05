package com.dsi32g14.khzenty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Categorie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorie);


    }

    //liste des vetements pour les femmes est affich" lorsque il clique sur cette button
    public void cat_femme(View view) {
        startActivity(new Intent(Categorie.this,vetement_femme.class));
    }

    //liste des vetements pour les hommes est affich" lorsque il clique sur cette button
    public void cat_homme(View view) {
        startActivity(new Intent(Categorie.this,vetement_homme.class));
    }

    //liste des vetements pour les bebes est affich" lorsque il clique sur cette button
    public void cat_bebe(View view) {
        startActivity(new Intent(Categorie.this,vetement_bebe.class));
    }
}

