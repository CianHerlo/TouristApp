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


    public MyAdapter(Fragment3 context, ArrayList<Model> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {     // Inflates cards into Recycler View
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_cards, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        // Sets Data for Cards from Object in ArrayList depending on Position in ArrayList
        final Model model = modelArrayList.get(position);
        holder.cardTitle.setText(model.getCard_title());
        holder.cardImage.setImageResource(model.getCard_image());

        // Click Listener for Cards to send User to a details page
        holder.itemView.setOnClickListener(view -> itemClick(model));
    }

    public void itemClick(Model model) {    // Send relevent information over to new activity to be used
        Intent intent = new Intent(context.getContext(), GGDetails.class);
        intent.putExtra("Title", model.getCard_title());
        intent.putExtra("Desc", model.getCard_desc());
        intent.putExtra("Image", model.getCard_image());
        intent.putExtra("Link", model.getCard_link());
        context.startActivity(intent);
    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();   // returns ArrayList Length
    }

    // Initialise Views for CardView on Fragment 3
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
