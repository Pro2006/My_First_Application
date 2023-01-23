package com.example.myfirstapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int cash = 312;

    private int palto = 70;
    private int palto_discount = 77;

    private int hat = 25;
    private int hat_discount = 37;

    private int smoking = 53;
    private int smoking_discount = 44;

    private int sorochka = 19;
    private int sorochka_discount = 0;

    private int tufli = 41;
    private int tufli_discount = 32;

    public boolean canBuyComputer() {
        float result;
        result = (palto * (100 - palto_discount) +
                hat * (100 - hat_discount) + smoking * (100 - smoking_discount)
                + sorochka * (100 - sorochka_discount) + tufli * (100 - tufli_discount)) / 100;

        result = cash - result;
        if (result >= 0) return true;
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt = findViewById(R.id.textView);
        Button btn = findViewById(R.id.btn);
        boolean flag = canBuyComputer();
        btn.setText("Купим или нет?");

        btn.setOnClickListener(view -> {
            if (view.getId() == R.id.btn) {
                if (flag) {
                    txt.setText("Мы можем купить одежду!!!");
                    btn.setText("Ураааааа");
                } else {
                    txt.setText("Мы бомжи!!!");
                    btn.setText("Ураааааа");
                }
            }
        });

    }
}