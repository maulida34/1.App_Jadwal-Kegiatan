package com.example.appjadwalkegiatan;

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

public class MainActivity extends AppCompatActivity {

    Button btSave, btView;
    TextView tvMasukan;
    EditText edNama, edKeterangan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btSave = findViewById(R.id.btSave);
        btView = findViewById(R.id.btView);
        edNama =findViewById(R.id.edNama);
        edKeterangan = findViewById(R.id.edKeterangan);

        btSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringNama = edNama.getText().toString();
                String stringKeterangan = edKeterangan.getText().toString();

                if (stringNama.length() <=0 || stringKeterangan.length() <=0){
                    Toast.makeText(MainActivity.this, "Enter ALL DATA", Toast.LENGTH_SHORT).show();

                }else {

                }

            }
        });

    }
}