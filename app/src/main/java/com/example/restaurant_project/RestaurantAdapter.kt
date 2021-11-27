package com.example.restaurant_project

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_restaurant.view.*

class RestaurantAdapter(private val context: Context, private val Restaurant: List<Restaurant>)
    : RecyclerView.Adapter<RestaurantAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_restaurant, parent, false))
    }

    override fun getItemCount() = Restaurant.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val restaurant = Restaurant[position]
        holder.bind(restaurant)
    }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(restaurant: Restaurant) {
            itemView.tvName.text = restaurant.name
            itemView.tvAddress.text = "Address: ${restaurant.address}"
            itemView.tvSpeciality.text = "Speciality: ${restaurant.speciality}"
            itemView.tvRating.text = "Rating: ${restaurant.rating}"
        }
    }
}