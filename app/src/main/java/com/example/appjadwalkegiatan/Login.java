package com.example.appjadwalkegiatan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {

    private Button btLogin;
    private TextView tvLogin;
    private EditText edUsername, edPassword;

    private String username = "VSGA Poliban";
    private String password = "2024";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        btLogin = findViewById(R.id.btLogin);
        edPassword = findViewById(R.id.edPassword);
        edUsername = findViewById(R.id.edUsername);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edUsername.getText().toString().equalsIgnoreCase(username) && edPassword.getText().toString().equalsIgnoreCase(password)){
                    Intent login = new Intent(Login.this,MainActivity.class);
                    startActivity(login);

                    Toast.makeText(Login.this, "Login Berhasil",Toast.LENGTH_SHORT ).show();
                } else {
                    Toast.makeText(Login.this, "Username atau Password yang anda masukan salah",Toast.LENGTH_SHORT ).show();

                }

            }
        });

    }
}