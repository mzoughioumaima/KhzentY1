package com.dsi32g14.khzenty;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login extends AppCompatActivity {
    private FirebaseAuth mAuth;
    EditText editmail ;
    EditText editTextpass ;
    Button inscrire ;
    TextView forgetpass ;
    Button btnSignIn ;
    CheckBox showpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //l'utilisation de firebase pour le login
        mAuth  = FirebaseAuth.getInstance();
        editmail=findViewById(R.id.input_email);
        editTextpass=findViewById(R.id.input_password);
        editmail.getText().toString();
        //cnx à la base de donnee
        mAuth = FirebaseAuth.getInstance();
        findViewById(R.id.signUpBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                connect();
            }
        });
    }

    //button de compte deja existe
    public void inscrire(View view) {
        startActivity(new Intent(Login.this,Logup.class));

    }
    //au cas pass oublie de mot de pass
    public void passOublier(View view) {
        startActivity(new Intent(Login.this,Forget_pass.class));

    }
    //methode de connect
    private void connect(){
        final String email = editmail.getText().toString();
        String password = editTextpass.getText().toString();
        //test sur les champs
        if(email.isEmpty()){
            editmail.setError("Entrer Votre Mail");
        }
        else if (password.isEmpty()){
            editTextpass.setError("Entrer Votre Passe ");
        }
        else {
            //sinon il se connecte le compte deja existe
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            FirebaseUser user = mAuth.getCurrentUser();
                            //le passage d'une autre activite
                            Intent intent= new Intent(Login.this,MainActivity.class);
                            Toast.makeText(Login.this, "Bienvenu.",
                                    Toast.LENGTH_SHORT).show();
                            startActivity(intent);


                        } else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(Login.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                        }

                        // ...
                    }
                });
    }

//l'affichage de password si le sheckbox est cocher
        showpass=findViewById(R.id.show_hide_password);
        showpass.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(!isChecked){
                    editTextpass.setTransformationMethod(PasswordTransformationMethod.getInstance());

                }else {
                    editTextpass.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
            }
        });


    }




}


