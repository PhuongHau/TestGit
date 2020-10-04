package com.example.englishapp.DanhSachTu

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.englishapp.Database.BLTuChuaNho
import com.example.englishapp.Database.BLTuDaNho
import com.example.englishapp.Database.MyDatabase
import com.example.englishapp.R
import kotlinx.android.synthetic.main.activity_danhhsachtu.*

class DanhSachTu_Activity : Activity(),TuMoi_Events {
    var AllTuMoi: AllTuMoi?= AllTuMoi(this,"englishapp",null,1)
    var BLTuChuaNho: BLTuChuaNho?= BLTuChuaNho(this,"englishapp",null,1)
    var BLTuDaNho: BLTuDaNho?= BLTuDaNho(this,"englishapp",null,1)
    var lst = ArrayList<TuMoi>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_danhhsachtu)

        lst=AllTuMoi!!.GetList_TuMoi_Asc()
        var TuMoiAdapter = DanhSachTu_Adapter(lst,this)
        var LinearManager= LinearLayoutManager(this)
        danhsachtu_rview.layoutManager= LinearManager
        danhsachtu_rview.setHasFixedSize(true)
        danhsachtu_rview.adapter= TuMoiAdapter

        danhsachtu_btntatca.setOnClickListener {
            danhsachtu_btntatca.setBackgroundResource(R.drawable.danhsachtu_button2)
            danhsachtu_btndanho.setBackgroundResource(R.drawable.danhsachtu_button1)
            danhsachtu_btnchuanho.setBackgroundResource(R.drawable.danhsachtu_button1)
            var tam = AllTuMoi!!.GetList_TuMoi_Asc()
            lst.clear()
            for(item in tam)
                lst.add(item)
            TuMoiAdapter.notifyDataSetChanged()
        }

        danhsachtu_btndanho.setOnClickListener {
            danhsachtu_btntatca.setBackgroundResource(R.drawable.danhsachtu_button1)
            danhsachtu_btndanho.setBackgroundResource(R.drawable.danhsachtu_button2)
            danhsachtu_btnchuanho.setBackgroundResource(R.drawable.danhsachtu_button1)
            var tam = BLTuDaNho!!.GetList_tudanho_Asc()
            lst.clear()
            for(item in tam)
                lst.add(item)
            TuMoiAdapter.notifyDataSetChanged()
        }
        danhsachtu_btnchuanho.setOnClickListener {
            danhsachtu_btntatca.setBackgroundResource(R.drawable.danhsachtu_button1)
            danhsachtu_btndanho.setBackgroundResource(R.drawable.danhsachtu_button1)
            danhsachtu_btnchuanho.setBackgroundResource(R.drawable.danhsachtu_button2)
            var tam = BLTuChuaNho!!.GetList_tuchuanho_Asc()
            lst.clear()
            for(item in tam)
                lst.add(item)
            TuMoiAdapter.notifyDataSetChanged()
        }


    }


    override fun onClick(tumoi: TuMoi) {

    }
}