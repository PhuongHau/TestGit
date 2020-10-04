package com.example.englishapp.BatQuiTac


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.englishapp.BatQuiTac.BatQuiTac_Events
import com.example.englishapp.BatQuiTac.BatquiTac
import com.example.englishapp.R
import java.util.*

import kotlin.collections.ArrayList

class BatQuiTac_Adapter(lst:ArrayList<BatquiTac>,onClick:BatQuiTac_Events): RecyclerView.Adapter<BatQuiTac_Adapter.Holder>() {
    var list=ArrayList<BatquiTac>()
    var onclick : BatQuiTac_Events?=null

    init {
        list= lst
        onclick=onClick
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        var v:View = LayoutInflater.from(parent.context).inflate(R.layout.row_batquitac,parent,false)
        return Holder(v)

    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.cot1.setText(list[position].Cot1)
        holder.cot2.setText(list[position].Cot2)
        holder.cot3.setText(list[position].Cot3)
        holder.itemView.setOnClickListener{
            onclick?.onClick(list[position])
        }
    }

    override fun getItemCount(): Int {
        return  list.size
    }

    class Holder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        var cot1:TextView= itemView.findViewById(R.id.batquitac_cot1)
        var cot2:TextView= itemView.findViewById(R.id.batquitac_cot2)
        var cot3:TextView= itemView.findViewById(R.id.batquitac_cot3)

    }


}