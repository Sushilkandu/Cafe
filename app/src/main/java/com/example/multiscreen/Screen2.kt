package com.example.multiscreen

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.multiscreen.databinding.ActivityScreen2Binding

class Screen2 : AppCompatActivity() {
    private lateinit var binding: ActivityScreen2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScreen2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.idDum.setOnClickListener {

            val intent = Intent(this, Biriyani::class.java)
            startActivity(intent)
        }
        binding.Chicken.setOnClickListener {

            val intent = Intent(this, Chicken::class.java)
            startActivity(intent)
        }
        binding.Mutton.setOnClickListener {

            val intent = Intent(this, Mutton::class.java)
            startActivity(intent)
        }
        binding.Paneer.setOnClickListener {

            val intent = Intent(this, Paneer::class.java)
            startActivity(intent)
        }
        binding.Burger.setOnClickListener {

            val intent = Intent(this, Burger::class.java)
            startActivity(intent)
        }
        binding.Pizza.setOnClickListener {

            val intent = Intent(this, Pizza::class.java)
            startActivity(intent)
        }
        binding.CallBtn.setOnClickListener {

            val callIntent = Intent(Intent.ACTION_CALL)
            callIntent.data = Uri.parse("tel:" +918067466791)
            startActivity(callIntent)
        }
        binding.swiggy.setOnClickListener {

            val intent = Intent(this, Swiggy::class.java)
            startActivity(intent)
        }
    }
}