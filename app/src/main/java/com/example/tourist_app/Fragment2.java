package com.example.tourist_app;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
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

        String eiffelTxt = "Standing at 324m tall. The Eiffel Tower is the most famous symbol for Paris and has been around since 1889. This makes this amazing tower a must see from the top to overlook the beauty of Paris.";
        String louvreTxt = "The worlds largest museum and houses the most impressive collection of art across the globe. This also features the most famous painting of all, the Mona Lisa. Come visit and see the history as you walk through time and take home memories with you.";
        String arcTxt = "The Arc de Triomphe honours who fought and died in the French Revolution and the Napolopnic Wars. This arch is also seen as the center of Paris making it a hard miss.";
        String museeTxt = "Internationally renowned for its rich collection of impressionist art. displays all western artistic creation from 1848 to 1914 which can range from paintings to architecture. This place does not fail to impress!";
        String notreTxt = "Dedicated to the Virgin Mary, Notre-Dame de Paris is one of the oldest Gothic Cathedrals in the world and one of the best-known. It towers offer incredible views over Paris. Built between 1163 and 1245 on the Île de la Cité, Notre Dame de Paris is one of the oldest gothic cathedrals in the world.";
        String luxTxt = "Located in the heart of the Left Bank, Luxembourg Gardens is a 60-acre park known for its extraordinary public amenities, including fountains, sculpture, ponds, flowerbeds, tennis courts, pony rides, a marionette theatre, playgrounds, food kiosks and open-air cafés.";
        String sainteTxt = "Let yourself be dazzled by the 1,113 stained glass windows in this gem of Rayonnant Gothic architecture. The Sainte-Chapelle is the finest royal chapel to be built in France and features a truly exceptional collection of stainedglass windows. It was built in the mid 13th century by Louis IX, at the heart of the royal residence, the Palais de la Cité, to house the relics of the Passion of Christ. Adorned with a unique collection of fifteen glass panels and a rose window forming a veritable wall of light, the Sainte-Chapelle gem of Rayonnant Gothic architecture.";
        String catacTxt = "The Catacombes de Paris are underground ossuaries which hold the remains of more than six million people in a small part of a tunnel network built to consolidate Paris' ancient stone quarries.";
        String disneyTxt = "Today Disneyland Paris is a multi-day resort offering two world-class theme parks, seven themed Disney hotels and Villages Nature Paris, a 27-hole golf course, the Disney Village® entertainment complex, and Europe's largest integrated corporate events venue.";

        String eiffelLink = "https://www.toureiffel.paris/en";
        String louvreLink = "https://www.louvre.fr/en";
        String arcLink = "https://www.paris-arc-de-triomphe.fr/en/";
        String museeLink = "https://www.musee-orsay.fr/en";
        String notreLink = "https://notredamecathedralparis.com/";
        String luxLink = "https://en.parisinfo.com/paris-museum-monument/71393/Jardin-du-Luxembourg";
        String sainteLink = "https://www.sainte-chapelle.fr/en/";
        String catacLink = "https://www.catacombes.paris.fr/en";
        String disneyLink = "https://www.disneylandparis.com/en-ie/";

        ArrayList<ActivityModel> activityArrayList = new ArrayList<>();
        activityArrayList.add(new ActivityModel("Eiffel Tower", eiffelTxt, R.drawable.eiffel_tower, eiffelLink));
        activityArrayList.add(new ActivityModel("Louvre Museum", louvreTxt, R.drawable.louvre, louvreLink));
        activityArrayList.add(new ActivityModel("Arc de Triumphe", arcTxt, R.drawable.arc_de_triumphe, arcLink));
        activityArrayList.add(new ActivityModel("Musée d'Orsay", museeTxt, R.drawable.musee_dorsay, museeLink));
        activityArrayList.add(new ActivityModel("Notre-Dame", notreTxt, R.drawable.notre_dame, notreLink));
        activityArrayList.add(new ActivityModel("Luxembourg Gardens", luxTxt, R.drawable.luxembourg_gardens, luxLink));
        activityArrayList.add(new ActivityModel("Sainte Chapelle", sainteTxt, R.drawable.sainte_chapelle, sainteLink));
        activityArrayList.add(new ActivityModel("Catacombs de Paris", catacTxt, R.drawable.catacombs, catacLink));
        activityArrayList.add(new ActivityModel("Disneyland Paris", disneyTxt, R.drawable.disneyland, disneyLink));

        // we are initializing our adapter class and passing our arraylist to it.
        ActivityAdapter ActivityAdapter = new ActivityAdapter(this, activityArrayList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());

        // in below two lines we are setting layout manager and adapter to our recycler view.
        rvActivity.setLayoutManager(layoutManager);
        rvActivity.setAdapter(ActivityAdapter);

        FloatingActionButton fab2 = view.findViewById(R.id.fab2);
        fab2.setOnClickListener(view -> rvActivity.scrollToPosition(0));
        return view;
    }
}