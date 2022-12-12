package com.amaa.grocery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.amaa.grocery.adapter.GroceryAdapter
import com.amaa.grocery.data.Datasource
import com.amaa.grocery.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val datset = Datasource().LoadItems()

        val recyclerView = findViewById<RecyclerView>(R.id.rv_grocery)

        val adapter = GroceryAdapter(this, datset)

        recyclerView.adapter = adapter

        recyclerView.setHasFixedSize(true)


    }
}