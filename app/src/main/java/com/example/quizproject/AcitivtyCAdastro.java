package com.example.quizproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.core.operation.Merge;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.SetOptions;

public class AcitivtyCAdastro extends AppCompatActivity {

    private EditText nome;
    private EditText email;
    private EditText senha;
    private Button salvarCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);setContentView(R.layout.activity_acitivty_c_adastro);

        nome = findViewById(R.id.cadastro_nome);
        email = findViewById(R.id.cadastro_email);
        senha = findViewById(R.id.cadastro_senha);
        salvarCadastro = findViewById(R.id.salvar_cadastro_oio);

        final FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance();

        final FirebaseFirestore fire = FirebaseFirestore.getInstance();

        salvarCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ModelClassUsuario usuario = new ModelClassUsuario(nome.getText().toString(),email.getText().toString(),senha.getText().toString());

                fire.collection("Usuarios").document(nome.getText().toString()).set(usuario, SetOptions.merge()).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Toast.makeText(AcitivtyCAdastro.this, "", Toast.LENGTH_SHORT).show();
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(AcitivtyCAdastro.this, "Error", Toast.LENGTH_SHORT).show();
                    }
                });



            }
        });




    }
}