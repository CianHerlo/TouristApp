package com.example.tourist_app;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public class Fragment3 extends Fragment {
    View view;


    public Fragment3() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_3, container, false);

        RecyclerView rvFoodDrink = (RecyclerView) view.findViewById(R.id.recyclerViewFoodDrink);

        ArrayList<Model> modelArrayList = new ArrayList<>();
        modelArrayList.add(new Model("The Green Goose", R.drawable.green_goose));
        modelArrayList.add(new Model("Pub O'Prince", R.drawable.pub_o_prince));
        modelArrayList.add(new Model("Frog Hop House", R.drawable.frog_hop_house));
        modelArrayList.add(new Model("Lizard Lounge", R.drawable.lizard_lounge));
        modelArrayList.add(new Model("Boutary", R.drawable.boutary));
        modelArrayList.add(new Model("Epicure", R.drawable.epicure));
        modelArrayList.add(new Model("La Table de Colette", R.drawable.la_table_de_colette));
        modelArrayList.add(new Model("Mumi", R.drawable.mumi));

        // we are initializing our adapter class and passing our arraylist to it.
        MyAdapter MyAdapter = new MyAdapter(this, modelArrayList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());

        // in below two lines we are setting layout manager and adapter to our recycler view.
        rvFoodDrink.setLayoutManager(layoutManager);
        rvFoodDrink.setAdapter(MyAdapter);


        return view;
    }


}