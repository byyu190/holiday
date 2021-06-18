package com.example.holiday.model.note;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "note_table")
public class Note {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String tanggal;

    private String description;


    public Note(String tanggal, String description) {
        this.tanggal = tanggal;
        this.description = description;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getDescription() {
        return description;
    }

}
