package com.example.kuisionerku;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;

public class ExpandCardview extends AppCompatActivity {

    MaterialCardView cardView;
    CheckBox expand;
    LinearLayout hiddenLayout, cobak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expand_cardview);

        cardView = findViewById(R.id.material_card_view);
        expand = findViewById(R.id.checkbox_expand);
        hiddenLayout = findViewById(R.id.layout_expand);




    }

}