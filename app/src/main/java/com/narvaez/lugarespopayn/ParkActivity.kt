package com.narvaez.lugarespopayn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.narvaez.lugarespopayn.databinding.ActivityMainBinding
import com.narvaez.lugarespopayn.databinding.ActivityMorroBinding
import com.narvaez.lugarespopayn.databinding.ActivityParkBinding

class ParkActivity : AppCompatActivity() {
    lateinit var binding: ActivityParkBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityParkBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.buttonparqueMapa.setOnClickListener{
            val intent = Intent(this, MapsActivity::class.java)
            intent.putExtra("LATITUD", 2.4418819551275894)
            intent.putExtra("LONGITUD", -76.60649883223466)
            intent.putExtra("NOMBRE", "ParqueCaldas")
            startActivity(intent)

        }
    }
}