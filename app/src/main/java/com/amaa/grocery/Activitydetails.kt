package com.amaa.grocery

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.BitmapFactory
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
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
        val ImageTitle = intent?.extras?.getString("Letter").toString()
        textv.text = ImageTitle

        val texds = findViewById<TextView>(R.id.textView2)
        val ImageDescrption = intent?.extras?.getString("Descr").toString()
        texds.text = ImageDescrption

        val imageView = findViewById<ImageView>(R.id.imageView)
      val img = intent.extras!!.getInt("image")
       imageView.setImageResource(img)


        val shareButton = findViewById<ImageButton>(R.id.imageButton)


        shareButton.setOnClickListener {


            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "image/*"
                val bitmap = BitmapFactory.decodeResource(resources,img )
              //  val path = MediaStore.Images.Media.insertImage(contentResolver , bitmap , "$id"  , "$id2" )
                val path = MediaStore.Images.Media.insertImage(contentResolver , bitmap , "$ImageTitle"  , "$ImageDescrption" )
                val uri = Uri.parse(path)
                putExtra(Intent.EXTRA_STREAM , uri)
                putExtra(Intent.EXTRA_TEXT , "$ImageTitle")




            }
         startActivity(intent)

        }


    }
}