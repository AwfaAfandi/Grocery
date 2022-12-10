package com.amaa.grocery.data

import com.amaa.grocery.R
import com.amaa.grocery.model.Grocery

class Datasource {


    fun LoadItems() : List<Grocery> {

       return listOf(

        Grocery(R.drawable.banana_vector_transparent_png , "Banana" , "A banana is a curved, yellow fruit with a thick skin and soft sweet flesh" , "7 SAR"),
        Grocery(R.drawable.red_apple_isolated_on_white_design_free_vector , "Apple" , "An apple is an edible fruit produced by an apple tree " , "10 SAR"),
        Grocery(R.drawable.images , "Orange" , " round usually sweet juicy fruit with a yellowish to reddish orange rind " , "5 SAR"),
        Grocery(R.drawable.fresh_pineapple_fruit_free_vector , "pineapple" , " edible tropical fruit somewhat resembling a pine cone" , "15 SAR")

)


    }
}