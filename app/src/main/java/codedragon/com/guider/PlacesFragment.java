package codedragon.com.guider;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class PlacesFragment extends Fragment {

    public PlacesFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.tour_list, container, false );

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<>(  );

        locations.add( new Location( R.drawable.eiffel_tower, R.string.location_eiffel_tower,
                R.string.address_eiffel_tower, R.string.phone_eiffel_tower) );

        locations.add( new Location( R.drawable.louvre_museum, R.string.location_louvre_museum,
                R.string.address_louvre_museum, R.string.phone_louvre_museum) );

        locations.add( new Location( R.drawable.notre_dame, R.string.location_notre_dame,
                R.string.address_notre_dame, R.string.phone_notre_dame) );

        locations.add( new Location( R.drawable.arc_de_triomphe, R.string.location_arc_de_triomphe,
                R.string.address_arc_de_triomphe, R.string.phone_arc_de_triomphe) );

        locations.add( new Location( R.drawable.palace_of_versailles, R.string.location_palace_of_versailles,
                R.string.address_palace_of_versailles, R.string.phone_palace_of_versailles) );

        locations.add( new Location( R.drawable.sacre_cur_basilica, R.string.location_sacré_cœur,
                R.string.address_sacré_cœur, R.string.phone_sacré_cœur) );

        locations.add( new Location( R.drawable.place_de_la_concorde, R.string.location_place_de_la_concorde,
                R.string.address_place_de_la_concorde, R.string.phone_place_de_la_concorde) );

        locations.add( new Location( R.drawable.musee_d_orsay, R.string.location_musée_d_orsay,
                R.string.address_musée_d_orsay, R.string.phone_musée_d_orsay) );

        locations.add( new Location( R.drawable.tuileries_garden, R.string.location_tuileries_garden,
                R.string.address_tuileries_garden, R.string.phone_tuileries_garden) );

        locations.add( new Location( R.drawable.jardin_du_luxembourg, R.string.location_jardin_du_luxembourg,
                R.string.address_jardin_du_luxembourg, R.string.phone_jardin_du_luxembourg) );

        locations.add( new Location( R.drawable.centre_georges_pompidou, R.string.location_centre_georges_pompidou,
                R.string.address_centre_georges_pompidou, R.string.phone_centre_georges_pompidou) );

        locations.add( new Location( R.drawable.moulin_rouge, R.string.location_moulin_rouge,
                R.string.address_moulin_rouge, R.string.phone_moulin_rouge) );

        locations.add( new Location( R.drawable.les_invalides, R.string.location_les_invalides,
                R.string.address_les_invalides, R.string.phone_les_invalides) );

        locations.add( new Location( R.drawable.pere_lachaise_cemetery, R.string.location_père_lachaise_cemetery,
                R.string.address_père_lachaise_cemetery, R.string.phone_père_lachaise_cemetery) );

        locations.add( new Location( R.drawable.catacombs_of_paris, R.string.location_catacombs_of_paris,
                R.string.address_catacombs_of_paris, R.string.phone_catacombs_of_paris) );


        LocationAdapter adapter = new LocationAdapter( getActivity(), locations );
        ListView listView = (ListView) rootView.findViewById( R.id.list );
        listView.setAdapter( adapter );
        return rootView;
    }
}