package com.example.a10119901latihan3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import butterknife.ButterKnife
import butterknife.OnClick
import android.view.View

class Done : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_done)
        ButterKnife.bind(this)
    }

    @OnClick(R.id.btn_done)
    fun exit() {
        finishAffinity()
    }
}