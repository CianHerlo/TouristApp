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

public class ActivityAdapter extends RecyclerView.Adapter<ActivityAdapter.ViewHolder> {

    private final Fragment2 context;                            // Fragment 2 Context Declaration
    private final ArrayList<ActivityModel> activityArrayList;   // ArrayList of type Activity Model to store cards information as Objects

    // Constructor
    public ActivityAdapter(Fragment2 context, ArrayList<ActivityModel> activityArrayList) {
        this.context = context;
        this.activityArrayList = activityArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_activities_card, parent, false); // Inflates each Card to the Recyclerview
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ActivityAdapter.ViewHolder holder, int position) {
        // Set Data for the Cards Info
        final ActivityModel model = activityArrayList.get(position);
        holder.cardTitleActivity.setText(model.getActivity_title());
        holder.cardDescActivity.setText(model.getActivity_desc());
        holder.cardImageActivity.setImageResource(model.getActivity_image());

        holder.itemView.setOnClickListener(view -> {
            itemClick(model);           // Calls itemClick to perform function of click listener for card views
        });
    }

    public void itemClick(ActivityModel model) {    // Call this to send information to new activity and pass information about card through to that activity
        Intent intent = new Intent(context.getContext(), GGDetails.class);

        // Uses Key Value Pairs to send information to new Activity
        intent.putExtra("Title", model.getActivity_title());
        intent.putExtra("Desc", model.getActivity_desc());
        intent.putExtra("Image", model.getActivity_image());
        intent.putExtra("Link", model.getActivity_link());
        context.startActivity(intent);      // Starts up new activity
    }

    @Override
    public int getItemCount() {
        return activityArrayList.size();    // Returns length of ArrayList if needed
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {    // Initialise Views such as TextView or ImageView
        private final ImageView cardImageActivity;
        private final TextView cardTitleActivity;
        private final TextView cardDescActivity;

        public ViewHolder(@NonNull View itemView) {                     // Points to Views in Fragment
            super(itemView);
            cardImageActivity = itemView.findViewById(R.id.cardImageActivity);
            cardTitleActivity = itemView.findViewById(R.id.cardTitleActivity);
            cardDescActivity = itemView.findViewById(R.id.cardDescActivity);
        }
    }
}
