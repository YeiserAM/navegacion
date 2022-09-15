package com.example.navegacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private EditText txtuser, txtpass;
    private Button botonlogin;
        static final String user= "yeiser@upeu.com";
        static final String pass= "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtuser = findViewById(R.id.edtuser);
        txtpass = findViewById(R.id.edtclave);
        botonlogin = findViewById(R.id.btnlogin);
    }

    public void login(View view){
        String username = txtuser.getText().toString().trim();
        String password = txtpass.getText().toString().trim();

        if (username.equals("") || password.equals("")){
            Toast.makeText(getApplicationContext(), "Ingresar Datos: ", Toast.LENGTH_LONG).show();
        }else{
            if (username.equals(user) && password.equals(pass)){
                Toast.makeText(getApplicationContext(), "Bienvenido", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("pupil", user);
                startActivity(intent);
            }else{
                Toast.makeText(getApplicationContext(), "Datos Incorrectos", Toast.LENGTH_LONG).show();
            }
        }
    }
}