package app.bees.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ColonyDao {
    @Query("SELECT * FROM colony")
    List<Colony> getAll();

    @Query("SELECT * FROM colony WHERE _id = :colonyId")
    Colony getById(int colonyId);

    @Insert
    void add(Colony colony);
}
