package com.example.travelapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.travelapp.adapter.RecentsAdapter;
import com.example.travelapp.adapter.TopPlacesAdapter;
import com.example.travelapp.model.RecentsData;
import com.example.travelapp.model.TopPlacesData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recentRecycler , topplacesRecycler;
    RecentsAdapter recentsAdapter;
    TopPlacesAdapter topPlacesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("AM Lake","India","From ₹16000",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("NilGiri Hills","India","From ₹24000",R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("AM Lake","India","From ₹16000",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("NilGiri Hills","India","From ₹24000",R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("AM Lake","India","From ₹16000",R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("NilGiri Hills","India","From ₹24000",R.drawable.recentimage2));

        setRecentRecycler(recentsDataList);

        List<TopPlacesData> topPlacesDataList = new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData("Kashmir Hills","India","From ₹15000 - ₹20000",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kashmir Hills","India","From ₹15000 - ₹20000",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kashmir Hills","India","From ₹15000 - ₹20000",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kashmir Hills","India","From ₹15000 - ₹20000",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kashmir Hills","India","From ₹15000 - ₹20000",R.drawable.topplaces));

        topPlacesDataList.add(new TopPlacesData("Kashmir Hills","India","From ₹15000 - ₹20000",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kashmir Hills","India","From ₹15000 - ₹20000",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kashmir Hills","India","From ₹15000 - ₹20000",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Kashmir Hills","India","From ₹15000 - ₹20000",R.drawable.topplaces));

        setTopplacesRecycler(topPlacesDataList);
    }

    private void setRecentRecycler(List<RecentsData> recentsDataList){

        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this,recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);
    }
    private void setTopplacesRecycler(List<TopPlacesData> topPlacesDataList){

        topplacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        topplacesRecycler.setLayoutManager(layoutManager);
        topPlacesAdapter = new TopPlacesAdapter(this,topPlacesDataList);
        topplacesRecycler.setAdapter(topPlacesAdapter);
    }
}
