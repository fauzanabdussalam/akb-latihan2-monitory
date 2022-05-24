package com.example.a10119901latihan3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import butterknife.ButterKnife
import butterknife.OnClick
import android.view.View

class Welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        ButterKnife.bind(this)
    }

    @OnClick(R.id.btn_start)
    fun mulai() {
        intent = Intent(this, LoginCode::class.java)
        startActivity(intent)
    }
}