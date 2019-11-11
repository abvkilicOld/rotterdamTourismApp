package com.example.rotterdamtourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonHotel;
    private Button buttonSights;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonHotel = (Button) findViewById(R.id.hotelBTN);
        buttonSights = (Button) findViewById(R.id.sightsBTN);


        buttonSights.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openSights();
            }
        });
        buttonHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHotel();
            }
        });
    }
    public void openHotel() {
        Intent intent = new Intent(this, HotelPage.class);
        startActivity(intent);
    }
    public void openSights()  {
        Intent intent = new Intent(this, SightsPage.class);
        startActivity(intent);
    }
}
