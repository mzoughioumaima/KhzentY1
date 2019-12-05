package com.dsi32g14.khzenty;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.core.Tag;

public class Logup extends AppCompatActivity {
    private FirebaseAuth mAuth;
    EditText email ;
    TextView pass ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logup);
        //l'ulisation de firebase
        mAuth = FirebaseAuth.getInstance();
        //Recuperation des champs
        email = findViewById(R.id.userEmailId);
        pass=findViewById(R.id.password);

    }
    //evenement sur le clique de button signUp
    public void creation_compte (View view){
        String mail=email.getText().toString();
        String password = pass.getText().toString();
        //test sur les champs
         if (mail.isEmpty()){
            email.setError("Mail Vide ");
        }
        else if (password.isEmpty()){
            pass.setError("Mot de Passe Vide ");
        }

        else{
        //creation de compte
         mAuth.createUserWithEmailAndPassword(mail,password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
             @Override
             public void onComplete(@NonNull Task<AuthResult> task) {
                 if(task.isSuccessful()){
                     Log.d("", "createUserWithEmail:success");
                     FirebaseUser user = mAuth.getCurrentUser();
                     Toast.makeText(Logup.this, "Bienvenu.",
                             Toast.LENGTH_SHORT).show();
                     Intent intent= new Intent(Logup.this,MainActivity.class);
                     startActivity(intent);
                 }
                 else {

                     // If sign in fails, display a message to the user.
                     Log.w("", "createUserWithEmail:failure", task.getException());
                     Toast.makeText(Logup.this, "Authentication Echoué .",
                             Toast.LENGTH_SHORT).show();
                 }

                 // ...
             }
         });}

        }



    //Methode permettant de passer d'un interface à l'aute logup --> Login lorsqu'il le user n'a pas de compte
    public void compte(View view) {
            startActivity(new Intent(Logup.this, Login.class));
    }
}