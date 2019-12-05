package com.dsi32g14.khzenty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Forget_pass extends AppCompatActivity {
    EditText email;
    TextView valid ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_pass);
        email=findViewById(R.id.registered_emailid);
        valid=findViewById(R.id.forgot_button);
    }
    //evement sur le clique
    public void retour(View view) {
        //test sur les champs
        if (email.getText().toString().isEmpty()){
            email.setError("Email vide !");
        }
        else {
            //sinon l'affichage de alert de dialog
            openDialog();
        }
    }
    //methode alert
    public void openDialog(){
        ExempleDialog exampleDialog = new ExempleDialog();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }
    public void back(View view) {
        startActivity(new Intent(Forget_pass.this,Login.class));
    }

}
