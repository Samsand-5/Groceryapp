package com.example.groceryapp.Database

//The repository is one of the design structures.
// The repository class gives the data to the ViewModel class and then the ViewModel class uses that data for Views.
// The repository will choose the appropriate data locally or on the network.
// Here in our Grocery Repository class data fetch locally from the Room database.
// We will add constructor value by creating an instance of the database and stored in the db variable
// in the Grocery Repository class


import com.example.groceryapp.GroceryDatabase
import com.example.groceryapp.GroceryItems

class GroceryRepository(private val db: GroceryDatabase) {

    suspend fun insert(item: GroceryItems) = db.getGroceryDao().insert(item)
    suspend fun delete(item: GroceryItems) = db.getGroceryDao().delete(item)

    fun getAllItems() = db.getGroceryDao().getAllGroceryItems()
}