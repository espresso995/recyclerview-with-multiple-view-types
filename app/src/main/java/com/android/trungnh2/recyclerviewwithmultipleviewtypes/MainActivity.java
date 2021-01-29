package com.android.trungnh2.recyclerviewwithmultipleviewtypes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.android.trungnh2.recyclerviewwithmultipleviewtypes.adapter.TripsAdapter;
import com.android.trungnh2.recyclerviewwithmultipleviewtypes.models.Ads;
import com.android.trungnh2.recyclerviewwithmultipleviewtypes.models.Item;
import com.android.trungnh2.recyclerviewwithmultipleviewtypes.models.News;
import com.android.trungnh2.recyclerviewwithmultipleviewtypes.models.Trip;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        List<Item> items = new ArrayList<>();

        // Here type are: 0=Trip, 1=Ads, 2=News

        // Trip
        Trip trip1 = new Trip(R.drawable.croatia, "Croatia", "Summer 2020 - 20 Days");
        items.add(new Item(0, trip1));

        // Ads
        Ads ads1 = new Ads("Ad: Christmas Holiday", "70% OFF on christmas sale");
        items.add(new Item(1, ads1));

        // News
        News news1 = new News(
                "Bali, Indonesia",
                "You'll find beaches, volcanoes, Komodo dragons and jungles sheltering elephants, orangutans and tigers. Basically it's paradise."
        );
        items.add(new Item(2, news1));

        // Trip
        Trip trip2 = new Trip(R.drawable.bora_bora, "Bora Bora", "Monsoon 2020 - 10 Days");
        items.add(new Item(0, trip2));

        // News
        News news2 = new News(
                "Kerry, Ireland",
                "All the way west In Ireland is one of the country's most scenic countries. Kerry's mountain, lakes and coasts are postcard-perfect, and that's before you add in Killarney National Park."
        );
        items.add(new Item(2, news2));

        // Trip
        Trip trip3 = new Trip(R.drawable.bali, "Bali", "Winter 2020 - 12 Days");
        items.add(new Item(0, trip3));

        // Ads
        Ads ads3 = new Ads("Ad: Summer Holiday", "50% OFF on your first trip");
        items.add(new Item(1, ads3));

        recyclerView.setAdapter(new TripsAdapter(items));
    }
}
