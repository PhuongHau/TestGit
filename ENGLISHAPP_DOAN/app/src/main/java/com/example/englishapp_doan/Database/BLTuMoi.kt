package com.example.englishapp.Database

import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import com.example.englishapp.DanhSachTu.TuMoi


open class BLTuMoi(context: Context?, name: String?, factory: SQLiteDatabase.CursorFactory?, version: Int
) : MyDatabase(context, name, factory, version) {


    fun Insert_TuMoi(eng:String,viet:String,nghia:String,vidu:String)
    {
       QueryData("insert into tumoi values('"+eng+"','"+viet+"','"+nghia+"','"+vidu+"')")
    }


    fun Delete_TuMoi()
    {
        QueryData("delete from tumoi")
    }
    fun DeleteTuMoibyId(eng:String)
    {
        QueryData("delete from tumoi where eng='"+eng+"'")
    }

    fun Update_TuMoi(eng:String,viet:String, nghia:String)
    {
        QueryData("update tumoi set viet ='"+viet+"',nghia ='"+viet+"' where eng = '"+eng+"'")
    }

    fun Get_TuMoiById(eng:String):TuMoi
    {
        var cv: TuMoi = TuMoi("", "","","")
        var data: Cursor = this.GetData("select * from tumoi where eng='"+eng+"'")
        while(data.moveToNext())
        {
            cv.Eng= data.getString(0)
            cv.Viet= data.getString(1)
            cv.Nghia= data.getString(2)
            cv.ViDu=data.getString(3)

        }
        return  cv
    }

    fun GetList_TuMoi():ArrayList<TuMoi>
    {
        var lst: ArrayList<TuMoi> = ArrayList<TuMoi>()
        var data: Cursor = this.GetData("select * from tumoi")
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

    fun GetList_TuMoi_Asc():ArrayList<TuMoi>
    {
        var lst: ArrayList<TuMoi> = ArrayList<TuMoi>()
        var data: Cursor = this.GetData("select * from tumoi order by eng")
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