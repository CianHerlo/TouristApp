package com.example.tourist_app;

import androidx.appcompat.app.AppCompatActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GGDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ggdetails);                    // Initialise Activity layout

        TextView titleTxt = (TextView) findViewById(R.id.ggTitle);      // Initialise TextView for Title
        TextView descTxt = (TextView) findViewById(R.id.ggDesc);        // Initialise TextView for Description
        ImageView imageView = (ImageView) findViewById(R.id.ggImage);   // Initialise ImageView for Image


        // Grabs all information passed through when switching Activity
        Intent intent = getIntent();
        String title = intent.getStringExtra("Title");             // Sets Variable for Title Passed Through
        String desc = intent.getStringExtra("Desc");               // Sets Variable for Description Passed Through
        String link = intent.getStringExtra("Link");               // Sets Variable for Link Passed Through

        // Image pass through uses bundle to grab information
        Bundle bundle = getIntent().getExtras();
        int image = bundle.getInt("Image");                         // Sets Variable for Image Passed Through

        // Set Views using Variables Received from Other Activity
        imageView.setImageResource(image);
        titleTxt.setText(title);
        descTxt.setText(desc);


        // Initialising 2 Buttons for Search and Home and calls a Method for appropriate Action
        Button searchBTN = (Button) findViewById(R.id.searchBTN);
        searchBTN.setOnClickListener(view -> searchBTNPressed(link));

        Button backBTN = (Button) findViewById(R.id.backBTN);
        backBTN.setOnClickListener(view -> onBackPressed());
    }

    @Override
    public void onBackPressed() {                                       // Sends user Back to Home (Main Activity)
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void searchBTNPressed(String link) {                         // Sends User to Default Search Engine and Searches Website of Given Place
        Intent intent1 = new Intent(Intent.ACTION_WEB_SEARCH);
        intent1.putExtra(SearchManager.QUERY, link);
        startActivity(intent1);
    }
}
