package com.example.a10119901latihan3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.TextView
import android.widget.EditText

import butterknife.BindString
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick

class Biodata : AppCompatActivity() {


    @BindView(R.id.edt_nama)
    lateinit var edtNama: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)
        ButterKnife.bind(this)
    }

    @OnClick(R.id.btn_next)
    fun next() {
        var code = edtNama.text.toString()

        if(code.isBlank())
        {

        }
        else
        {
            intent = Intent(this, Done::class.java)
            startActivity(intent)
        }
    }
}