/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.models;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Jeferson
 */
public class Data {
    
    public static Data convertJsonInputToFrontObject(String pathOfFile) throws FileNotFoundException {
        return new Gson().fromJson(new FileReader(pathOfFile), Data.class);
        
    }
    //private Data data;

    @SerializedName("lesson1")
    @Expose
    private ArrayList<Lessons> lessons = new ArrayList<>();

    @SerializedName("period1")
    @Expose
    private ArrayList<Periods> periods  = new ArrayList<>();

    @SerializedName("subject1")
    @Expose
    private ArrayList<Subjects> subjects = new ArrayList<>();

    @SerializedName("teacher1")
    @Expose
    private ArrayList<Teachers> teachers = new ArrayList<>();

    @SerializedName("class1")
    @Expose
    private ArrayList<Classes> classes = new ArrayList<>();

//    public Data getData() {
//        return data;
//    }
//
//    public void setData(Data data) {
//        this.data = data;
//    }


    public ArrayList<Lessons> getLessons() {
        return lessons;
    }

    public void setLessons(ArrayList<Lessons> lessons) {
        this.lessons = lessons;
    }

    public ArrayList<Periods> getPeriods() {
        return periods;
    }

    public void setPeriods(ArrayList<Periods> periods) {
        this.periods = periods;
    }

    public ArrayList<Subjects> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subjects> subjects) {
        this.subjects = subjects;
    }

    public ArrayList<Teachers> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teachers> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Classes> getClasses() {
        return classes;
    }

    public void setCourses(ArrayList<Classes> classes) {
        this.classes = classes;
    }

}
