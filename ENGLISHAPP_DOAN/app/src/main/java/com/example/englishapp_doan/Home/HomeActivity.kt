package com.example.englishapp.Home


import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.englishapp.BatQuiTac.AllBatQuiTac
import com.example.englishapp.BatQuiTac.BatQuiTac_Activity
import com.example.englishapp.DanhSachTu.AllTuMoi
import com.example.englishapp.DanhSachTu.DanhSachTu_Activity
import com.example.englishapp.Database.BLTuChuaNho
import com.example.englishapp.Database.BLTuDaNho
import com.example.englishapp.LuyenTu.LuyenTu_Activity
import com.example.englishapp.LuyenTu.LuyenTu_EV_Activity
import com.example.englishapp.LuyenTu.LuyenTu_VE_Activity
import com.example.englishapp.NguPhap.NguPhap_Activity
import com.example.englishapp.R
import com.example.englishapp.TuDien.TuDien_Activity
import com.example.englishapp.caidat.CaiDat_Activity
import kotlinx.android.synthetic.main.activity_home.*
import java.text.SimpleDateFormat
import java.util.*

class HomeActivity : AppCompatActivity()
{

    var AllTuMoi: AllTuMoi?= AllTuMoi(this, "englishapp", null, 1)
    var BLTuChuaNho: BLTuChuaNho?= BLTuChuaNho(this, "englishapp", null, 1)
    var BLTuDaNho: BLTuDaNho?= BLTuDaNho(this, "englishapp", null, 1)
    var AllBatQuiTac: AllBatQuiTac?= AllBatQuiTac(this, "englishapp", null, 1)

    var myPref: SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        myPref= applicationContext?.getSharedPreferences("caidat", Context.MODE_PRIVATE)
        AllTuMoi?.CreateTables()
        if(AllTuMoi!!.GetList_TuMoi().size==0)
            setData()
        settudahoc()


         btnluyentu.setOnClickListener {
             var  chedo = myPref?.getString("chedo", "")
             if(chedo=="eng")
             {
                 var intent = Intent(this, LuyenTu_EV_Activity::class.java)
                 startActivity(intent)
             }
             else
             {
                 var intent = Intent(this, LuyenTu_VE_Activity::class.java)
                 startActivity(intent)
             }


         }
        btntudien.setOnClickListener {
            var intent = Intent(this, TuDien_Activity::class.java)
            startActivity(intent)
        }
        btnbatquitac.setOnClickListener {
            var intent = Intent(this, BatQuiTac_Activity::class.java)
            startActivity(intent)
        }
        btnnguphap.setOnClickListener {
            var intent = Intent(this, NguPhap_Activity::class.java)
            startActivity(intent)
        }

        btndanhsach.setOnClickListener {
            var intent = Intent(this, DanhSachTu_Activity::class.java)
            startActivity(intent)
        }
        btncaidat.setOnClickListener {
            var intent = Intent(this, CaiDat_Activity::class.java)
            startActivity(intent)

        }

        home_btnthoat.setOnClickListener {
            finish()
        }
    }

    fun settudahoc()
    {

        var date = Date()
        var dateFormat = "dd/MM/yyyy"
        var sdf = SimpleDateFormat(dateFormat)
        var homnay=  sdf.format(date).toString()

        var  homqua = myPref?.getString("homnay", "")
        if(homqua!=homnay)
            myPref?.edit()?.putInt("dahoc", 0)?.commit()
        myPref?.edit()?.putString("homnay", homnay)?.commit()


    }

    fun setData(){
        myPref?.edit()?.putInt("soluong", 5)?.commit()
        myPref?.edit()?.putString("chedo", "eng")?.commit()
        settudahoc()
        AllTuMoi!!.Delete_TuMoi()
        AllTuMoi!!.add()
        BLTuDaNho!!.Delete_tudanho()

        BLTuChuaNho!!.Delete_tuchuanho()
        var lsttumoi= AllTuMoi!!.GetList_TuMoi()
        if(lsttumoi.size>0)
        {
            for(item in lsttumoi)
                BLTuChuaNho!!.Insert_tuchuanho(item)
        }

        AllBatQuiTac!!.Delete_batquitac()
        AllBatQuiTac!!.add()

    }

}