package com.pikchillytechnologies.bookingdetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FavouriteLabsActivity extends AppCompatActivity {

    ListView favouriteListView;
    FavouriteLabsAdapter customAdapter;
    List<FavouriteLabs> favouriteList;
    FavouriteLabs favourite;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite_labs);

        favouriteListView = findViewById(R.id.listview_FavouriteLabs);
        favouriteList = new ArrayList<>();

        favouriteList.add(new FavouriteLabs("Dhanwantri Pathology","202 Anshul Apartments, 105 Geeta Nagar, Indore","452001"));
        favouriteList.add(new FavouriteLabs("Dhanwantri Pathology","202 Anshul Apartments, 105 Geeta Nagar, Indore","452001"));
        favouriteList.add(new FavouriteLabs("Dhanwantri Pathology","202 Anshul Apartments, 105 Geeta Nagar, Indore","452001"));
        customAdapter = new FavouriteLabsAdapter(getApplicationContext(), favouriteList);
        favouriteListView.setAdapter(customAdapter);



    }
}
