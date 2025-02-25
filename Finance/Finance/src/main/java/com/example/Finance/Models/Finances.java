package com.example.Finance.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Finances {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long Id;

    @JsonProperty("transactionID")
    private String transactionID;

    @JsonProperty("userID")
    private String userID;

    @JsonProperty("type")
    private String type;

    @JsonProperty("amount")
    private String amount;

    @JsonProperty("category")
    private String category;

    @JsonProperty("date")
    private String date;

    @JsonProperty("notes")
    private String notes;

    public Finances() {
    }

    public Finances(long id, String transactionID, String userID, String amount, String type, String category, String date, String notes) {
        Id = id;
        this.transactionID = transactionID;
        this.userID = userID;
        this.amount = amount;
        this.type = type;
        this.category = category;
        this.date = date;
        this.notes = notes;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
