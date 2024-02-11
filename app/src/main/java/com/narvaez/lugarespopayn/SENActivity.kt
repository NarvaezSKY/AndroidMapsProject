package com.narvaez.lugarespopayn

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.narvaez.lugarespopayn.databinding.ActivitySenactivityBinding

class SENActivity : AppCompatActivity() {
    lateinit var binding: ActivitySenactivityBinding
    private var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySenactivityBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)


        // Inicializar el MediaPlayer con el archivo de sonido
        mediaPlayer = MediaPlayer.create(this, R.raw.sena)

        // Reproducir el sonido en bucle
        mediaPlayer?.isLooping = true

        // Comenzar a reproducir el sonido
        mediaPlayer?.start()
        binding.buttonsenamap.setOnClickListener {
            val intent = Intent(this, MapsActivity::class.java)
            intent.putExtra("LATITUD", 2.4828490476079335)
            intent.putExtra("LONGITUD", -76.56228073267658)
            intent.putExtra("NOMBRE", "SENA")
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