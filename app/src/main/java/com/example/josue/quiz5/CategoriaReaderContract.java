package com.example.josue.quiz5;

import android.provider.BaseColumns;

/**
 * Created by josue on 24/10/2017.
 */

public class CategoriaReaderContract {

    public static class Categoria implements BaseColumns{
        public static final String TABLE_NAME = "CATEGORIA";
        public static final String COLUMN_ID = "ID";
        public static final String COLUMN_DESCRIPCION="DESCRIPCION";
        public static final String COLUMN_ICON="ICONO";
    }

}
