package com.gabemods.app

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val learnToCodeButton: Button = findViewById(R.id.learnToCodeButton)
        val contactButton: Button = findViewById(R.id.contactButton)

        learnToCodeButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gabemods.com/learn-to-code"))
            startActivity(intent)
        }

        contactButton.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SEND)
            emailIntent.type = "text/plain"
            emailIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("gabemodswebsite@gmail.com"))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Gabe Mods Inquiry")
            startActivity(Intent.createChooser(emailIntent, "Contact Gabe Mods"))
        }
    }
}
