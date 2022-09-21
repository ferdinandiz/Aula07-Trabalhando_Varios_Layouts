package com.fer.aula07_trabalhando_varios_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultActivity2 extends AppCompatActivity {
    Button btnVoltar;
    ImageView imagem;
    int calc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result2);
        btnVoltar = findViewById(R.id.btnVoltar);
        imagem = findViewById(R.id.imagem);

        Intent i = getIntent();
        calc = i.getIntExtra("calc",0);
        calc+=5;
        if(calc <= 3)
            imagem.setImageResource(R.drawable.vader);
        else if (calc <= 7)
            imagem.setImageResource(R.drawable.luke);
        else
            imagem.setImageResource(R.drawable.yoda);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResultActivity2.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}