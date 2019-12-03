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
public class Lessons {
    @SerializedName("@id")
    @Expose
    private int id;
    
    @SerializedName("@subjectid")
    @Expose
    private int subjectId;
    
//    @SerializedName("@groupid")
//    @Expose
//    private String groupId;
//    
    @SerializedName("@classid")
    @Expose
    private int classId;
    
    @SerializedName("@teacherid")
    @Expose
    private String teacherId;
//    
//    @SerializedName("@classroomids")
//    @Expose
//    private int classRoomIds;
    
    @SerializedName("@durationperiods")
    @Expose
    private int durationPeriod;
    
    @SerializedName("@periodsperweek")
    @Expose
    private int periodsPerWeek;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public int getDurationPeriod() {
        return durationPeriod;
    }

    public void setDurationPeriod(int durationPeriod) {
        this.durationPeriod = durationPeriod;
    }

    public int getPeriodsPerWeek() {
        return periodsPerWeek;
    }

    public void setPeriodsPerWeek(int periodsPerWeek) {
        this.periodsPerWeek = periodsPerWeek;
    }

   
    
    
}
