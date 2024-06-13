package com.example.listandgridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        //list of animals books title,gendre, and image
        val itemLists = listOf<ItemList>(
            ItemList("The Lion King", "Animation", "https://upload.wikimedia.org/wikipedia/en/9/9d/Disney_The_Lion_King_2019.jpg"),
            ItemList("The Jungle Book", "Adventure", "https://lumiere-a.akamaihd.net/v1/images/p_thejunglebook2016_19751_6b8cfcec.jpeg?region=0%2C0%2C540%2C810"),
            ItemList("Pirates of the Caribbean", "Action", "https://m.media-amazon.com/images/M/MV5BMjE5MjkwODI3Nl5BMl5BanBnXkFtZTcwNjcwMDk4NA@@._V1_.jpg"),
            ItemList("Spiderman", "Action", "https://image.api.playstation.com/vulcan/ap/rnd/202011/0402/AcjaXqwZzggGiKLFdEfHMp0H.png"),
            ItemList("Kungfu Panda", "Animation", "https://m.media-amazon.com/images/M/MV5BZDY0YzI0OTctYjVhYy00MTVhLWE0NTgtYTRmYTBmOTE3YTViXkEyXkFqcGdeQXVyMTUzMTg2ODkz._V1_.jpg"),
        )
        val adapter = AdapterList(itemLists)
        recyclerView.adapter = adapter
    }
}