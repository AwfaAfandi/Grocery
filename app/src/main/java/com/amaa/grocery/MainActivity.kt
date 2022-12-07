package com.amaa.grocery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.amaa.grocery.adapter.GroceryAdapter
import com.amaa.grocery.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val datset = Datasource().LoadItems()

        val recyclerView = findViewById<RecyclerView>(R.id.rv_grocery)

        val adapter = GroceryAdapter(this, datset)

        recyclerView.adapter = adapter

        recyclerView.setHasFixedSize(true)


    }
}