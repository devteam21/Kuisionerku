package com.example.kuisionerku;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submit;
    int score1, score2, score3, score4, score5, score6, score7,
            score8, score9, score10, totalScore = 0;

    private RadioGroup radioGroup0, radioGroup1, radioGroup2, radioGroup3, radioGroup4,
            radioGroup5, radioGroup6, radioGroup7, radioGroup8, radioGroup9, radioGroup10;

    private TextView scoreTotal;
    String hasilGender;

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup0 = findViewById(R.id.rg0);
        radioGroup1 = findViewById(R.id.rg1);
        radioGroup2 = findViewById(R.id.rg2);
        radioGroup3 = findViewById(R.id.rg3);
        radioGroup4 = findViewById(R.id.rg4);
        radioGroup5 = findViewById(R.id.rg5);
        radioGroup6 = findViewById(R.id.rg6);
        radioGroup7 = findViewById(R.id.rg7);
        radioGroup8 = findViewById(R.id.rg8);
        radioGroup9 = findViewById(R.id.rg9);
        radioGroup10 = findViewById(R.id.rg10);

        scoreTotal = findViewById(R.id.tvTotalScore);

        //get string array from source
        String[] opsi = getResources().getStringArray(R.array.opsi);

        //create radio buttons1
        RadioButton radioButton;
        for (int i = 0; i < opsi.length; i++) {
            radioButton = new RadioButton(this);
            radioButton.setText(opsi[i]);
            radioButton.setId(i);
            radioGroup1.addView(radioButton);
        }
        //create radio buttons2
        for (int i = 0; i < opsi.length; i++) {
            radioButton = new RadioButton(this);
            radioButton.setText(opsi[i]);
            radioButton.setId(i);
            radioGroup2.addView(radioButton);
        }
        //create radio buttons3
        for (int i = 0; i < opsi.length; i++) {
            radioButton = new RadioButton(this);
            radioButton.setText(opsi[i]);
            radioButton.setId(i);
            radioGroup3.addView(radioButton);
        }
        //create radio buttons4
        for (int i = 0; i < opsi.length; i++) {
            radioButton = new RadioButton(this);
            radioButton.setText(opsi[i]);
            radioButton.setId(i);
            radioGroup4.addView(radioButton);
        }
        //create radio buttons5
        for (int i = 0; i < opsi.length; i++) {
            radioButton = new RadioButton(this);
            radioButton.setText(opsi[i]);
            radioButton.setId(i);
            radioGroup5.addView(radioButton);
        }
        //create radio buttons6
        for (int i = 0; i < opsi.length; i++) {
            radioButton = new RadioButton(this);
            radioButton.setText(opsi[i]);
            radioButton.setId(i);
            radioGroup6.addView(radioButton);
        }
        //create radio buttons7
        for (int i = 0; i < opsi.length; i++) {
            radioButton = new RadioButton(this);
            radioButton.setText(opsi[i]);
            radioButton.setId(i);
            radioGroup7.addView(radioButton);
        }
        //create radio buttons8
        for (int i = 0; i < opsi.length; i++) {
            radioButton = new RadioButton(this);
            radioButton.setText(opsi[i]);
            radioButton.setId(i);
            radioGroup8.addView(radioButton);
        }
        //create radio buttons9
        for (int i = 0; i < opsi.length; i++) {
            radioButton = new RadioButton(this);
            radioButton.setText(opsi[i]);
            radioButton.setId(i);
            radioGroup9.addView(radioButton);
        }
        //create radio buttons10
        for (int i = 0; i < opsi.length; i++) {
            radioButton = new RadioButton(this);
            radioButton.setText(opsi[i]);
            radioButton.setId(i);
            radioGroup10.addView(radioButton);
        }

        //set listener to radio button group0
        radioGroup0.setOnCheckedChangeListener((radioGroup, i) -> {
            switch (i) {
                case R.id.rbPria:
                    hasilGender = getString(R.string.pria);
                    break;
                case R.id.rbWanita:
                    hasilGender = getString(R.string.wanita);
                    break;
            }
        });

        //set listener to radio button group1
        radioGroup1.setOnCheckedChangeListener((group, checkedId) -> {
            int checkedRadioButtonId = radioGroup1.getCheckedRadioButtonId();
            Log.i("ID", String.valueOf(checkedRadioButtonId));

            if (checkedRadioButtonId == 0) {
                score1 = 6;
            }
            else if (checkedRadioButtonId == 1) {
                score1 = 5;
            }
            else if (checkedRadioButtonId == 2) {
                score1 = 4;
            }
            else if (checkedRadioButtonId == 3) {
                score1 = 3;
            }
            else if (checkedRadioButtonId == 4) {
                score1 = 2;
            }
            else if (checkedRadioButtonId == 5) {
                score1 = 1;
            }

        });

        //set listener to radio button group2
        radioGroup2.setOnCheckedChangeListener((group, checkedId) -> {
            int checkedRadioButtonId = radioGroup2.getCheckedRadioButtonId();
            Log.i("ID", String.valueOf(checkedRadioButtonId));

            if (checkedRadioButtonId == 0) {
                score2 = 6;
            }
            else if (checkedRadioButtonId == 1) {
                score2 = 5;
            }
            else if (checkedRadioButtonId == 2) {
                score2 = 4;
            }
            else if (checkedRadioButtonId == 3) {
                score2 = 3;
            }
            else if (checkedRadioButtonId == 4) {
                score2 = 2;
            }
            else if (checkedRadioButtonId == 5) {
                score2 = 1;
            }

        });

        //set listener to radio button group3
        radioGroup3.setOnCheckedChangeListener((group, checkedId) -> {
            int checkedRadioButtonId = radioGroup3.getCheckedRadioButtonId();
            Log.i("ID", String.valueOf(checkedRadioButtonId));

            if (checkedRadioButtonId == 0) {
                score3 = 6;
            }
            else if (checkedRadioButtonId == 1) {
                score3 = 5;
            }
            else if (checkedRadioButtonId == 2) {
                score3 = 4;
            }
            else if (checkedRadioButtonId == 3) {
                score3 = 3;
            }
            else if (checkedRadioButtonId == 4) {
                score3 = 2;
            }
            else if (checkedRadioButtonId == 5) {
                score3 = 1;
            }

        });

        //set listener to radio button group4
        radioGroup4.setOnCheckedChangeListener((group, checkedId) -> {
            int checkedRadioButtonId = radioGroup4.getCheckedRadioButtonId();
            Log.i("ID", String.valueOf(checkedRadioButtonId));

            if (checkedRadioButtonId == 0) {
                score4 = 6;
            }
            else if (checkedRadioButtonId == 1) {
                score4 = 5;
            }
            else if (checkedRadioButtonId == 2) {
                score4 = 4;
            }
            else if (checkedRadioButtonId == 3) {
                score4 = 3;
            }
            else if (checkedRadioButtonId == 4) {
                score4 = 2;
            }
            else if (checkedRadioButtonId == 5) {
                score4 = 1;
            }

        });

        //set listener to radio button group5
        radioGroup5.setOnCheckedChangeListener((group, checkedId) -> {
            int checkedRadioButtonId = radioGroup5.getCheckedRadioButtonId();
            Log.i("ID", String.valueOf(checkedRadioButtonId));

            if (checkedRadioButtonId == 0) {
                score5 = 6;
            }
            else if (checkedRadioButtonId == 1) {
                score5 = 5;
            }
            else if (checkedRadioButtonId == 2) {
                score5 = 4;
            }
            else if (checkedRadioButtonId == 3) {
                score5 = 3;
            }
            else if (checkedRadioButtonId == 4) {
                score5 = 2;
            }
            else if (checkedRadioButtonId == 5) {
                score5 = 1;
            }

        });

        //set listener to radio button group6
        radioGroup6.setOnCheckedChangeListener((group, checkedId) -> {
            int checkedRadioButtonId = radioGroup6.getCheckedRadioButtonId();
            Log.i("ID", String.valueOf(checkedRadioButtonId));

            if (checkedRadioButtonId == 0) {
                score6 = 6;
            }
            else if (checkedRadioButtonId == 1) {
                score6 = 5;
            }
            else if (checkedRadioButtonId == 2) {
                score6 = 4;
            }
            else if (checkedRadioButtonId == 3) {
                score6 = 3;
            }
            else if (checkedRadioButtonId == 4) {
                score6 = 2;
            }
            else if (checkedRadioButtonId == 5) {
                score6 = 1;
            }

        });

        //set listener to radio button group7
        radioGroup7.setOnCheckedChangeListener((group, checkedId) -> {
            int checkedRadioButtonId = radioGroup7.getCheckedRadioButtonId();
            Log.i("ID", String.valueOf(checkedRadioButtonId));

            if (checkedRadioButtonId == 0) {
                score7 = 6;
            }
            else if (checkedRadioButtonId == 1) {
                score7 = 5;
            }
            else if (checkedRadioButtonId == 2) {
                score7 = 4;
            }
            else if (checkedRadioButtonId == 3) {
                score7 = 3;
            }
            else if (checkedRadioButtonId == 4) {
                score7 = 2;
            }
            else if (checkedRadioButtonId == 5) {
                score7 = 1;
            }

        });

        //set listener to radio button group8
        radioGroup8.setOnCheckedChangeListener((group, checkedId) -> {
            int checkedRadioButtonId = radioGroup8.getCheckedRadioButtonId();
            Log.i("ID", String.valueOf(checkedRadioButtonId));

            if (checkedRadioButtonId == 0) {
                score8 = 6;
            }
            else if (checkedRadioButtonId == 1) {
                score8 = 5;
            }
            else if (checkedRadioButtonId == 2) {
                score8 = 4;
            }
            else if (checkedRadioButtonId == 3) {
                score8 = 3;
            }
            else if (checkedRadioButtonId == 4) {
                score8 = 2;
            }
            else if (checkedRadioButtonId == 5) {
                score8 = 1;
            }

        });

        //set listener to radio button group9
        radioGroup9.setOnCheckedChangeListener((group, checkedId) -> {
            int checkedRadioButtonId = radioGroup9.getCheckedRadioButtonId();
            Log.i("ID", String.valueOf(checkedRadioButtonId));

            if (checkedRadioButtonId == 0) {
                score9 = 6;
            }
            else if (checkedRadioButtonId == 1) {
                score9 = 5;
            }
            else if (checkedRadioButtonId == 2) {
                score9 = 4;
            }
            else if (checkedRadioButtonId == 3) {
                score9 = 3;
            }
            else if (checkedRadioButtonId == 4) {
                score9 = 2;
            }
            else if (checkedRadioButtonId == 5) {
                score9 = 1;
            }

        });

        //set listener to radio button group10
        radioGroup10.setOnCheckedChangeListener((group, checkedId) -> {
            int checkedRadioButtonId = radioGroup10.getCheckedRadioButtonId();
            Log.i("ID", String.valueOf(checkedRadioButtonId));

            if (checkedRadioButtonId == 0) {
                score10 = 6;
            }
            else if (checkedRadioButtonId == 1) {
                score10 = 5;
            }
            else if (checkedRadioButtonId == 2) {
                score10 = 4;
            }
            else if (checkedRadioButtonId == 3) {
                score10 = 3;
            }
            else if (checkedRadioButtonId == 4) {
                score10 = 2;
            }
            else if (checkedRadioButtonId == 5) {
                score10 = 1;
            }

        });
    }

    public void submitScore(View v) {

        totalScore = (score1 + score2 + score3 + score4 + score5 + score6 + score7 + score8 + score9 + score10);
        scoreTotal.setText(String.valueOf(totalScore));

        if (totalScore >= 31 && hasilGender == getString(R.string.pria)) {
            Toast.makeText(getApplicationContext(), getString(R.string.tingkatkecanduantinggi), Toast.LENGTH_SHORT).show();
        }
        else if (totalScore < 31 && hasilGender == getString(R.string.pria)) {
            Toast.makeText(getApplicationContext(), getString(R.string.tingkatkecanduanrendah), Toast.LENGTH_SHORT).show();
        }
        else if (totalScore >= 33 && hasilGender == getString(R.string.wanita)) {
            Toast.makeText(getApplicationContext(), getString(R.string.tingkatkecanduantinggi), Toast.LENGTH_SHORT).show();
        }
        else if (totalScore < 33 && hasilGender == getString(R.string.wanita)) {
            Toast.makeText(getApplicationContext(), getString(R.string.tingkatkecanduanrendah), Toast.LENGTH_SHORT).show();
        }

        else if (hasilGender == null) {
            Toast.makeText(getApplicationContext(), getString(R.string.genderkosong), Toast.LENGTH_SHORT).show();
        }


        Log.v("RESET BUTTON", "PASSED!");
        Intent intent = new Intent(MainActivity.this, Data_keluarga.class);
        startActivity(intent);
    }

    public void resetScore(View v) {
        totalScore = 0;
        scoreTotal.setText(String.valueOf(totalScore));
        Log.v("RESET BUTTON", "PASSED!");
    }
}