package com.fer.aula07_trabalhando_varios_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup  rg01, rg02, rg03, rg04, rg05;
    RadioButton rb01, rb02, rb03, rb04, rb05;
    Button btnEnviar;
    int calc = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg01 = findViewById(R.id.botoes01);
        rg02 = findViewById(R.id.botoes02);
        rg03 = findViewById(R.id.botoes03);
        rg04 = findViewById(R.id.botoes04);
        rg05 = findViewById(R.id.botoes05);
        btnEnviar = findViewById(R.id.btnEnviar);

        rg01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
//                int idBtn = rg01.getCheckedRadioButtonId();
                rb01 = findViewById(checkedId);
                if(rb01.getText().equals("Sim"))
                        calc+=1;
                else calc-=1;
                rb01 = findViewById(R.id.bt1r01);
                rb01.setEnabled(false);
                rb01 = findViewById(R.id.bt1r02);
                rb01.setEnabled(false);
//                Toast.makeText(MainActivity.this, rb01.getText(),Toast.LENGTH_SHORT).show();
            }
        });

        rg03.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                rb03 = findViewById(i);
                if(rb03.getText().equals("Sim"))
                    calc+=1;
                else calc-=1;
                rb03 = findViewById(R.id.bt3r01);
                rb03.setEnabled(false);
                rb03 = findViewById(R.id.bt3r02);
                rb03.setEnabled(false);
            }
        });
        rg04.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                rb04 = findViewById(i);
                if(rb04.getText().equals("Sim"))
                    calc+=1;
                else calc-=1;
                rb04 = findViewById(R.id.bt4r01);
                rb04.setEnabled(false);
                rb04 = findViewById(R.id.bt4r02);
                rb04.setEnabled(false);
            }
        });
        rg05.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                rb05 = findViewById(i);
                if(rb05.getText().equals("Sim"))
                    calc+=1;
                else calc-=1;
                rb05 = findViewById(R.id.bt5r01);
                rb05.setEnabled(false);
                rb05 = findViewById(R.id.bt5r02);
                rb05.setEnabled(false);
            }
        });

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ResultActivity2.class);
                i.putExtra("calc",calc);
                startActivity(i);
                finish();
            }
        });

    }

    public void ativarBtn02(View view){
        int idBtn = rg02.getCheckedRadioButtonId();
        rb02 = findViewById(idBtn);
        if(rb02.getText().equals("Sim"))
            calc+=1;
        else calc-=1;
        rb02 = findViewById(R.id.bt2r01);
        rb02.setEnabled(false);
        rb02 = findViewById(R.id.bt2r02);
        rb02.setEnabled(false);
    }
}