package com.example.job19bowo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edit = findViewById<EditText>(R.id.edit)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            konversiNilai(edit.text.toString().toInt())
        }
    }
    fun konversiNilai(editText: Int) {

        if(editText >= 86 && editText <= 100){
            Toast.makeText(this,"Kamu Mendapatkan Nilai A", Toast.LENGTH_SHORT).show() ;
        }
        else if(editText >= 76 && editText <= 85) {
            Toast.makeText(this,"Kamu Mendapatkan Nilai B", Toast.LENGTH_SHORT).show()
        }
        else if(editText >= 66 && editText <= 75) {
            Toast.makeText(this,"Kamu Mendapatkan Nilai C", Toast.LENGTH_SHORT).show()
        }
        else if(editText >= 51 && editText <= 65) {
            Toast.makeText(this,"Kamu Mendapatkan Nilai D", Toast.LENGTH_SHORT).show()
        }
        else if(editText >= 0 && editText <= 50) {
            Toast.makeText(this,"Kamu Mendapatkan Nilai E", Toast.LENGTH_SHORT).show()
        }
        else {
            Toast.makeText(this, "Nilaimu = Lebih dari yang ditentukan", Toast.LENGTH_SHORT).show()
        }
    }
}
