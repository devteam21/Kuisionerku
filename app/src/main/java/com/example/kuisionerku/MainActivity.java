package com.example.kuisionerku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int score1, score2, score3, score4, score5, score6, score7,
            score8, score9, score10, totalScore = 0;

    private RadioGroup radioGroup0, radioGroup1, radioGroup2, radioGroup3, radioGroup4,
            radioGroup5, radioGroup6, radioGroup7, radioGroup8, radioGroup9, radioGroup10;

    private CardView cardView0, cardView1, cardView2, cardView3, cardView4, cardView5,
            cardView6, cardView7, cardView8, cardView9, cardView10;

    private LinearLayout linearLayout0, linearLayout1, linearLayout2, linearLayout3, linearLayout4, linearLayout5,
            linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10;

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

        cardView0 = findViewById(R.id.cv0);
        cardView1 = findViewById(R.id.cv1);
        cardView2 = findViewById(R.id.cv2);
        cardView3 = findViewById(R.id.cv3);
        cardView4 = findViewById(R.id.cv4);
        cardView5 = findViewById(R.id.cv5);
        cardView6 = findViewById(R.id.cv6);
        cardView7 = findViewById(R.id.cv7);
        cardView8 = findViewById(R.id.cv8);
        cardView9 = findViewById(R.id.cv9);
        cardView10 = findViewById(R.id.cv10);

        linearLayout0 = findViewById(R.id.ll0);
        linearLayout1 = findViewById(R.id.ll1);
        linearLayout2 = findViewById(R.id.ll2);
        linearLayout3 = findViewById(R.id.ll3);
        linearLayout4 = findViewById(R.id.ll4);
        linearLayout5 = findViewById(R.id.ll5);
        linearLayout6 = findViewById(R.id.ll6);
        linearLayout7 = findViewById(R.id.ll7);
        linearLayout8 = findViewById(R.id.ll8);
        linearLayout9 = findViewById(R.id.ll9);
        linearLayout10 = findViewById(R.id.ll10);

        cardView0.setOnClickListener(this);
        cardView1.setOnClickListener(this);
        cardView2.setOnClickListener(this);
        cardView3.setOnClickListener(this);
        cardView4.setOnClickListener(this);
        cardView5.setOnClickListener(this);
        cardView6.setOnClickListener(this);
        cardView7.setOnClickListener(this);
        cardView8.setOnClickListener(this);
        cardView9.setOnClickListener(this);
        cardView10.setOnClickListener(this);


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
            Toast.makeText(getApplicationContext(), getString(R.string.tingkatkecanduantinggi), Toast.LENGTH_LONG).show();
        }
        else if (totalScore < 31 && hasilGender == getString(R.string.pria)) {
            Toast.makeText(getApplicationContext(), getString(R.string.tingkatkecanduanrendah), Toast.LENGTH_LONG).show();
        }
        else if (totalScore >= 33 && hasilGender == getString(R.string.wanita)) {
            Toast.makeText(getApplicationContext(), getString(R.string.tingkatkecanduantinggi), Toast.LENGTH_LONG).show();
        }
        else if (totalScore < 33 && hasilGender == getString(R.string.wanita)) {
            Toast.makeText(getApplicationContext(), getString(R.string.tingkatkecanduanrendah), Toast.LENGTH_LONG).show();
        }

        else if (hasilGender == null) {
            Toast.makeText(getApplicationContext(), getString(R.string.genderkosong), Toast.LENGTH_LONG).show();
        }


        Log.v("RESET BUTTON", "PASSED!");
    }

    public void resetScore(View v) {
        totalScore = 0;
        scoreTotal.setText(String.valueOf(totalScore));
        Log.v("RESET BUTTON", "PASSED!");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.cv0:
                int a = (radioGroup0.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
                TransitionManager.beginDelayedTransition(linearLayout0, new AutoTransition());
                radioGroup0.setVisibility(a);
                break;
            case R.id.cv1:
                int b = (radioGroup1.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
                TransitionManager.beginDelayedTransition(linearLayout1, new AutoTransition());
                radioGroup1.setVisibility(b);
                break;
            case R.id.cv2:
                int c = (radioGroup2.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
                TransitionManager.beginDelayedTransition(linearLayout2, new AutoTransition());
                radioGroup2.setVisibility(c);
                break;
            case R.id.cv3:
                int d = (radioGroup3.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
                TransitionManager.beginDelayedTransition(linearLayout3, new AutoTransition());
                radioGroup3.setVisibility(d);
                break;
            case R.id.cv4:
                int e = (radioGroup4.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
                TransitionManager.beginDelayedTransition(linearLayout4, new AutoTransition());
                radioGroup4.setVisibility(e);
                break;
            case R.id.cv5:
                int f = (radioGroup5.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
                TransitionManager.beginDelayedTransition(linearLayout5, new AutoTransition());
                radioGroup5.setVisibility(f);
                break;
            case R.id.cv6:
                int g = (radioGroup6.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
                TransitionManager.beginDelayedTransition(linearLayout6, new AutoTransition());
                radioGroup6.setVisibility(g);
                break;
            case R.id.cv7:
                int h = (radioGroup7.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
                TransitionManager.beginDelayedTransition(linearLayout7, new AutoTransition());
                radioGroup7.setVisibility(h);
                break;
            case R.id.cv8:
                int i = (radioGroup8.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
                TransitionManager.beginDelayedTransition(linearLayout8, new AutoTransition());
                radioGroup8.setVisibility(i);
                break;
            case R.id.cv9:
                int j = (radioGroup9.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
                TransitionManager.beginDelayedTransition(linearLayout9, new AutoTransition());
                radioGroup9.setVisibility(j);
                break;
            case R.id.cv10:
                int k = (radioGroup10.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
                TransitionManager.beginDelayedTransition(linearLayout10, new AutoTransition());
                radioGroup10.setVisibility(k);
                break;
        }
    }
}