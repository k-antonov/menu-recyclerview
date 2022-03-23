package com.example.menurecyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.menurecyclerview.R
import com.example.menurecyclerview.model.Meal

class MealAdapter(
    private val context: Context,
    private val dataset: List<Meal>
    ) : RecyclerView.Adapter<MealAdapter.MealViewHolder>() {

    class MealViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val mealName: TextView = view.findViewById(R.id.meal_name)
        val mealImage: ImageView = view.findViewById(R.id.meal_image)
        val mealWeight: TextView = view.findViewById(R.id.meal_weight)
        val mealCost: TextView = view.findViewById(R.id.meal_cost)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MealViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.meal, parent, false)
        return MealViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: MealViewHolder, position: Int) {
        val meal = dataset[position]
        holder.mealName.text = context.resources.getString(meal.name)
        holder.mealImage.setImageResource(meal.image)
        holder.mealWeight.text = context.resources.getString(R.string.weight, meal.weight.toString())
        holder.mealCost.text = context.resources.getString(R.string.cost, meal.cost.toString())
    }

    override fun getItemCount() = dataset.size
}