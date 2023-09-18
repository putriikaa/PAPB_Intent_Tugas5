package com.example.intent_tugas5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intent_tugas5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivityLifecycle"
    private lateinit var binding: ActivityMainBinding

    companion object {
        const val EXTRA_USERNAME = "extra_username"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_PHONE = "extra_phone"
        const val EXTRA_PASSWORD = "extra_password"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            buttonRegister.setOnClickListener {
                val intentSecond = Intent(this@MainActivity, ThirdActivity::class.java)
                intentSecond.putExtra(EXTRA_USERNAME, username.text.toString())
                intentSecond.putExtra(EXTRA_EMAIL, email.text.toString())
                intentSecond.putExtra(EXTRA_PHONE, phone.text.toString())
                intentSecond.putExtra(EXTRA_PASSWORD, password.text.toString())
                startActivity(intentSecond)
            }

            txtLogin.setOnClickListener {
                val intentThird = Intent(this@MainActivity, SecondActivity::class.java)
                startActivity(intentThird)
            }
        }
    }
}