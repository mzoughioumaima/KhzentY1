package com.dsi32g14.khzenty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class Paiement_Article extends AppCompatActivity {
//cette classe permet de payer l'article
    protected ListView maListViewPerso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paiement__article);
        maListViewPerso = findViewById(R.id.list_view);
        ArrayList<HashMap<String, String>> listItem = new ArrayList<>();
        HashMap<String, String> map;
        map = new HashMap<>();
        map.put("titre", "Paiement à La Livraison");
        map.put("img", String.valueOf(R.drawable.paiment_liv));
        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", "Carte e-dinar");
        map.put("img", String.valueOf(R.drawable.edinar));
        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", "Carte Bancaire");
        map.put("img", String.valueOf(R.drawable.cartbanc));
        listItem.add(map);
        SimpleAdapter adapter = new SimpleAdapter(this.getBaseContext(),
                listItem,
                R.layout.items_paiement,
                new String[]{"img", "titre"},
                new int[]{R.id.imageView, R.id.titre});
        // On attribue à notre "ListView" l'adapter que l'on vient de créer
        maListViewPerso.setAdapter(adapter);

    }
}