package com.example.restaurant_project

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val restaurants = mutableListOf<Restaurant>()
        val restaurantAdapter = RestaurantAdapter(this, restaurants)
        rvRestaurant.adapter = restaurantAdapter
        rvRestaurant.layoutManager = LinearLayoutManager(this)

        val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        viewModel.getRestaurants().observe(this, Observer { restaurantSnapshot ->
            restaurants.clear()
            restaurants.addAll(restaurantSnapshot)
            restaurantAdapter.notifyDataSetChanged()
        })
    }
}