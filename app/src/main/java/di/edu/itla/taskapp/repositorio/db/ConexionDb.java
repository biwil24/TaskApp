package di.edu.itla.taskapp.repositorio.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class ConexionDb extends SQLiteOpenHelper{
    private static final String NOMBRE_DB ="taskapp.db";
    private static final int VERSION_DB= 1;
    private static final String LOG_TAG ="ConexionDb";

    public ConexionDb(Context context) {
        super(context, NOMBRE_DB, null, VERSION_DB);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i(LOG_TAG,"Creando la Base de Datos");
        db.execSQL(EstructuraDb.TABLA_CATEGORIA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //TODO: lo veremos en una segunda etapa

    }
}
