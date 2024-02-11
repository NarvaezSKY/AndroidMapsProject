package com.narvaez.lugarespopayn.model
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class BdHelper(
    context: Context?,

    ) : SQLiteOpenHelper(context,
    Constantes.NOM_DB,
    null,
    Constantes.VERSION_BD) {

    override fun onCreate(db: SQLiteDatabase?) {

        db?.execSQL(Constantes.TABLE)
    }


    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        db?.execSQL("DROP TABLE IF EXISTS DatosUbicacion")
        onCreate(db)
    }
}