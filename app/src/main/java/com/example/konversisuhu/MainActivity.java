package com.example.konversisuhu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtCelcius,txtKelvin,txtFahrenheit,txtRemur;
    Button btn_konversi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCelcius = findViewById(R.id.txtCelcius);
        txtKelvin = findViewById(R.id.txtKelvin);
        txtFahrenheit = findViewById(R.id.txtFahrenheit);
        txtRemur = findViewById(R.id.txtRemur);


    }

    public void konversiSuhu(View view) {
        double C = Double.parseDouble(txtCelcius.getText().toString());
        //Fahrenheit
        double fahrenheit = (C * 1.8) + 32;
        txtFahrenheit.setText(fahrenheit + "");

        double kelvin = (C ) + 273;
        txtKelvin.setText(kelvin + "");

        double reamur = (C * 0.8);
        txtRemur.setText(reamur + "");

    }

    public void clearClick(View view) {
        txtRemur.setText("");
        txtCelcius.setText("");
        txtKelvin.setText("");
        txtFahrenheit.setText("");
    }
}
