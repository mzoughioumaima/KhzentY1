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

public class vetement_femme extends AppCompatActivity {
    //vetement pour les femmes
    protected ListView maListViewPerso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vetement_femme);
        maListViewPerso = findViewById(R.id.list_view);
        ArrayList<HashMap<String, String>> listItem = new ArrayList<>();
        HashMap<String, String> map;
        //l'ajoute des element dans map
        map = new HashMap<>();
        map.put("titre", "PULL-OVERS");
        map.put("description", "TAILLE : 36 ");
        map.put("prix", "PRIX : 30 DT");
        map.put("img", String.valueOf(R.drawable.pul));
        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", "DOUDOUNE");
        map.put("description", "TAILLE : 38 ");
        map.put("prix", "PRIX : 50 DT");
        map.put("img", String.valueOf(R.drawable.jillet));
        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", "ROBE");
        map.put("description", "TAILLE : 38 ");
        map.put("prix", "PRIX : 80 DT");
        map.put("img", String.valueOf(R.drawable.rob));

        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", "GILET");
        map.put("description", "TAILLE : M ");
        map.put("prix", "PRIX : 70.208 DT");
        map.put("img", String.valueOf(R.drawable.jilet_noir));
        listItem.add(map);



        map = new HashMap<>();
        map.put("titre", "GILET");
        map.put("description", "TAILLE : M - S");
        map.put("prix", "PRIX : 50.400 DT");
        map.put("img", String.valueOf(R.drawable.jillet));
        listItem.add(map);


        map = new HashMap<>();
        map.put("titre", "GILET ");
        map.put("description", "TAILLE : S - M - L ");
        map.put("prix", "PRIX : 90.500 DT");
        map.put("img", String.valueOf(R.drawable.pul_couleurs));
        listItem.add(map);

//L'affichage de ces elements
        SimpleAdapter adapter = new SimpleAdapter(this.getBaseContext(),
                listItem,
                R.layout.items_femme,
                new String[]{"img", "titre", "description","prix"},
                new int[]{R.id.imageView, R.id.titre, R.id.description,R.id.prix});
        // On attribue à notre "ListView" l'adapter que l'on vient de créer
        maListViewPerso.setAdapter(adapter);
        maListViewPerso.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Méthode 1
                HashMap map = (HashMap) maListViewPerso.getItemAtPosition(position);
                Toast.makeText(vetement_femme.this, (String) map.get("titre"),
                        Toast.LENGTH_SHORT).show();
                // Méthode 2
                /*String selectedItem = ((TextView) view.findViewById(R.id.titre)).getText().toString();
                Toast.makeText(MainActivity.this, selectedItem, Toast.LENGTH_SHORT).show();*/
            }
        });



    }
    //lorque le user clique sur image de pannier il passe à l'interface pour payer ce article
    public void paiement_article(View View) {
        startActivity(new Intent(vetement_femme.this,Paiement_Article.class));
    }
}

