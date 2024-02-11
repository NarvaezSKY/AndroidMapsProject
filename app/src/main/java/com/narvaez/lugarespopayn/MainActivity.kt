package com.narvaez.lugarespopayn


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.narvaez.lugarespopayn.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.buttonMorro.setOnClickListener {

            val intent=Intent(this, MorroActivity::class.java)


            startActivity(intent)
        }
        binding.buttonParque.setOnClickListener {

            val intent = Intent(this, ParkActivity::class.java)


            startActivity(intent)
        }
        binding.buttonSENA.setOnClickListener {

            val intent = Intent(this, SENActivity::class.java)


            startActivity(intent)
        }
    }
}