package com.narvaez.lugarespopayn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.narvaez.lugarespopayn.databinding.ActivityMorroBinding

class MorroActivity : AppCompatActivity() {
    lateinit var binding: ActivityMorroBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding=ActivityMorroBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.buttonMorroMap.setOnClickListener{
            val intent = Intent(this, MapsActivity::class.java)
            intent.putExtra("LATITUD", 2.4447225119586666)
            intent.putExtra("LONGITUD", -76.60010444617006)
            intent.putExtra("NOMBRE", "Morro")
            startActivity(intent)

        }
    }
}