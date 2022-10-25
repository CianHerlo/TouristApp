package com.example.tourist_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class ActivityAdapter extends RecyclerView.Adapter<ActivityAdapter.ViewHolder> {

    private final Fragment2 context;
    private final ArrayList<ActivityModel> activityArrayList;

    // Constructor
    public ActivityAdapter(Fragment2 context, ArrayList<ActivityModel> activityArrayList) {
        this.context = context;
        this.activityArrayList = activityArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_activities_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ActivityAdapter.ViewHolder holder, int position) {
        // to set data to textview and imageview of each card layout
        final ActivityModel model = activityArrayList.get(position);
        holder.cardTitleActivity.setText(model.getActivity_title());
        holder.cardDescActivity.setText(model.getActivity_desc());
        holder.cardImageActivity.setImageResource(model.getActivity_image());

        holder.itemView.setOnClickListener(view -> {
            //Should Re-Direct User to Website about Activity
        });
    }

    @Override
    public int getItemCount() {
        // this method is used for showing number of card items in recycler view
        return activityArrayList.size();
    }

    // View holder class for initializing of your views such as TextView and Imageview
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView cardImageActivity;
        private final TextView cardTitleActivity;
        private final TextView cardDescActivity;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardImageActivity = itemView.findViewById(R.id.cardImageActivity);
            cardTitleActivity = itemView.findViewById(R.id.cardTitleActivity);
            cardDescActivity = itemView.findViewById(R.id.cardDescActivity);
        }
    }
}
