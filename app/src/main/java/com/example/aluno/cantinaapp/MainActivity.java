package com.example.aluno.cantinaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttSalg;
    private Double salgado = 3.80;
    private Double toTal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttSalg = (Button) findViewById(R.id.buttSalg);

        buttSalg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                salgado = Double.parseDouble(buttSalg.getText().toString());

                toTal = salgado;







                /*checkBox1.setOnCheckboxClicked(new View.onCheckboxClicked() {
                    @Override
                    public void onClick(View v) {

                final CheckBox checkBox1  = (CheckBox) findViewById(R.id.checkBox1);

                if (CheckBox.isChecked()) {
                    CheckBox.setChecked(true);


                }}});*/


            }


            });

    }
}
