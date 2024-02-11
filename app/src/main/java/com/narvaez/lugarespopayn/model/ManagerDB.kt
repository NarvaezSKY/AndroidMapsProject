package com.narvaez.lugarespopayn.model

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase

data class ManagerDb (val context: Context) {
    lateinit var bd: SQLiteDatabase

    val dbHelper=BdHelper(context) //calling connection
    //Modo escritura
    fun openDbWr(){
        bd=dbHelper.writableDatabase
    }

    //Modo lectura
    fun openDbRd(){
        bd=dbHelper.readableDatabase
    }

    fun insertData(nombreLugar: String, latitud: Double, longitud: Double): Long {
        openDbWr()
        val contenedor = ContentValues()

        contenedor.put("nombreLugar", nombreLugar)
        contenedor.put("latitud", latitud)
        contenedor.put("longitud", longitud)
        //inserting data
        return bd.insert("DatosUbicacion", null, contenedor)
    }



}