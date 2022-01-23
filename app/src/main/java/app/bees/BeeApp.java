package app.bees;

import android.app.Application;

import app.bees.db.BeeDatabase;

public class BeeApp extends Application {
    public BeeDatabase getDb() {
        return BeeDatabase.getInstance(this.getApplicationContext());
    }
}
