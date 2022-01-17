package com.example.kjcovidtracker;

public class StateModel {
    private String stateName;
    private String active;
    private String confirmed;
    private String death;
    private String recovered;
    private String delConf;
    private String delDeath;
    private String delRecover;


    public StateModel() {
    }

    public StateModel(String stateName, String active, String confirmed, String death, String recovered, String delConf, String delDeath, String delRecover) {
        this.stateName = stateName;
        this.active = active;
        this.confirmed = confirmed;
        this.death = death;
        this.recovered = recovered;
        this.delConf = delConf;
        this.delDeath = delDeath;
        this.delRecover = delRecover;
    }


    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    public String getDeath() {
        return death;
    }

    public void setDeath(String death) {
        this.death = death;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public String getDelConf() {
        return delConf;
    }

    public void setDelConf(String delConf) {
        this.delConf = delConf;
    }

    public String getDelDeath() {
        return delDeath;
    }

    public void setDelDeath(String delDeath) {
        this.delDeath = delDeath;
    }

    public String getDelRecover() {
        return delRecover;
    }

    public void setDelRecover(String delRecover) {
        this.delRecover = delRecover;
    }
}
