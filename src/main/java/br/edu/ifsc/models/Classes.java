/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/**
 *
 * @author Jeferson
 */
public class Classes {

    public ArrayList<Lessons> getLessons() {
        return lessons;
    }

    public void setLessons(ArrayList<Lessons> lessons) {
        this.lessons = lessons;
    }
    
    // armazena as lessons do curso
    ArrayList<Lessons> lessons = new ArrayList<>();
    
    @SerializedName("@id")
    @Expose
    private int id;
    
    @SerializedName("@name")
    @Expose
    private String name;
    
    @SerializedName("@short")
    @Expose
    private String abbreviation;
    
    @SerializedName("@teacherid")
    @Expose
    private int teacherID;
    
    @SerializedName("@timeoff")
    @Expose
    private String timeOff;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getTimeOff() {
        return timeOff;
    }

    public void setTimeOff(String timeOff) {
        this.timeOff = timeOff;
    }
    
    
}
