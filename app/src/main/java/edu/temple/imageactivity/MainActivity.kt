package edu.temple.imageactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    val Succulents = arrayOf(

        SucculentData(
            id = 0,
            name = "Agave",
            image = R.drawable.agaveattenuata
        ),
        SucculentData(
            id = 1,
            name = "Aloe",
            image = R.drawable.aloevera
        ),
        SucculentData(
            id = 2,
            name = "Black Prince",
            image = R.drawable.blackprince
        ),
        SucculentData(
            id = 3,
            name = "Echeverialola",
            image = R.drawable.echeverialola
        ),
        SucculentData(
            id = 4,
            name = "Lady Finger",
            image = R.drawable.ladyfinger
        ),
        SucculentData(
            id = 5,
            name = "Parodiamagnifica",
            image = R.drawable.parodiamagnifica
        ),
        SucculentData(
            id = 6,
            name = "Perlevonnurburg",
            image = R.drawable.perlevonnurnburg
        ),
        SucculentData(
            id = 7,
            name = "Succulent",
            image = R.drawable.succulent
        ),
        SucculentData(
            id = 8,
            name = "Tiger Tooth",
            image = R.drawable.tigertooth
        ),
        SucculentData(
            id = 9,
            name = "Succulent",
            image = R.drawable.prettysucc
        )
    )

    var recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
    recyclerView.adapter = ImageAdapter(Succulents)


}


