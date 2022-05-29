package com.example.myfitness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.view.View
import android.widget.ImageButton
import android.content.Intent

class bhujangasana : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bhujangasana)
        val halbutton:ImageButton = findViewById(R.id.halbutton)
        halbutton.setOnClickListener {
            val intent = Intent(this@bhujangasana, halasana::class.java)
            startActivity(intent)
            finish();
        }
        val bhujangbutton:ImageButton = findViewById(R.id.bhujangbutton)
        bhujangbutton.setOnClickListener {
            val intent = Intent(this@bhujangasana, bhujangasana::class.java)
            startActivity(intent)
            finish();}
        val dhanurbutton:ImageButton = findViewById(R.id.dhanurbutton)
        dhanurbutton.setOnClickListener {
            val intent = Intent(this@bhujangasana, dhanurasana::class.java)
            startActivity(intent)
            finish();
        }
        val sirbutton:ImageButton = findViewById(R.id.sirbutton)
        sirbutton.setOnClickListener {
            val intent = Intent(this@bhujangasana, MainActivity::class.java)
            startActivity(intent)
            finish();}

    }
}