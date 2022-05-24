package com.example.a10119901latihan3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.TextView
import android.widget.EditText
import android.content.Context
import android.content.Intent

import butterknife.BindString
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick

class LoginCode : AppCompatActivity() {

    @BindView(R.id.txt_code_agreement)
    lateinit var txtAgree: TextView

    @BindView(R.id.edt_input_code)
    lateinit var edtInputCode: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_code)
        ButterKnife.bind(this)

        txtAgree.text = Html.fromHtml(getString(R.string.check_code_text_agreement))
    }

    @OnClick(R.id.btn_check_code)
    fun masuk() {
        var code = edtInputCode.text.toString()

        if(code.isBlank())
        {

        }
        else
        {
            intent = Intent(this, Biodata::class.java)
            startActivity(intent)
        }
    }
}