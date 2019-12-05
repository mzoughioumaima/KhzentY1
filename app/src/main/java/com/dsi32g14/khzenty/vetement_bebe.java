package com.dsi32g14.khzenty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class vetement_bebe extends AppCompatActivity {
    //les vetements de bebes
    protected ListView maListViewPerso;
    android.widget.ImageView ImageView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vetement_bebe);
        maListViewPerso = findViewById(R.id.list_view);
        ImageView = findViewById(R.id.panier);
        ArrayList<HashMap<String, String>> listItem = new ArrayList<>();
        HashMap<String, String> map;

        //les cpmposants d'une map
        map = new HashMap<>();
        map.put("titre", "GILET");
        map.put("description", "TAILLE : 3 ");
        map.put("prix", "PRIX : 20 DT");
        map.put("img", String.valueOf(R.drawable.gilet_enfant));
        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", "PULL");
        map.put("description", "TAILLE : 1 ");
        map.put("prix", "PRIX : 10 DT");
        map.put("img", String.valueOf(R.drawable.pull_blanc_enfant));
        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", "TENU");
        map.put("description", "TAILLE : 3 ");
        map.put("prix", "PRIX : 80 DT");
        map.put("img", String.valueOf(R.drawable.tenu_enfant));

        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", "BONNET");
        map.put("description", "TAILLE : 1 ");
        map.put("prix", "PRIX : 10.208 DT");
        map.put("img", String.valueOf(R.drawable.bonnet_enfant));
        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", "JUPE ");
        map.put("description", "TAILLE : 2 ");
        map.put("prix", "PRIX : 20.500 DT");
        map.put("img", String.valueOf(R.drawable.jupes));
        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", "ROBE ");
        map.put("description", "TAILLE : 2 ");
        map.put("prix", "PRIX : 30.500 DT");
        map.put("img", String.valueOf(R.drawable.robe_marron_enfant));
        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", "COMBIN ");
        map.put("description", "TAILLE : 1 - 2  ");
        map.put("prix", "PRIX : 90.500 DT");
        map.put("img", String.valueOf(R.drawable.combi_enfant));
        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", "CHEC ");
        map.put("description", "TAILLE : 1 - 2 - 3  ");
        map.put("prix", "PRIX : 190DT");
        map.put("img", String.valueOf(R.drawable.pull_rie));
        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", "COMBIN ");
        map.put("description", "TAILLE : 3 ");
        map.put("prix", "PRIX : 50DT");
        map.put("img", String.valueOf(R.drawable.jaune));
        listItem.add(map);

        map = new HashMap<>();
        map.put("titre", "TENU ");
        map.put("description", "TAILLE : 2  ");
        map.put("prix", "PRIX : 190DT");
        map.put("img", String.valueOf(R.drawable.tenu_rouge));
        listItem.add(map);
        SimpleAdapter adapter = new SimpleAdapter(this.getBaseContext(),
                listItem,
                R.layout.items_bebe,
                new String[]{"img", "titre", "description","prix"},
                new int[]{R.id.imageView, R.id.titre, R.id.description,R.id.prix});
        // On attribue à notre "ListView" l'adapter que l'on vient de créer
        maListViewPerso.setAdapter(adapter);
        maListViewPerso.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Méthode 1
                HashMap map = (HashMap) maListViewPerso.getItemAtPosition(position);
                Toast.makeText(vetement_bebe.this, (String) map.get("titre"),
                        Toast.LENGTH_SHORT).show();
                // Méthode 2
                /*String selectedItem = ((TextView) view.findViewById(R.id.titre)).getText().toString();

               Toast.makeText(MainActivity.this, selectedItem, Toast.LENGTH_SHORT).show();*/
            }
        });


    }
    public void paiement_article(View View) {
        startActivity(new Intent(vetement_bebe.this,Paiement_Article.class));
    }
}


