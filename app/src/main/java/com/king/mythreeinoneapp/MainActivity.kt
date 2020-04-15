package com.king.mythreeinoneapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mBtnNext.setOnClickListener {
            //Start by receiving the values from the user
            var name = mEdtName.text.toString()
            var age = mEdtAge.text.toString()
            //Check whether the user is going to the next page with empty fields
            if (name.isEmpty() or age.isEmpty()){
                //Toast a message
                Toast.makeText(this,"Please fill all the inputs",Toast.LENGTH_LONG).show()
            }else{
                //Move to the next page with the received data
                //We use an intent to move to the next page
                intent = Intent(this,SecondActivity::class.java)
                intent.putExtra("x",name)
                intent.putExtra("y",age)
                startActivity(intent)
            }

        }

        mBtnWebsite.setOnClickListener {
            intent = Intent(this,ThirdActivity::class.java)
            startActivity(intent)
        }
    }
}
