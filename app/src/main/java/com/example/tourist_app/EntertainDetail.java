package com.example.tourist_app;

import androidx.appcompat.app.AppCompatActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class EntertainDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertain_detail);

        TextView titleTxt = (TextView) findViewById(R.id.entertainTitle);
        TextView descTxt = (TextView) findViewById(R.id.entertainDesc);
        ImageView imageView = (ImageView) findViewById(R.id.entertainImage);

        Intent intent = getIntent();
        String title = intent.getStringExtra("Title");
        String desc = intent.getStringExtra("Desc");
        String link = intent.getStringExtra("Link");
        Bundle bundle = getIntent().getExtras();
        int image = bundle.getInt("Image");

        imageView.setImageResource(image);
        titleTxt.setText(title);
        descTxt.setText(desc);

        Button searchBTN = (Button) findViewById(R.id.searchBTN);
        searchBTN.setOnClickListener(view -> searchBTNPressed(link));

        Button backBTN = (Button) findViewById(R.id.backBTN);
        backBTN.setOnClickListener(view -> onBackPressed());
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void searchBTNPressed(String link) {
        Intent intent1 = new Intent(Intent.ACTION_WEB_SEARCH);
        intent1.putExtra(SearchManager.QUERY, link);
        startActivity(intent1);
    }
}