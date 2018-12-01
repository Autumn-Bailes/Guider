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

public class ImagesFragment extends Fragment {


    public ImagesFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.tour_list, container, false );

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<>();
        // Locations
        locations.add( new Location( R.drawable.eiffel_tower, R.string.location_eiffel_tower) );
        locations.add( new Location( R.drawable.louvre_museum, R.string.location_louvre_museum) );
        locations.add( new Location( R.drawable.notre_dame, R.string.location_notre_dame) );
        locations.add( new Location( R.drawable.arc_de_triomphe, R.string.location_arc_de_triomphe) );
        locations.add( new Location( R.drawable.palace_of_versailles, R.string.location_palace_of_versailles) );
        locations.add( new Location( R.drawable.sacre_cur_basilica, R.string.location_sacré_cœur) );
        locations.add( new Location( R.drawable.place_de_la_concorde, R.string.location_place_de_la_concorde) );
        locations.add( new Location( R.drawable.musee_d_orsay, R.string.location_musée_d_orsay) );
        locations.add( new Location( R.drawable.tuileries_garden, R.string.location_tuileries_garden) );
        locations.add( new Location( R.drawable.jardin_du_luxembourg, R.string.location_jardin_du_luxembourg) );
        locations.add( new Location( R.drawable.centre_georges_pompidou, R.string.location_centre_georges_pompidou) );
        locations.add( new Location( R.drawable.moulin_rouge, R.string.location_moulin_rouge) );
        locations.add( new Location( R.drawable.les_invalides, R.string.location_les_invalides) );
        locations.add( new Location( R.drawable.pere_lachaise_cemetery, R.string.location_père_lachaise_cemetery) );
        locations.add( new Location( R.drawable.catacombs_of_paris, R.string.location_catacombs_of_paris) );

        // Dining
        locations.add( new Location( R.drawable.le_cinq, R.string.location_le_cinq) );
        locations.add( new Location( R.drawable.the_breizh_cafe, R.string.location_breizh_café) );
        locations.add( new Location( R.drawable.pur_jean_francois_rouquette, R.string.location_pur_jean_françois_rouquette) );
        locations.add( new Location( R.drawable.le_calife, R.string.location_le_calife) );
        locations.add( new Location( R.drawable.epicure, R.string.location_epicure) );
        locations.add( new Location( R.drawable.l_astrance, R.string.location_l_astrance) );
        locations.add( new Location( R.drawable.les_canailles, R.string.location_les_canailles) );
        locations.add( new Location( R.drawable.l_abeille, R.string.location_l_abeille) );
        locations.add( new Location( R.drawable.pierre_gagnaire, R.string.location_pierre_gagnaire) );
        locations.add( new Location( R.drawable.il_etait_square, R.string.location_il_était_un_square) );
        locations.add( new Location( R.drawable.l_arcane, R.string.location_l_arcane) );
        locations.add( new Location( R.drawable.new_jawad_longchamp, R.string.location_new_jawad_longchamp) );
        locations.add( new Location( R.drawable.boutary, R.string.location_boutary) );
        locations.add( new Location( R.drawable.restaurant__kei, R.string.location_restaurant_kei) );
        locations.add( new Location( R.drawable.le_vent_d_armor, R.string.location_le_vent_d_armor) );

        // Events
        locations.add( new Location( R.drawable.fashion_week_event, R.string.event_fashion_week) );
        locations.add( new Location( R.drawable.valentines_day_paris, R.string.event_valentines_day) );
        locations.add( new Location( R.drawable.fit_bit_half_marathon, R.string.event_fitbit_half_marathon) );
        locations.add( new Location( R.drawable.paris_expo_porte_de_versailles, R.string.event_paris_expo_porte_de_versailles) );
        locations.add( new Location( R.drawable.villette_sonique, R.string.event_villette_sonique) );
        locations.add( new Location( R.drawable.download_festival, R.string.event_download_festival) );
        locations.add( new Location( R.drawable.bastille_day, R.string.event_bastille_day) );
        locations.add( new Location( R.drawable.open_air_cinema_festival, R.string.event_open_air_cinema_festival) );
        locations.add( new Location( R.drawable.european_heritage_days, R.string.event_european_heritage_days) );
        locations.add( new Location( R.drawable.nuit_blanche, R.string.event_nuit_blanche) );
        locations.add( new Location( R.drawable.christmas_illuminations, R.string.event_christmas_illuminations) );
        locations.add( new Location( R.drawable.christmas_window_displays, R.string.event_christmas_window_displays) );

        ImageAdapter adapter = new ImageAdapter( getActivity(), locations );
        ListView listView = rootView.findViewById( R.id.list );
        listView.setAdapter( adapter );
        return rootView;
    }
}
