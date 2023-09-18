package com.example.intent_tugas5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intent_tugas5.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    private val TAG = "MainActivityLifecycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding= ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            buttonLogin.setOnClickListener{
                val firstintent = Intent(this@SecondActivity, SecondActivity::class.java)
                startActivity(firstintent)
            }

            registerTxt.setOnClickListener{
                val secondintent = Intent(this@SecondActivity, MainActivity::class.java)
                startActivity(secondintent)
            }
        }
    }
}