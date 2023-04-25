package com.example.topgameapp

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class GameAdapter(val gameList: ArrayList<GameModel>) :
    RecyclerView.Adapter<GameAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var gameImg: ImageView
        var gameTitle: TextView

        init {
            gameTitle = itemView.findViewById(R.id.cardViewText)
            gameImg = itemView.findViewById(R.id.image_view)

            itemView.setOnClickListener {
                Toast.makeText(
                    itemView.context,
                    "You Chose: ${gameList[adapterPosition].txtCard}",
                    Toast.LENGTH_SHORT
                ).show()
            }


        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameAdapter.MyViewHolder {
        val v =
            LayoutInflater.from(parent.context).inflate(R.layout.card_item_layout, parent, false)
        return MyViewHolder(v)
    }

    override fun onBindViewHolder(holder: GameAdapter.MyViewHolder, position: Int) {
        holder.gameImg.setImageResource(gameList[position].imgCard)
        holder.gameTitle.text = gameList[position].txtCard
    }

    override fun getItemCount(): Int {
        return gameList.size
    }

}