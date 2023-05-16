package com.farimarwat.progressbarexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.farimarwat.simpleprogress.ProgressBar
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.btn_progress)
        val progress = findViewById<ProgressBar>(R.id.progress)

        button.setOnClickListener{
            progress.setProgress(Random.nextInt(10,100))
        }
    }
}