package com.example.kuisionerku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Data_keluarga extends AppCompatActivity implements View.OnClickListener {

    Button buttonadd, selanjutnya;
    LinearLayout layoutList;
    List<String> teamList = new ArrayList<>();
    ArrayList<Calling_data_keluarga> cricketerList = new ArrayList<>();
    int nilai = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_keluarga);

        buttonadd = findViewById(R.id.tambah_cardview);
        layoutList = findViewById(R.id.layout_list);
        selanjutnya = findViewById(R.id.selanjutnya);


        buttonadd.setOnClickListener(this);
        selanjutnya.setOnClickListener(this);


        teamList.add("AYAH");
        teamList.add("IBU");


    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.tambah_cardview:

                addView();

                break;

            case  R.id.selanjutnya:

                if (checkIfValidandRead()){

                    Intent intent = new Intent(Data_keluarga.this,Activity_List_keluarga.class);
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("list", cricketerList);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                    break;
        }
    }

    private boolean checkIfValidandRead() {

        cricketerList.clear();
        boolean result = true;
        for (int i=0; i < layoutList.getChildCount(); i++){

            View cricketView = layoutList.getChildAt(i);

            EditText editTextName = (EditText)cricketView.findViewById(R.id.edit_cricketer_name);
            AppCompatSpinner spinnerTeam = (AppCompatSpinner)cricketView.findViewById(R.id.spinner_team);

            Calling_data_keluarga cricketer = new Calling_data_keluarga();

            if (!editTextName.getText().toString().equals("")){
                cricketer.setCricketerName(editTextName.getText().toString());
            }else {
                result = false;
                break;
            }

            if (spinnerTeam.getSelectedItemPosition() != -1){
                cricketer.setTeamName(teamList.get(spinnerTeam.getSelectedItemPosition()));

            }


            else {
                result = false;
                break;
            }
            cricketerList.add(cricketer);

        }


        if (cricketerList.size() == 0){
            result = false;
            Toast.makeText(this, "Tambahkan data keluarga", Toast.LENGTH_SHORT).show();
        } else if (!result){
            Toast.makeText(this, "Data keluarga berhasil ditambahkan", Toast.LENGTH_SHORT).show();
        }

        return result;
    }

    private void addView() {

        final View cricketView = getLayoutInflater().inflate(R.layout.row_tambah_keluarga, null, false);

        EditText editText = cricketView.findViewById(R.id.edit_cricketer_name);
        AppCompatSpinner spinnerTeam = cricketView.findViewById(R.id.spinner_team);
        ImageView imageClose = cricketView.findViewById(R.id.image_remove);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,teamList);
        spinnerTeam.setAdapter(arrayAdapter);

        imageClose.setOnClickListener(v -> removeView(cricketView));

        layoutList.addView(cricketView);

        if (layoutList.getChildCount() >= 3) {

            teamList.add("ANAK " + nilai++);

        }


    }

    private void removeView(View view){

        layoutList.removeView(view);


        teamList.remove("ANAK " + --nilai);

        if (nilai == 0) {
            nilai = 1;
        }




    }
}