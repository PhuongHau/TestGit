package com.example.englishapp.caidat

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.englishapp.R
import kotlinx.android.synthetic.main.activity_caidat.*

class CaiDat_Activity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_caidat)

        val myPref = applicationContext?.getSharedPreferences("caidat", Context.MODE_PRIVATE)
        var  soluong = myPref?.getInt("soluong", 0)
        caidat_txtsoluongtu.setText(soluong.toString())

        var chedo = myPref?.getString("chedo","eng")
        if(chedo=="eng")
            caidat_rdoeng.isChecked=true
        else
            caidat_rdoviet.isChecked=true

        caidat_btntru.setOnClickListener {
            var num = caidat_txtsoluongtu.text.toString().toInt()
            if(num-1>=0)
                num-=1
            caidat_txtsoluongtu.setText(num.toString())
        }

        caidat_btncong.setOnClickListener {
            var num = caidat_txtsoluongtu.text.toString().toInt()
            num+=1
            caidat_txtsoluongtu.setText(num.toString())
        }

        caidat_btnLuu.setOnClickListener {
            var num = caidat_txtsoluongtu.text.toString().toInt()
            myPref?.edit()?.putInt("soluong",num)?.commit()

            if(caidat_rdoeng.isChecked)
                myPref?.edit()?.putString("chedo","eng")?.commit()
            else
                myPref?.edit()?.putString("chedo","viet")?.commit()

            Toast.makeText(this, "Đã lưu", Toast.LENGTH_SHORT).show()
        }

        caidat_btnThoat.setOnClickListener {
            finish()
        }
    }
}