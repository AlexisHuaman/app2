package com.example.app2

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var num1:EditText?=null
    var num2:EditText?=null
    var result:TextView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "K PASA CAUSA, GAAAAAA!!!", Toast.LENGTH_SHORT).show()
        num1=findViewById(R.id.Numero1)
        num2=findViewById(R.id.Numero2)
        result=findViewById(R.id.Resultado)
    }
    fun suma(view: View){
        val aux1string=num1?.text.toString()
        val aux2string=num2?.text.toString()

        val aux1int=aux1string.toInt()
        val aux2int=aux2string.toInt()

        val resultadoint=aux1int+aux2int
        result?.text=resultadoint.toString()
    }
}