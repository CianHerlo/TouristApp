package com.example.tourist_app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Fragment1 extends Fragment {
    View view;
    public Fragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_1, container, false);


        FloatingActionButton fab = view.findViewById(R.id.fab);
        fab.setOnClickListener(view -> {
            Intent intent = new Intent(
                    Intent.ACTION_SENDTO,
                    Uri.parse("mailto:cian.herlihy@mycit.ie")
            );
            startActivity(intent);
        });
        return view;
    }
}