package com.example.intent_tugas5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intent_tugas5.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val usernameValue = intent.getStringExtra(MainActivity.EXTRA_USERNAME)
        val emailValue = intent.getStringExtra(MainActivity.EXTRA_EMAIL)
        val phoneValue = intent.getStringExtra(MainActivity.EXTRA_PHONE)
        with(binding) {
            usernameThird.text = usernameValue
            emailThird.text = emailValue
            phoneThird.text = phoneValue
        }
    }
}