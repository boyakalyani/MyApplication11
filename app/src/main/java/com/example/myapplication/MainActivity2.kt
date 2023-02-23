package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var btn2:Button
    lateinit var txt5:TextView
    lateinit var txt6:TextView
    lateinit var txt7:TextView
    lateinit var txt8:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btn2=findViewById(R.id.btn2_id)
        txt5=findViewById(R.id.txt5_id)
        txt6=findViewById(R.id.txt6_id)
        txt7=findViewById(R.id.txt7_id)
        txt8=findViewById(R.id.txt8_id)


        val studentInform=getSharedPreferences("StudentData", MODE_PRIVATE)
        btn2.setOnClickListener(){
            val studentName=studentInform.getString("studentStore","Nothing data Strored")
            txt5.text=studentName
            val studentClass=studentInform.getString("studentS","Nothing data Strored")
            txt6.text=studentClass
            val studentfatherName=studentInform.getString("father","Nothing data Strored")
            txt7.text=studentfatherName
            val studentRollNum=studentInform.getString("roll","Nothing data Strored")
            txt8.text= studentRollNum
        }
    }
}