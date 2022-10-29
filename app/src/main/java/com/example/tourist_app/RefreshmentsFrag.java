package com.example.tourist_app;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RefreshmentsFrag extends Fragment {


    public RefreshmentsFrag() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        TextView titleTextView = (TextView) container.findViewById(R.id.refreshmentTitleFrag);
        TextView descTextView = (TextView) container.findViewById(R.id.refreshmentdescFrag);
        ImageView imageView = (ImageView) container.findViewById(R.id.refreshmentImageFrag);
        Bundle bundle = this.getArguments();
        String title = bundle.getString("Title");
        String desc = bundle.getString("Description");
        int image = bundle.getInt("Image");

        titleTextView.setText(title);
        descTextView.setText(desc);
        imageView.setImageResource(image);

        return inflater.inflate(R.layout.fragment_refreshments, container, false);
    }
}