package com.narvaez.lugarespopayn

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.narvaez.lugarespopayn.databinding.ActivityMainBinding
import com.narvaez.lugarespopayn.databinding.ActivityMorroBinding
import com.narvaez.lugarespopayn.databinding.ActivityParkBinding

class ParkActivity : AppCompatActivity() {
    lateinit var binding: ActivityParkBinding
    private var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityParkBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        mediaPlayer = MediaPlayer.create(this, R.raw.parque)

        // Reproducir el sonido en bucle
        mediaPlayer?.isLooping = true

        // Comenzar a reproducir el sonido
        mediaPlayer?.start()
        binding.buttonparqueMapa.setOnClickListener{
            val intent = Intent(this, MapsActivity::class.java)
            intent.putExtra("LATITUD", 2.4418819551275894)
            intent.putExtra("LONGITUD", -76.60649883223466)
            intent.putExtra("NOMBRE", "ParqueCaldas")
            startActivity(intent)

        }
    }
    override fun onDestroy() {
        super.onDestroy()
        // Liberar recursos del MediaPlayer cuando la actividad se destruye
        mediaPlayer?.release()
        mediaPlayer = null
    }
}