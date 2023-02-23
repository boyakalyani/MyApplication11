package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var edttxt1:EditText
    lateinit var edttxt2:EditText
    lateinit var edttxt3:EditText
    lateinit var edttxt4:EditText
    lateinit var btn1:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edttxt1=findViewById(R.id.edt1_id)
        edttxt2=findViewById(R.id.edt2_id)
        edttxt3=findViewById(R.id.edt3_id)
        edttxt4=findViewById(R.id.edt4_id)
        btn1=findViewById(R.id.btn1_id)

        val studentInform=getSharedPreferences("StudentData", MODE_PRIVATE)//i create file name and i store name and privite mode
        btn1.setOnClickListener(){
            val studentDetails=edttxt1.text.toString()
            studentInform.edit().putString("studentStore",studentDetails).apply()
            val classNam=edttxt2.text.toString()
            studentInform.edit().putString("studentS",classNam).apply()
            val fatherName=edttxt3.text.toString()
            studentInform.edit().putString("father",fatherName).apply()
            val rollNum=edttxt4.text.toString()
            studentInform.edit().putString("roll",rollNum).apply()
            startActivity(Intent(this,MainActivity2::class.java))
        }
    }
}