package app.bees.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Colony.class}, version = 1)
public abstract class BeeDatabase extends RoomDatabase {
    public abstract ColonyDao colonyDao();

    private static BeeDatabase _instance;

    public static BeeDatabase getInstance(final Context context) {
      if (_instance == null) {
          synchronized (BeeDatabase.class){
              if (_instance == null) {
                  _instance = Room.databaseBuilder(
                          context.getApplicationContext(),
                          BeeDatabase.class,
                          "bee.db").build();
              }
          }
      }
      return _instance;
    }
}
