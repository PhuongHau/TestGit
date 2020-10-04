package com.example.englishapp.Database

import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import com.example.englishapp.DanhSachTu.TuMoi


open class BLTuChuaNho(context: Context?, name: String?, factory: SQLiteDatabase.CursorFactory?, version: Int
) : MyDatabase(context, name, factory, version) {


    fun Insert_tuchuanho(tumoi:TuMoi)
    {
        QueryData("insert into tuchuanho values('"+tumoi.Eng+"','"+tumoi.Viet+"','"+tumoi.Nghia+"','"+tumoi.ViDu+"')")
    }


    fun Delete_tuchuanho()
    {
        QueryData("delete from tuchuanho")
    }
    fun Delete_tuchuanhobyId(eng:String)
    {
        QueryData("delete from tuchuanho where eng='"+eng+"'")
    }



    fun Get_tuchuanhoById(eng:String):TuMoi
    {
        var cv: TuMoi = TuMoi("", "","","")
        var data: Cursor = this.GetData("select * from tuchuanho where eng='"+eng+"'")
        while(data.moveToNext())
        {
            cv.Eng= data.getString(0)
            cv.Viet= data.getString(1)
            cv.Nghia= data.getString(2)
            cv.ViDu=data.getString(3)

        }
        return  cv
    }
    fun Get_count_tuchuanho():Int
    {
        var soluong:Int=0
        var data: Cursor = this.GetData("select count(*) from tuchuanho")
        while(data.moveToNext())
        {
            soluong=data.getInt(0)
        }
        return  soluong
    }

    fun GetList_tuchuanho():ArrayList<TuMoi>
    {
        var lst: ArrayList<TuMoi> = ArrayList<TuMoi>()
        var data: Cursor = this.GetData("select * from tuchuanho")
        while(data.moveToNext())
        {
            var cv: TuMoi = TuMoi("", "","","")
            cv.Eng= data.getString(0)
            cv.Viet= data.getString(1)
            cv.Nghia= data.getString(2)
            cv.ViDu=data.getString(3)
            lst.add(cv)
        }
        return lst
    }

    fun GetList_tuchuanho_Asc():ArrayList<TuMoi>
    {
        var lst: ArrayList<TuMoi> = ArrayList<TuMoi>()
        var data: Cursor = this.GetData("select * from tuchuanho order by eng")
        while(data.moveToNext())
        {
            var cv: TuMoi = TuMoi("", "","","")
            cv.Eng= data.getString(0)
            cv.Viet= data.getString(1)
            cv.Nghia= data.getString(2)
            cv.ViDu=data.getString(3)
            lst.add(cv)
        }
        return lst
    }
}