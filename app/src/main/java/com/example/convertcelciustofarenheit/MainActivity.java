package com.example.convertcelciustofarenheit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etCelcius;
    TextView tvAns;
    Button convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etCelcius = findViewById(R.id.etCelcius);
        tvAns = findViewById(R.id.tvAns);
        convert = findViewById(R.id.btnConvert);


        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double answer;
                double celcius = Double.parseDouble(etCelcius.getText().toString());

                if(celcius == 0){
                    answer = 0;
                }
                else {
                    answer = (celcius * 9/5) + 32;
                }
                tvAns.setText("FARENHEIT is =  " + answer);
            }
        });



    }
}