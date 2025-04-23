package com.example.tugas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button button1;

    RadioGroup rg1;
    RadioButton radio_umum, radio_biru, radio_putih;
    Toast toast;
    EditText userfield;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.button1);

        rg1 = (RadioGroup) findViewById(R.id.RG1);
        userfield = (EditText) findViewById(R.id.userfield);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = rg1.getCheckedRadioButtonId();
                RadioButton selectedRadio = (RadioButton) findViewById(selectedId);

                Toast.makeText(MainActivity.this, "Hai " +userfield.getText().toString()+ "" + " kamu adalah " +selectedRadio.getText()
                        , Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, DashboardActivity.class);
                startActivity(intent);
            }
        });


    }}
