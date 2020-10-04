package com.example.englishapp.Database

import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import com.example.englishapp.BatQuiTac.BatquiTac
import com.example.englishapp.DanhSachTu.TuMoi


open class BLDongTuBQT(context: Context?, name: String?, factory: SQLiteDatabase.CursorFactory?, version: Int
) : MyDatabase(context, name, factory, version) {


    fun Insert_batquitac(cot1:String,cot2:String,cot3:String,nghia:String)
    {
        QueryData("insert into batquitac values('"+cot1+"','"+cot2+"','"+cot3+"','"+nghia+"')")
    }


    fun Delete_batquitac()
    {
        QueryData("delete from batquitac")
    }
    fun DeletebatquitacbyId(cot1:String)
    {
        QueryData("delete from batquitac where cot1='"+cot1+"'")
    }

    fun Update_batquitac(id:String,cot1:String,cot2:String,cot3:String,nghia:String)
    {
        QueryData("update batquitac set cot1 ='"+cot1+"',cot2 ='"+cot2+"',nghia ='"+nghia+"' where cot1 = '"+id+"'")
    }

    fun GetList_batquitac():ArrayList<BatquiTac>
    {
        var lst: ArrayList<BatquiTac> = ArrayList<BatquiTac>()
        var data: Cursor = this.GetData("select * from batquitac")
        while(data.moveToNext())
        {
            var cv: BatquiTac = BatquiTac("", "","","")
            cv.Cot1= data.getString(0)
            cv.Cot2= data.getString(1)
            cv.Cot3= data.getString(2)
            cv.Nghia= data.getString(3)
            lst.add(cv)
        }
        return lst
    }
    fun GetList_batquitac_Asc():ArrayList<BatquiTac>
    {
        var lst: ArrayList<BatquiTac> = ArrayList<BatquiTac>()
        var data: Cursor = this.GetData("select * from batquitac order by cot1")
        while(data.moveToNext())
        {
            var cv: BatquiTac = BatquiTac("", "","","")
            cv.Cot1= data.getString(0)
            cv.Cot2= data.getString(1)
            cv.Cot3= data.getString(2)
            cv.Nghia= data.getString(3)
            lst.add(cv)
        }
        return lst
    }
    fun GetList_batquitac_bysearch(txt:String):ArrayList<BatquiTac>
    {
        var lst: ArrayList<BatquiTac> = ArrayList<BatquiTac>()
        var data: Cursor = this.GetData("select * from batquitac where cot1 like '%"+txt+"%' or cot2 like '%"+txt+"%' or cot3 like '%"+txt+"%'")
        while(data.moveToNext())
        {
            var cv: BatquiTac = BatquiTac("", "","","")
            cv.Cot1= data.getString(0)
            cv.Cot2= data.getString(1)
            cv.Cot3= data.getString(2)
            cv.Nghia= data.getString(3)
            lst.add(cv)
        }
        return lst
    }
}