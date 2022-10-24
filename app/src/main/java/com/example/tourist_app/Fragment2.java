package com.example.tourist_app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tourist_app.R;

import java.util.ArrayList;

public class Fragment2 extends Fragment {
    View view;

    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_2, container, false);
        RecyclerView rvActivity = (RecyclerView) view.findViewById(R.id.recyclerViewActivity);

        ArrayList<ActivityModel> activityArrayList = new ArrayList<>();
        activityArrayList.add(new ActivityModel("The Green Goose", "", R.drawable.green_goose));
        activityArrayList.add(new ActivityModel("Pub O'Prince", "", R.drawable.pub_o_prince));
        activityArrayList.add(new ActivityModel("Frog Hop House", "", R.drawable.frog_hop_house));
        activityArrayList.add(new ActivityModel("Lizard Lounge", "", R.drawable.lizard_lounge));
        activityArrayList.add(new ActivityModel("Boutary", "", R.drawable.boutary));
        activityArrayList.add(new ActivityModel("Epicure", "", R.drawable.epicure));
        activityArrayList.add(new ActivityModel("La Table de Colette", "", R.drawable.la_table_de_colette));
        activityArrayList.add(new ActivityModel("Mumi", "", R.drawable.mumi));

        // we are initializing our adapter class and passing our arraylist to it.
        ActivityAdapter ActivityAdapter = new ActivityAdapter(this, activityArrayList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());

        // in below two lines we are setting layout manager and adapter to our recycler view.
        rvActivity.setLayoutManager(layoutManager);
        rvActivity.setAdapter(ActivityAdapter);
        return view;
    }
}