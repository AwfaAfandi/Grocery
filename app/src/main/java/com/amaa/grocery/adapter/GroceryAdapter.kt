package com.amaa.grocery.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.amaa.grocery.Activitydetails
import com.amaa.grocery.R
import com.amaa.grocery.model.Grocery



// TODO [1] Implement Adapter Class
class GroceryAdapter(private val context: Context, private val dataset : List<Grocery> ) : RecyclerView.Adapter<GroceryAdapter.ViewHolder>() {// End BookAdapter




    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataset[position]
        holder.textname.text = item.item_name
        holder.textprice.text = item.item_price
        holder.textdescrption .text = item.item_description
        holder.imag.setImageResource(item.item_image)

        holder.card.setOnClickListener {


            val context = holder.itemView.context
            val intent = Intent(context, Activitydetails :: class.java)
            intent.putExtra("Letter" , item.item_name)
            intent.putExtra("Descr" , item.item_description)
            intent.putExtra("image", item.item_image)
            context.startActivity(intent)


        }

    }



    override fun getItemCount() = dataset.size



    // TODO [2] Implement ViewHolder Class
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        val card: CardView = view.findViewById(R.id.Item_card)
        val textname: TextView = view.findViewById(R.id.item_name)
        val textprice: TextView = view.findViewById(R.id.text_price)
        val textdescrption: TextView = view.findViewById(R.id.text_description)
        val imag : ImageView = view.findViewById(R.id.item_image)
        
        

    }// End ViewHolder


    // TODO [3] Implement Adapter override methods
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_grocery, parent, false)
        return ViewHolder(itemLayout)

    }


}