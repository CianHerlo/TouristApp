package com.example.tourist_app;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
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

        /* TODO Fix the Intents to Re-Direct User to a Google Search of that Restaurant or Pub. Google Maps testing is for Fragment 2 of Landmarks */
        holder.itemView.setOnClickListener(view -> itemClick(model));
    }

    public void itemClick(Model model) {
        Intent intent = new Intent(context.getContext(), GGDetails.class);
        intent.putExtra("Title", model.getCard_title());
        intent.putExtra("Desc", model.getCard_desc());
        intent.putExtra("Image", model.getCard_image());
        intent.putExtra("Link", model.getCard_link());
        context.startActivity(intent);
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
