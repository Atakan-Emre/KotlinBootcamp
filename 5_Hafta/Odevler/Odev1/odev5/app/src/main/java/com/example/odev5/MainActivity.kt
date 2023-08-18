package com.example.odev5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 3, GridLayoutManager.HORIZONTAL, false)

        val items = listOf(
            Item(R.drawable.ic_launcher_foreground, "Text 1"),
            Item(R.drawable.ic_launcher_foreground, "Text 2"),
            Item(R.drawable.ic_launcher_foreground, "Text 3"),
            Item(R.drawable.ic_launcher_foreground, "Text 4"),
            Item(R.drawable.ic_launcher_foreground, "Text 5"),
            Item(R.drawable.ic_launcher_foreground, "Text 6"),
            Item(R.drawable.ic_launcher_foreground, "Text 7"),
            Item(R.drawable.ic_launcher_foreground, "Text 8"),
            Item(R.drawable.ic_launcher_foreground, "Text 9"),
            Item(R.drawable.ic_launcher_foreground, "Text 10")
        )

        recyclerView.adapter = ItemAdapter(items)
    }
}
