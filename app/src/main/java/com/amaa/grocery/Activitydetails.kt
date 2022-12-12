package com.amaa.grocery

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView



class Activitydetails : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activitydetails)

        val textv = findViewById<TextView>(R.id.textdet)
        val id = intent?.extras?.getString("Letter").toString()
        textv.text = id

        val texds = findViewById<TextView>(R.id.textView2)
        val id2 = intent?.extras?.getString("Descr").toString()
        texds.text = id2

        val imageView = findViewById<ImageView>(R.id.imageView)
       imageView.setImageResource(intent.extras!!.getInt("image"))


        val shareButton = findViewById<ImageButton>(R.id.imageButton)


        shareButton.setOnClickListener {


            val intent = Intent(Intent.ACTION_SEND).apply {

                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT , "$id")
                type = "text/*"



            }
         startActivity(intent)

        }


    }
}