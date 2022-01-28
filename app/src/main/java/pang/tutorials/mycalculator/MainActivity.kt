package pang.tutorials.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.makeText as mmakeText1

private var tvResult: TextView?=null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nr0: Button = findViewById(R.id.nr0)
        val nr1: Button = findViewById(R.id.nr1)
        val nr2: Button = findViewById(R.id.nr2)
        val nr3: Button = findViewById(R.id.nr3)
        val nr4: Button = findViewById(R.id.nr4)
        val nr5: Button = findViewById(R.id.nr5)
        val nr6: Button = findViewById(R.id.nr6)
        val nr7: Button = findViewById(R.id.nr7)
        val nr8: Button = findViewById(R.id.nr8)
        val nr9: Button = findViewById(R.id.nr9)
        val div: Button = findViewById(R.id.div)
        val clr: Button = findViewById(R.id.clr)
        val multi: Button = findViewById(R.id.multi)
        val result: Button = findViewById(R.id.results)
        val add: Button = (findViewById(R.id.add))
        val sub: Button = (findViewById(R.id.sub))

        tvResult = findViewById(R.id.results)
        nr0.setOnClickListener() {}
        nr1.setOnClickListener() {}
        nr2.setOnClickListener() {}
        nr3.setOnClickListener() {}
        nr4.setOnClickListener() {}
        nr5.setOnClickListener() {}
        nr6.setOnClickListener() {}
        nr7.setOnClickListener() {}
        nr8.setOnClickListener() {}
        nr9.setOnClickListener() {}
        div.setOnClickListener() {}
        multi.setOnClickListener() {}
        result.setOnClickListener() {}
        sub.setOnClickListener() {}
        add.setOnClickListener(){}
        clr.setOnClickListener(){ }
        
    }



    }
