package com.narvaez.lugarespopayn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.narvaez.lugarespopayn.databinding.ActivityMorroBinding
import android.media.MediaPlayer
class MorroActivity : AppCompatActivity() {
    private var mediaPlayer: MediaPlayer? = null
    lateinit var binding: ActivityMorroBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding=ActivityMorroBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        // Inicializar el MediaPlayer con el archivo de sonido
        mediaPlayer = MediaPlayer.create(this, R.raw.morro)

        // Reproducir el sonido en bucle
        mediaPlayer?.isLooping = true

        // Comenzar a reproducir el sonido
        mediaPlayer?.start()

        binding.buttonMorroMap.setOnClickListener{
            val intent = Intent(this, MapsActivity::class.java)
            intent.putExtra("LATITUD", 2.4447225119586666)
            intent.putExtra("LONGITUD", -76.60010444617006)
            intent.putExtra("NOMBRE", "Morro")
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