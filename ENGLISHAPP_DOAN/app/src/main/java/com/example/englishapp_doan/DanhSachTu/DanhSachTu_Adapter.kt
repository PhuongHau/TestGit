package com.example.englishapp.DanhSachTu


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.englishapp.R
import java.util.*

import kotlin.collections.ArrayList

class DanhSachTu_Adapter(TuMoiList:ArrayList<TuMoi>,onClick:TuMoi_Events): RecyclerView.Adapter<DanhSachTu_Adapter.StudentHolder>() {
    var list=ArrayList<TuMoi>()
    var onclick : TuMoi_Events?=null

    init {
        list= TuMoiList
        onclick=onClick
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentHolder {
        var v:View = LayoutInflater.from(parent.context).inflate(R.layout.row_danhsachtu,parent,false)
        return StudentHolder(v)

    }

    override fun onBindViewHolder(holder: StudentHolder, position: Int) {
        holder.txtEng.setText(list[position].Eng)
        holder.txtViet.setText(list[position].Viet)
        holder.itemView.setOnClickListener{
            onclick?.onClick(list[position])
        }
    }

    override fun getItemCount(): Int {
        return  list.size
    }

    class StudentHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        var txtEng:TextView= itemView.findViewById(R.id.danhsachtu_eng)
        var txtViet:TextView= itemView.findViewById(R.id.danhsachtu_viet)

    }


}