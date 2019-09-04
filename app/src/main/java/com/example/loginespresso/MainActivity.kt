package com.example.loginespresso

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.shashank.sony.fancytoastlib.FancyToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val userName="admin"
    val password="1234"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_submit.setOnClickListener {
            if (edtUserName.text.toString() == userName && edtPassword.text.toString() == password)
            {
               FancyToast.makeText(this,"Succesful",FancyToast.LENGTH_LONG,FancyToast.SUCCESS,true).show()
            }
            else if (edtUserName.text!!.isEmpty() || edtPassword.text!!.isEmpty())
            {
                FancyToast.makeText(this,"Enter username and password",FancyToast.LENGTH_LONG,FancyToast.WARNING,true).show()

            }else
                FancyToast.makeText(this,"User name or password wrong",FancyToast.LENGTH_LONG,FancyToast.ERROR,true).show()

        }

    }
}
