package com.example.josue.quiz5;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by josue on 24/10/2017.
 */

public class CategoriaOpenHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION=1;
    private static final String DATABASE_NAME="presupuesto.db";
    private static final String create = "CREATE TABLE "+ CategoriaReaderContract.Categoria.TABLE_NAME
            + " ( " + CategoriaReaderContract.Categoria.COLUMN_ID +" TEXT PRIMARY KEY ,"+ CategoriaReaderContract.Categoria.COLUMN_DESCRIPCION +" TEXT ,"
            + CategoriaReaderContract.Categoria.COLUMN_DESCRIPCION +" TEXT );";
    private static final String upgrade ="DROP TABLE IF EXISTS " + CategoriaReaderContract.Categoria.TABLE_NAME;

    public CategoriaOpenHelper(Context context){super(context, DATABASE_NAME,null,DATABASE_VERSION);}

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(upgrade);
    }
}
