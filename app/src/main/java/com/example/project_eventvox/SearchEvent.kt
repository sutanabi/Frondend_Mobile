package com.example.project_eventvox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class SearchEvent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_event)

        val eventSearchList = listOf<EventSearch>(
            EventSearch(
                R.drawable.financesummit,
                "Open Finance Summit",
                "Thamrin 8 Ballroom",
                "30 Juni 2023",
                "IDR 150K"
            ),
            EventSearch(
                R.drawable.halalexpo,
                "HALAL EXPO INDONESIA (HEI)",
                "Jakarta Convention 1",
                "25 Oktober 2023",
                "IDR 100K"
            ),
            EventSearch(
                R.drawable.productconference,
                "Indonesia Product Conference",
                "The Tribrata",
                "21 September 2023",
                "IDR 100K"
            )
        )

//        val recyclerView = findViewById<RecyclerView>(R.id.rv_event)
//        recyclerView.layoutManager = linearLayoutManager(this)
//        recyclerView.setHasFixedSize(true)
//        recyclerView.adapter = EventAdapter(this, eventSearchList){
//
//        }
    }
}