package com.dsi32g14.khzenty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class vetement_homme extends AppCompatActivity {
//vetement pour les hommes
    protected ListView maListViewPerso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vetement_homme);
        maListViewPerso = findViewById(R.id.list_view);
        ArrayList<HashMap<String, String>> listItem = new ArrayList<>();
        HashMap<String, String> map;
        map = new HashMap<>();
        map.put("titre", "PULL-OVERS");
        map.put("description", "TAILLE : 38 ");
        map.put("prix", "PRIX : 30 DT");
        map.put("img", String.valueOf(R.drawable.pull_homme));
        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", "DOUDOUNE");
        map.put("description", "TAILLE : 38 ");
        map.put("prix", "PRIX : 120 DT");
        map.put("img", String.valueOf(R.drawable.doudoune_homme));
        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", "CHEMISE");
        map.put("description", "TAILLE : 38 ");
        map.put("prix", "PRIX : 80 DT");
        map.put("img", String.valueOf(R.drawable.chemise_homme));

        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", "CHEMISE");
        map.put("description", "TAILLE : M ");
        map.put("prix", "PRIX : 70.208 DT");
        map.put("img", String.valueOf(R.drawable.chemise));
        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", "PANTALON ");
        map.put("description", "TAILLE : 40 ");
        map.put("prix", "PRIX : 100.500 DT");
        map.put("img", String.valueOf(R.drawable.pantalon_gris_homme));
        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", "TENU ");
        map.put("description", "TAILLE : 38 ");
        map.put("prix", "PRIX : 190.500 DT");
        map.put("img", String.valueOf(R.drawable.tenu_homme_complet));
        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", "PANTALON ");
        map.put("description", "TAILLE : S - M - L ");
        map.put("prix", "PRIX : 90.500 DT");
        map.put("img", String.valueOf(R.drawable.pantalon_maron_homme));
        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", "TENU ");
        map.put("description", "TAILLE : S - M - L - XL ");
        map.put("prix", "PRIX : 190DT");
        map.put("img", String.valueOf(R.drawable.tenu_homme));
        listItem.add(map);

        SimpleAdapter adapter = new SimpleAdapter(this.getBaseContext(),
                listItem,
                R.layout.items_homme,
                new String[]{"img", "titre", "description","prix"},
                new int[]{R.id.imageView, R.id.titre, R.id.description,R.id.prix});
        // On attribue à notre "ListView" l'adapter que l'on vient de créer
        maListViewPerso.setAdapter(adapter);
        maListViewPerso.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Méthode 1
                HashMap map = (HashMap) maListViewPerso.getItemAtPosition(position);
                Toast.makeText(vetement_homme.this, (String) map.get("titre"),
                        Toast.LENGTH_SHORT).show();
                // Méthode 2
                /*String selectedItem = ((TextView) view.findViewById(R.id.titre)).getText().toString();
                Toast.makeText(MainActivity.this, selectedItem, Toast.LENGTH_SHORT).show();*/
            }
        });



    }
    public void paiement_article(View View) {
        startActivity(new Intent(vetement_homme.this,Paiement_Article.class));
    }

}


