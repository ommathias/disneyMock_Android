package com.example.disneymock_mathias

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.imageview.ShapeableImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val imageIds = arrayOf(
            R.id.iv_perfil1,
            R.id.iv_perfil2,
            R.id.iv_perfil3,
            R.id.iv_perfil4,
            R.id.iv_perfil5,
            R.id.iv_perfil6,
            R.id.iv_perfil7,
        )

        val textIds = arrayOf(
            R.id.nome1,
            R.id.nome2,
            R.id.nome3,
            R.id.nome4,
            R.id.nome5,
            R.id.nome6,
            R.id.nome7
        )

        for (i in imageIds) {
            val imageView = findViewById<ShapeableImageView>(i)
            imageView.setOnClickListener {
                val intent = Intent(this, PerfilEscolhido::class.java)
                startActivity(intent)
            }
        }

        for (i in textIds) {
            val textView = findViewById<TextView>(i)
            textView.setOnClickListener {
                val intent = Intent(this, PerfilEscolhido::class.java)
                startActivity(intent)
            }
        }
    }


}