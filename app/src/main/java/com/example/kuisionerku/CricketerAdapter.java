package com.example.kuisionerku;

import android.annotation.SuppressLint;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class CricketerAdapter extends RecyclerView.Adapter<CricketerAdapter.CricketerView> {



    ArrayList<Calling_data_keluarga> cricketersList;
    String[] waktupenggunaansmartphone = {"3-5 jam/ hari", "6-8 jam/hari", "> 8 jam/ hari"};
    ArrayList<String> arraySubStat1 = new ArrayList<String>();

    public CricketerAdapter(ArrayList<Calling_data_keluarga> cricketersList) {
        this.cricketersList = cricketersList;
    }

    @NonNull
    @Override
    public CricketerView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_expand_cardview,parent, false);
        return new CricketerView(view);
    }


    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull CricketerView holder, int position) {


        Calling_data_keluarga crikceter = cricketersList.get(position);

        holder.textCricketername.setText(crikceter.getCricketerName());
        String status =  crikceter.getTeamName();

        holder.textTeamName.setText(crikceter.getTeamName());


        holder.checkBoxExpand.setOnClickListener(v -> {
            if (cricketersList.get(position).getSelected() & holder.linearLayout.getVisibility() == View.VISIBLE) {
                holder.linearLayout.setVisibility(View.GONE);
                cricketersList.get(position).setSelected(false);
                if (holder.checkBoxPil1.isChecked()){
                    arraySubStat1.add(holder.pilTextSubStat1.getText().toString());
                }

                if (holder.checkBoxPil2.isChecked()){
                    arraySubStat1.add(holder.pilTextSubStat2.getText().toString());
                }

                if (holder.checkBoxPil3.isChecked()){
                    arraySubStat1.add(holder.pilTextSubStat3.getText().toString());
                }

                if (holder.checkBoxPil4.isChecked()){
                    arraySubStat1.add(holder.pilTextSubStat4.getText().toString());
                }

                if (holder.checkBoxPil5.isChecked()){
                    arraySubStat1.add(holder.pilTextSubStat5.getText().toString());
                }

                if (holder.checkBoxPil6.isChecked()){
                    arraySubStat1.add(holder.pilTextSubStat6.getText().toString());
                }

                holder.textOutput.setText("ID : "+ position + " \nSTATUS : " + status + " \nARRAY : " + arraySubStat1);


            } else {
                TransitionManager.beginDelayedTransition(holder.linearLayout, new AutoTransition());
                holder.linearLayout.setVisibility(View.VISIBLE);
                cricketersList.get(position).setSelected(true);
                arraySubStat1.removeAll(arraySubStat1);



            }


        });


    }


    @Override
    public int getItemCount() {
        return cricketersList.size();
    }

    public class CricketerView extends RecyclerView.ViewHolder{

        TextView textCricketername, textTeamName, textOutput,
                pilTextSubStat1, pilTextSubStat2, pilTextSubStat3, pilTextSubStat4, pilTextSubStat5, pilTextSubStat6;
        CheckBox checkBoxExpand, checkBoxPil1, checkBoxPil2, checkBoxPil3, checkBoxPil4, checkBoxPil5, checkBoxPil6;
        LinearLayout linearLayout;
        Spinner spinner;


        public CricketerView(@NonNull View itemView) {
            super(itemView);


            textCricketername = itemView.findViewById(R.id.text_cricket_name);
            textTeamName = itemView.findViewById(R.id.text_status_keluarga);
            textOutput = itemView.findViewById(R.id.text_output);

            pilTextSubStat1 = itemView.findViewById(R.id.pilTextSubStat1);
            pilTextSubStat2 = itemView.findViewById(R.id.pilTextSubStat2);
            pilTextSubStat3 = itemView.findViewById(R.id.pilTextSubStat3);
            pilTextSubStat4 = itemView.findViewById(R.id.pilTextSubStat4);
            pilTextSubStat5 = itemView.findViewById(R.id.pilTextSubStat5);
            pilTextSubStat6 = itemView.findViewById(R.id.pilTextSubStat6);



            spinner = itemView.findViewById(R.id.spinner_waktupenggunaansmartphone);

            checkBoxExpand = itemView.findViewById(R.id.checkbox_expand);
            checkBoxPil1 = itemView.findViewById(R.id.pil1);
            checkBoxPil2 = itemView.findViewById(R.id.pil2);
            checkBoxPil3 = itemView.findViewById(R.id.pil3);
            checkBoxPil4 = itemView.findViewById(R.id.pil4);
            checkBoxPil5 = itemView.findViewById(R.id.pil5);
            checkBoxPil6 = itemView.findViewById(R.id.pil6);


            linearLayout =  itemView.findViewById(R.id.layout_expand);



        }
    }


}
