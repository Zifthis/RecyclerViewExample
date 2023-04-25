package com.example.topgameapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1 adapterView : recycler
        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewId)
        recyclerView.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,
            false,
        )

        // 2 creating data source: List of game objects
        var gamesList: ArrayList<GameModel> = ArrayList()

        val g1 = GameModel(R.drawable.card1, "Dogo 1 Chase" )
        val g2 = GameModel(R.drawable.card2, "Dogo 2 Chase" )
        val g3 = GameModel(R.drawable.card3, "Dogo 3 Chase" )
        val g4 = GameModel(R.drawable.card4, "Dogo 4 Chase" )
        val g5 = GameModel(R.drawable.card5, "Dogo 5 Chase" )
        val g6 = GameModel(R.drawable.card6, "Dogo 6 Chase" )

        gamesList.add(g1)
        gamesList.add(g2)
        gamesList.add(g3)
        gamesList.add(g4)
        gamesList.add(g5)
        gamesList.add(g6)

        // Adapter:
        val adapter = GameAdapter(gamesList)
        recyclerView.adapter = adapter




    }
}