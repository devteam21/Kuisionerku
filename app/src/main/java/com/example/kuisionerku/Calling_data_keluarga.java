package com.example.kuisionerku;

import java.io.Serializable;

public class Calling_data_keluarga implements Serializable {

    public String cricketerName, teamName;
    public boolean isSelected;

    public Calling_data_keluarga() {
    }

    public Calling_data_keluarga(String cricketerName, String teamName) {
        this.cricketerName = cricketerName;
        this.teamName = teamName;
    }

    public String getCricketerName() {
        return cricketerName;
    }

    public void setCricketerName(String cricketerName) {
        this.cricketerName = cricketerName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public boolean getSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
