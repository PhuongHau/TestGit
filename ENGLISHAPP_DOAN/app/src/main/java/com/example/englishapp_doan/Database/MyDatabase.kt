package com.example.englishapp.Database

import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

open class MyDatabase(context: Context?, name: String?, factory: SQLiteDatabase.CursorFactory?, version: Int):
    SQLiteOpenHelper(context, name, factory, version) {

    //truy van query khong tra ve du lieu
    fun QueryData(sql:String)
    {
       val database:SQLiteDatabase=this.writableDatabase
        database.execSQL(sql)
    }

    //truy van query co tra ve du lieu

    fun GetData(sql:String):Cursor{
        val database: SQLiteDatabase=this.readableDatabase
        return database.rawQuery(sql,null)
    }

    //xoá một bảng trong database
    fun DeleteTable(table:String)
    {
        QueryData("drop table if exists "+table)
    }
    fun CreateTables()
    {
        QueryData("create table if not exists tumoi(eng varchar(200) primary key,viet varchar(200),nghia varchar(500),vidu varchar(500))")
        QueryData("create table if not exists tuchuanho(eng varchar(200) primary key,viet varchar(200),nghia varchar(500),vidu varchar(500))")
        QueryData("create table if not exists tudanho(eng varchar(200) primary key,viet varchar(200),nghia varchar(500),vidu varchar(500))")
        QueryData("create table if not exists batquitac(cot1 varchar(200) primary key,cot2 varchar(200),cot3 varchar(200),nghia varchar(500))")

    }
    override fun onCreate(p0: SQLiteDatabase?) {


    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }
}