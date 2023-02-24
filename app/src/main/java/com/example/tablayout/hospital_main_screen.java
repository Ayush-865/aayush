package com.example.camps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class hospital_main_screen extends AppCompatActivity {

    ArrayList<camp_str> arrcamps = new ArrayList<camp_str>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclercamps = findViewById(R.id.recyclercamps);
        recyclercamps.setLayoutManager(new LinearLayoutManager(this));


        arrcamps.add(new camp_str(R.drawable.img, "ayush", "30482430", "palghar", "82"));
        arrcamps.add(new camp_str(R.drawable.img, "jeevan", "304830", "palghar", "89"));
        arrcamps.add(new camp_str(R.drawable.img, "sanjeeevni", "30482430", "palghar", "80"));
        arrcamps.add(new camp_str(R.drawable.img, "ay", "304823450", "palghar", "82"));
        arrcamps.add(new camp_str(R.drawable.img, "a", "30482430", "palghar", "32"));
        arrcamps.add(new camp_str(R.drawable.img, "ayushokk", "30482430", "palghar", "52"));
        recycler_camp_adapter adapter = new recycler_camp_adapter(this, arrcamps);
        recyclercamps.setAdapter(adapter);
    }

}
