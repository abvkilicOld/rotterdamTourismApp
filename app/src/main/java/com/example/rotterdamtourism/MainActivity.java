package com.example.rotterdamtourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button restaurantButton;
    private Button restButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.hotelBTN);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHotel();
            }
        });

        // Restaurants
        restaurantButton = (Button) findViewById(R.id.restaurantBTN);
        restaurantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRestaurants();
            }
        });

    }
    public void openHotel() {
        Intent intent = new Intent(this, HotelPage.class);
        startActivity(intent);
    }

    public void openRestaurants() {
        Intent intent = new Intent(this, RestaurantPage.class);
        startActivity(intent);
    }

}
