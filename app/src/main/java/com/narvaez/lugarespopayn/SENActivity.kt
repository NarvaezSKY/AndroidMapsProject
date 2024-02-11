package com.narvaez.lugarespopayn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.narvaez.lugarespopayn.databinding.ActivityParkBinding
import com.narvaez.lugarespopayn.databinding.ActivitySenactivityBinding

class SENActivity : AppCompatActivity() {
    lateinit var binding: ActivitySenactivityBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySenactivityBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        binding.buttonsenamap.setOnClickListener{
            val intent = Intent(this, MapsActivity::class.java)
            intent.putExtra("LATITUD", 2.4828490476079335)
            intent.putExtra("LONGITUD", -76.56228073267658)
            intent.putExtra("NOMBRE", "SENA")
            startActivity(intent)

        }
    }
}