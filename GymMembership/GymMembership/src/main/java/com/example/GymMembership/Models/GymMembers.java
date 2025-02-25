package com.example.GymMembership.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GymMembers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long Id;

    @JsonProperty("memberID")
    private String memberID;

    @JsonProperty("name")
    private String name;

    @JsonProperty("type")
    private String membershipType;

    @JsonProperty("status")
    private String status;

    @JsonProperty("workoutPlan")
    private String workoutPlan;

    public GymMembers() {
    }

    public GymMembers(long id, String memberID, String name, String membershipType, String status, String workoutPlan) {
        Id = id;
        this.memberID = memberID;
        this.name = name;
        this.membershipType = membershipType;
        this.status = status;
        this.workoutPlan = workoutPlan;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWorkoutPlan() {
        return workoutPlan;
    }

    public void setWorkoutPlan(String workoutPlan) {
        this.workoutPlan = workoutPlan;
    }
}
