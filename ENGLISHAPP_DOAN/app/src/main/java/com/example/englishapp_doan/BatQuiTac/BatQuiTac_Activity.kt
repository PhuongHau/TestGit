package com.example.englishapp.BatQuiTac

import android.app.Activity
import android.app.AlertDialog
import android.os.Bundle
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.englishapp.BatQuiTac.AllBatQuiTac
import com.example.englishapp.BatQuiTac.BatQuiTac_Events
import com.example.englishapp.BatQuiTac.BatquiTac
import com.example.englishapp.Database.MyDatabase
import com.example.englishapp.R
import kotlinx.android.synthetic.main.activity_batquitac.*
import kotlinx.android.synthetic.main.activity_danhhsachtu.*
import kotlinx.android.synthetic.main.activity_tudien.*

class BatQuiTac_Activity : Activity(),BatQuiTac_Events {
    var AllBatQuiTac: AllBatQuiTac?= AllBatQuiTac(this,"englishapp",null,1)
    var lst = ArrayList<BatquiTac>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_batquitac)

        lst=getData()
        var BatQuiTacAdapter =BatQuiTac_Adapter(lst,this)
        var LinearManager= LinearLayoutManager(this)
        batquitac_rview.layoutManager= LinearManager
        batquitac_rview.setHasFixedSize(true)
        batquitac_rview.adapter= BatQuiTacAdapter

        batquitac_search.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {

                return false
            }

            override fun onQueryTextChange(newText: String): Boolean {
                var tam= search(newText)
                if(tam.size>0)
                {

                    lst.clear()
                    for(item in tam)
                        lst.add(item)
                    BatQuiTacAdapter.notifyDataSetChanged()
                }
                else
                {
                    lst.clear()
                    BatQuiTacAdapter.notifyDataSetChanged()
                }

                return true
            }
        })


    }

    fun getData():ArrayList<BatquiTac>{
        var arrayList= AllBatQuiTac!!.GetList_batquitac_Asc()
        return arrayList
    }

    fun search(txt:String): ArrayList<BatquiTac>
    {
        var arrayList= AllBatQuiTac!!.GetList_batquitac_bysearch(txt)
        return arrayList
    }

    override fun onClick(batquitac: BatquiTac) {
        var alert : AlertDialog = AlertDialog.Builder(this).create()
        alert.setMessage(batquitac.Nghia)
        alert.show()

    }
}