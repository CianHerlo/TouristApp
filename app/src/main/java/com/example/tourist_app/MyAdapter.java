package com.example.tourist_app;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.net.URLEncoder;
import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private final Fragment3 context;
    private final ArrayList<Model> modelArrayList;

    // Constructor
    public MyAdapter(Fragment3 context, ArrayList<Model> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_cards, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        // to set data to textview and imageview of each card layout
        final Model model = modelArrayList.get(position);
        holder.cardTitle.setText(model.getCard_title());
        holder.cardImage.setImageResource(model.getCard_image());

        holder.itemView.setOnClickListener(view -> {
            //Should Re-Direct User to Website of Restaurant/Pub
            //Toast.makeText(view.getContext(), ""+model.getCard_title() , Toast.LENGTH_SHORT).show();

            Snackbar snackbar = Snackbar.make(view, ""+model.getCard_title(), 5000);
            snackbar.setAction("Search", view1 -> {
                Intent viewSearch = new Intent(Intent.ACTION_VIEW);
                viewSearch.putExtra(SearchManager.QUERY, model.getCard_title());
                startActivity(viewSearch);
            });
            snackbar.show();

//            Intent intent;
//                switch (holder.getAdapterPosition()) {
//                    case 0:
//                        intent = new Intent(Intent.ACTION_SEARCH, Uri.parse("https://www.google.ie"));
//                        startActivity(intent);
//                        break;
//                    case 1:
//                        Intent intent1 = new Intent(Intent.ACTION_WEB_SEARCH);
//                        intent1.putExtra(SearchManager.QUERY, "https://www.google.ie/1");
//                        startActivity(intent1);
//
//                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.ie"));
//                        startActivity(intent);
//                        break;
//                    case 2:
//                        intent = new Intent(Intent.ACTION_WEB_SEARCH);
//                        intent.putExtra(SearchManager.QUERY, "https://www.google.ie/2");
//                        startActivity(intent);
//                        break;
//                }
        });
    }

    private void startActivity(Intent viewIntent) {
    }

    @Override
    public int getItemCount() {
        // this method is used for showing number of card items in recycler view
        return modelArrayList.size();
    }

    // View holder class for initializing of your views such as TextView and Imageview
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView cardImage;
        private final TextView cardTitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardImage = itemView.findViewById(R.id.cardImage);
            cardTitle = itemView.findViewById(R.id.cardTitle);
        }
    }
}
