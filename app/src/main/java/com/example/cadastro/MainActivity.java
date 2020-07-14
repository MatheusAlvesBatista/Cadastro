package com.example.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtusuario;
    private EditText txtsenha;
    private EditText txtemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtusuario = (EditText) findViewById(R.id.txtusuario);
        txtsenha = (EditText) findViewById(R.id.txtsenha);
        txtemail = (EditText) findViewById(R.id.txtemail);
    }

    public void Enviar(View view) {

        String usuario = txtusuario.getText().toString();
        String senha = txtsenha.getText().toString();
        String emal = txtemail.getText().toString();

        Intent intentMain = new Intent (getApplicationContext(), Activity2.class);
        Bundle parametro = new Bundle();

        parametro.putString("usuario_key", usuario);
        parametro.putString("email_key", emal);
        parametro.putString("senha_key", senha);

        intentMain.putExtras(parametro);

        startActivity(intentMain);
        }
    }
}
