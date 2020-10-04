package com.example.englishapp.Database

import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import com.example.englishapp.DanhSachTu.TuMoi


open class BLTuDaNho(context: Context?, name: String?, factory: SQLiteDatabase.CursorFactory?, version: Int
) : MyDatabase(context, name, factory, version) {


    fun Insert_tudanho(tumoi:TuMoi)
    {
        QueryData("insert into tudanho values('"+tumoi.Eng+"','"+tumoi.Viet+"','"+tumoi.Nghia+"','"+tumoi.ViDu+"')")
    }


    fun Delete_tudanho()
    {
        QueryData("delete from tudanho")
    }
    fun DeleteTuMoibyId(eng:String)
    {
        QueryData("delete from tudanho where eng='"+eng+"'")
    }



    fun Get_tudanhoById(eng:String):TuMoi
    {
        var cv: TuMoi = TuMoi("", "","","")
        var data: Cursor = this.GetData("select * from tudanho where eng='"+eng+"'")
        while(data.moveToNext())
        {
            cv.Eng= data.getString(0)
            cv.Viet= data.getString(1)
            cv.Nghia= data.getString(2)
            cv.ViDu=data.getString(3)

        }
        return  cv
    }

    fun GetList_tudanho():ArrayList<TuMoi>
    {
        var lst: ArrayList<TuMoi> = ArrayList<TuMoi>()
        var data: Cursor = this.GetData("select * from tudanho")
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

    fun GetList_tudanho_Asc():ArrayList<TuMoi>
    {
        var lst: ArrayList<TuMoi> = ArrayList<TuMoi>()
        var data: Cursor = this.GetData("select * from tudanho order by eng")
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