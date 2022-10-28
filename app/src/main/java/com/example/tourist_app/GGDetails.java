package com.example.tourist_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GGDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ggdetails);

        TextView titleTxt = (TextView) findViewById(R.id.ggTitle);
        TextView descTxt = (TextView) findViewById(R.id.ggDesc);
        ImageView imageView = (ImageView) findViewById(R.id.ggImage);

        Intent intent = getIntent();
        String title = intent.getStringExtra("Title");
        String desc = intent.getStringExtra("Desc");
        Bundle bundle = getIntent().getExtras();
        int image = bundle.getInt("Image");

        imageView.setImageResource(image);
        titleTxt.setText(title);
        descTxt.setText(desc);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}