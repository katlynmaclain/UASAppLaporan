package com.example.uasapplaporan.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.uasapplaporan.dao.DatabaseDao;
import com.example.uasapplaporan.model.ModelDatabase;
import com.example.uasapplaporan.dao.DatabaseDao;
import com.example.uasapplaporan.model.ModelDatabase;

@Database(entities = {ModelDatabase.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DatabaseDao databaseDao();
}
