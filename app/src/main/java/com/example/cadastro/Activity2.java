package com.example.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent2 = getIntent();

        Bundle parametro = intent2.getExtras();

        if(parametro != null) {

            String usuario = parametro.getString("usuario_key");
            String emal = parametro.getString("email_key");
            String senha = parametro.getString("senha_key");

            Toast.makeText(Activity2.this, "Usuário:" + usuario + "| Email:" + emal + "| senha:" + senha + "CONFIRME SEU EMAIL", Toast.LENGTH_LONG).show();

            }
        }
    }
}
