package pang.tutorials.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nr0 : Button =findViewById(R.id.nr0)
        val nr1: Button =findViewById(R.id.nr1)
        val nr2 : Button =findViewById(R.id.nr2)
        val nr3 : Button =findViewById(R.id.nr3)
        val nr4 : Button =findViewById(R.id.nr4)
        val nr5 : Button =findViewById(R.id.nr5)
        val nr6 : Button =findViewById(R.id.nr6)
        val nr7 : Button =findViewById(R.id.nr7)
        val nr8 : Button =findViewById(R.id.nr8)
        val nr9 : Button =findViewById(R.id.nr9)

    }
}