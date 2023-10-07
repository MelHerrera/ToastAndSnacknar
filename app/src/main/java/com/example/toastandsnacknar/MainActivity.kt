package com.example.toastandsnacknar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.toastandsnacknar.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //var btnToas = findViewById<Button>(R.id.btnToast)

        binding.btnToast.setOnClickListener {
            Toast.makeText(this, "Hola soy un toas", Toast.LENGTH_SHORT).show()
        }

        binding.btnSnack.setOnClickListener {
            Snackbar.make(it, "Hola soy un snackbar", Snackbar.LENGTH_LONG)
                .setAction(R.string.texto_cerrar){
                   binding.btnToast.text = "texto toast manipulado"
                }.setActionTextColor(getColor(R.color.blue_color)).show()
        }
    }
}