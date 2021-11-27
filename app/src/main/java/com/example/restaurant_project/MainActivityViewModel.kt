package com.example.restaurant_project

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MainActivityViewModel : ViewModel() {
    private val restaurantsLiveData: MutableLiveData<MutableList<Restaurant>> = MutableLiveData()

    init {
        restaurantsLiveData.value = createRestaurants()
    }

    fun getRestaurants() : LiveData<MutableList<Restaurant>> {
        return restaurantsLiveData
    }

    private fun createRestaurants(): MutableList<Restaurant> {
        val restaurants = mutableListOf<Restaurant>()
        restaurants.add(Restaurant("Jack Astor's", "123 Sherway Road", "Steak",5.0))
        restaurants.add(Restaurant("Moxie's Grill & Bar", "44 Bloor Street", "Pasta", 3.8))
        restaurants.add(Restaurant("Port Via", "67 King Street", "Wine", 4.2))
        restaurants.add(Restaurant("Perkin's Restaurant & Bakery", "600 Dixon Road", "Pastries", 3.5))
        restaurants.add(Restaurant("State & Main Kitchen & Bar", "5 Front Street", "Lobster", 4.8))
        restaurants.add(Restaurant("Pizza Hut", "23 Burnhamthorpe Road", "Pizza", 3.7))
        restaurants.add(Restaurant("Osmow's Shawarma", "4080 Dundas Street W", "Pastries", 3.5))
        restaurants.add(Restaurant("Popeyes Louisiana Kitchen", "255 Eglinton Street E", "Burgers", 4.9))
        return restaurants
    }
}