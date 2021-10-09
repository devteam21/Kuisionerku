package com.example.kuisionerku;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class CricketerAdapter extends RecyclerView.Adapter<CricketerAdapter.CricketerView> {



    ArrayList<Calling_data_keluarga> cricketersList;

    public CricketerAdapter(ArrayList<Calling_data_keluarga> cricketersList) {
        this.cricketersList = cricketersList;
    }

    @NonNull
    @Override
    public CricketerView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_expand_cardview,parent, false);
        return new CricketerView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CricketerView holder, int position) {


        Calling_data_keluarga crikceter = cricketersList.get(position);

        holder.textCricketername.setText(crikceter.getCricketerName());

        String status =  crikceter.getTeamName();


        holder.textTeamName.setText(crikceter.getTeamName());
        holder.linearLayout.setTag(position);


        holder.checkBoxExpand.setOnClickListener(v -> {
            if (cricketersList.get(position).getSelected() & holder.linearLayout.getVisibility() == View.VISIBLE) {
                holder.linearLayout.setVisibility(View.GONE);
                cricketersList.get(position).setSelected(false);
                holder.textOutput.setText("DEBUG");

                if (holder.checkBoxPil1.isChecked()){
                    Toast.makeText(v.getContext(), "0", Toast.LENGTH_SHORT).show();
                }

                if (holder.checkBoxPil2.isChecked()){
                    Toast.makeText(v.getContext(), "1", Toast.LENGTH_SHORT).show();
                }

                if (holder.checkBoxPil3.isChecked()){
                    Toast.makeText(v.getContext(), "2", Toast.LENGTH_SHORT).show();
                }

                if (holder.checkBoxPil4.isChecked()){
                    Toast.makeText(v.getContext(), "3", Toast.LENGTH_SHORT).show();
                }

                if (holder.checkBoxPil5.isChecked()){
                    Toast.makeText(v.getContext(), "4", Toast.LENGTH_SHORT).show();
                }

                if (holder.checkBoxPil6.isChecked()){
                    Toast.makeText(v.getContext(), "5", Toast.LENGTH_SHORT).show();
                }

            } else {
                TransitionManager.beginDelayedTransition(holder.linearLayout, new AutoTransition());
                holder.linearLayout.setVisibility(View.VISIBLE);
                cricketersList.get(position).setSelected(true);
                holder.textOutput.setText("ID "+ position + " STATUS " + status);


            }
        });




    }


    @Override
    public int getItemCount() {
        return cricketersList.size();
    }

    public class CricketerView extends RecyclerView.ViewHolder{

        TextView textCricketername, textTeamName, textOutput;
        CheckBox checkBoxExpand, checkBoxPil1, checkBoxPil2, checkBoxPil3, checkBoxPil4, checkBoxPil5, checkBoxPil6;
        LinearLayout linearLayout;

        public CricketerView(@NonNull View itemView) {
            super(itemView);


            textCricketername = itemView.findViewById(R.id.text_cricket_name);
            textTeamName = itemView.findViewById(R.id.text_status_keluarga);
            textOutput = itemView.findViewById(R.id.text_output);

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
