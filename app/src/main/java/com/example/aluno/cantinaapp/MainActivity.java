package com.example.aluno.cantinaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Button buttSalg;
    private Double salgado = 3.80;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttSalg = (Button) findViewById(R.id.buttSalg);

        buttSalg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                salgado = Double.parseDouble(buttSalg.getText().toString());


            }


            });

    }
}
