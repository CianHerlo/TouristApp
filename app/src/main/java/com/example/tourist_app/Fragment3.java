package com.example.tourist_app;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

public class Fragment3 extends Fragment {
    View view;


    public Fragment3() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_3, container, false);

        RecyclerView rvFoodDrink = (RecyclerView) view.findViewById(R.id.recyclerViewFoodDrink);

        String greenTxt = "The Green Goose is a Woodsy Irish pub offering homemade comfort food, brunches & craft beers, plus cocktails.";
        String princeTxt = "The Pub O' Prince is a small pub located very close to the Luxembourg Gardens. This pub offers a small but tasty menu too with plenty of drink to be had.";
        String frogTxt = "The Frog Hop House is situated between the glamorous shopping of the Vendome and the bustling warren of streets that fringe the world famous Paris Opera. Frog Hop House specialises in a constantly changing range of artisan craft FrogBeer, genuinely good burgers and American BBQ & soul food.";
        String lizardTxt = "The Lizard Lounge was opened in 1994 by John Coyle, Oliver Jenkins and Phil Morgan. Our concept for the Lizard Lounge is the same then as it is now. Well-made drinks accompanied by delicious bar food and above all a great service from our barstaff. We take great pride in what we do and the service we provide. Come by and see us and let us look after you!";
        String boutaryTxt = "Boutary is the gourmet restaurant of the caviar house of the same name. Like the House's flagship product, it combines refinement and relaxed conviviality for a moment of pleasure to share.";
        String epicureTxt = "A goldsmith of gastronomy Our 3-star chef, Eric Frechon, has resolutely made Epicure the bastion par excellence of French gastronomy. Some come to Paris just to taste his cuisine: his stuffed macaroni, black truffle, artichoke and duck foie gras reflect all the genius and passion of one of the greatest. The Epicure restaurant can be enjoyed every day of the year, with its own terrace in the exquisite garden throughout the summer. Epicure has won for the third consecutive year the \"Grand Award\", the supreme award given by the American magazine Wine Spectator, for its exceptional wine cellar.";
        String coletteTxt = "Located in the prestigious district of the Panthéon and the Sorbonne, steeped in history, culture and French romanticism, La Table de Colette opened its doors at the end of October 2019. Nestled in the charming little rue Laplace, one of these so authentic and silent alleys in the heart of the capital, the opening of the garden terrace on Monday evening June 22, an idyllic setting bathed in vegetation, calm and well-being, promises to be the event of this summer !";
        String mumiTxt = "The MUMI restaurant offers signature cuisine with international touches, fresh and seasonal products with daily arrivals.  The place is very chic, cozy and comfortable with work on the acoustics.  Warm and professional welcome.";

        String greenLink = "https://www.thegreengoose.fr/";
        String princeLink = "https://puboprinceparis.com/";
        String frogLink = "https://www.frogpubs.com/pub-frog-hop-house-paris-9.php";
        String lizardLink = "https://www.timeout.com/paris/en/bars-and-pubs/lizard-lounge";
        String boutaryLink = "https://www.boutary-restaurant.com/";
        String epicureLink = "https://www.oetkercollection.com/hotels/le-bristol-paris/restaurants-bar/epicure/";
        String coletteLink = "https://www.latabledecolette.fr/";
        String mumiLink = "https://www.restaurantmumi.com/";

        ArrayList<Model> modelArrayList = new ArrayList<>();
        modelArrayList.add(new Model("The Green Goose", R.drawable.green_goose, greenTxt, greenLink));
        modelArrayList.add(new Model("Pub O'Prince", R.drawable.pub_o_prince, princeTxt, princeLink));
        modelArrayList.add(new Model("Frog Hop House", R.drawable.frog_hop_house, frogTxt, frogLink));
        modelArrayList.add(new Model("Lizard Lounge", R.drawable.lizard_lounge, lizardTxt, lizardLink));
        modelArrayList.add(new Model("Boutary", R.drawable.boutary, boutaryTxt, boutaryLink));
        modelArrayList.add(new Model("Epicure", R.drawable.epicure, epicureTxt, epicureLink));
        modelArrayList.add(new Model("La Table de Colette", R.drawable.la_table_de_colette, coletteTxt, coletteLink));
        modelArrayList.add(new Model("Mumi", R.drawable.mumi, mumiTxt, mumiLink));

        // we are initializing our adapter class and passing our arraylist to it.
        MyAdapter MyAdapter = new MyAdapter(this, modelArrayList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());

        // in below two lines we are setting layout manager and adapter to our recycler view.
        rvFoodDrink.setLayoutManager(layoutManager);
        rvFoodDrink.setAdapter(MyAdapter);

        FloatingActionButton fab3 = view.findViewById(R.id.fab3);
        fab3.setOnClickListener(view -> rvFoodDrink.scrollToPosition(0));


        return view;
    }


}