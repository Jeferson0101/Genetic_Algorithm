/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author Jeferson
 */
public class Teachers {

    @SerializedName("@short")
    @Expose
    private String abbreviation;
    
    @SerializedName("@name")
    @Expose
    private String name;

    @SerializedName("@id")
    @Expose
    private int id;

    @SerializedName("@timeoff")
    @Expose
    private String timeOff;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTimeOff() {
        return timeOff;
    }

    public void setTimeOff(String timeOff) {
        this.timeOff = timeOff;
    }

}
