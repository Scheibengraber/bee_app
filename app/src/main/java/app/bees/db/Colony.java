package app.bees.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "colony")
public class Colony {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="_id")
    public int colonyId;
    @ColumnInfo(name="location")
    public String location;
    @ColumnInfo(name="founding_date")
    public String foundingDate;
    @ColumnInfo(name="name")
    public String name;
}
