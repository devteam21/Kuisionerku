package com.example.kuisionerku;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

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
        holder.textTeamName.setText(crikceter.getTeamName());
    }

    @Override
    public int getItemCount() {
        return cricketersList.size();
    }

    public class CricketerView extends RecyclerView.ViewHolder{

        TextView textCricketername, textTeamName;
        public CricketerView(@NonNull View itemView) {
            super(itemView);

            textCricketername = (TextView) itemView.findViewById(R.id.text_cricket_name);
            textTeamName = (TextView) itemView.findViewById(R.id.text_status_keluarga);
        }
    }
}
