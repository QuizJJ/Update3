package com.example.quizproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button entrar;
    private TextView cadsatrarse;
    private Button jogarSemLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);setContentView(R.layout.activity_main);

        cadsatrarse= findViewById(R.id.text_cadastrase);
        entrar = findViewById(R.id.button_entrar);
//        cadastrar = findViewById(R.id.button_cadastrar);
//        jogarSemLogin = findViewById(R.id.button_entrar_sem_login);

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),ActivityHomeQuiz.class);
                startActivity(intent);

            }
        });

        cadsatrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),AcitivtyCAdastro.class);
                startActivity(intent);

            }
        });
//
//        jogarSemLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent intent = new Intent(getApplicationContext(),ActivityHomeQuiz.class);
//                startActivity(intent);
//
//            }
//        });
    }
}