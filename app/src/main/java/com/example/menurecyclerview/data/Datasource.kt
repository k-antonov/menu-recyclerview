package com.example.menurecyclerview.data

import com.example.menurecyclerview.R
import com.example.menurecyclerview.model.Meal

class Datasource {
    fun loadMeals() : List<Meal> {
        return listOf(
            Meal(R.string.al_pastor, R.drawable.al_pastor, Meal.SMALL, 4.99),
            Meal(R.string.de_camaron, R.drawable.de_camaron, Meal.SMALL, 6.99),
            Meal(R.string.de_lengua, R.drawable.de_lengua, Meal.MEDIUM, 6.99),
            Meal(R.string.de_cabeza, R.drawable.de_cabeza, Meal.SMALL, 5.99),
            Meal(R.string.de_pollo, R.drawable.de_pollo, Meal.LARGE, 7.99),
            Meal(R.string.de_pescado, R.drawable.de_pescado, Meal.MEDIUM, 5.99),
            Meal(R.string.carne_asada, R.drawable.carne_asada, Meal.SMALL, 4.99),
            Meal(R.string.de_carnitas, R.drawable.de_carnitas, Meal.MEDIUM, 5.99),
            Meal(R.string.de_barbacoa, R.drawable.de_barbacoa, Meal.LARGE, 7.99),
            Meal(R.string.de_chorizo, R.drawable.de_chorizo, Meal.LARGE, 7.99)
        )
    }
}