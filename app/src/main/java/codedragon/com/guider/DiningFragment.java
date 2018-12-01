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

public class DiningFragment extends Fragment {

    public DiningFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.tour_list, container, false );

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<>(  );

        locations.add( new Location( R.drawable.le_cinq, R.string.location_le_cinq,
                R.string.address_le_cinq, R.string.phone_le_cinq) );

        locations.add( new Location( R.drawable.the_breizh_cafe, R.string.location_breizh_café,
                R.string.address_breizh_café, R.string.phone_breizh_café) );

        locations.add( new Location( R.drawable.pur_jean_francois_rouquette, R.string.location_pur_jean_françois_rouquette,
                R.string.address_pur_jean_françois_rouquette, R.string.phone_pur_jean_françois_rouquette) );

        locations.add( new Location( R.drawable.le_calife, R.string.location_le_calife,
                R.string.address_le_calife, R.string.phone_le_calife) );

        locations.add( new Location( R.drawable.epicure, R.string.location_epicure,
                R.string.address_epicure, R.string.phone_epicure) );

        locations.add( new Location( R.drawable.l_astrance, R.string.location_l_astrance,
                R.string.address_l_astrance, R.string.phone_l_astrance) );

        locations.add( new Location( R.drawable.les_canailles, R.string.location_les_canailles,
                R.string.address_les_canailles, R.string.phone_les_canailles) );

        locations.add( new Location( R.drawable.l_abeille, R.string.location_l_abeille,
                R.string.address_l_abeille, R.string.phone_l_abeille) );

        locations.add( new Location( R.drawable.pierre_gagnaire, R.string.location_pierre_gagnaire,
                R.string.address_pierre_gagnaire, R.string.phone_pierre_gagnaire) );

        locations.add( new Location( R.drawable.il_etait_square, R.string.location_il_était_un_square,
                R.string.address_il_était_un_square, R.string.phone_il_était_un_square) );

        locations.add( new Location( R.drawable.l_arcane, R.string.location_l_arcane,
                R.string.address_l_arcane, R.string.phone_l_arcane) );

        locations.add( new Location( R.drawable.new_jawad_longchamp, R.string.location_new_jawad_longchamp,
                R.string.address_new_jawad_longchamp, R.string.phone_new_jawad_longchamp) );

        locations.add( new Location( R.drawable.boutary, R.string.location_boutary,
                R.string.address_boutary, R.string.phone_boutary) );

        locations.add( new Location( R.drawable.restaurant__kei, R.string.location_restaurant_kei,
                R.string.address_restaurant_kei, R.string.phone_restaurant_kei) );

        locations.add( new Location( R.drawable.le_vent_d_armor, R.string.location_le_vent_d_armor,
                R.string.address_le_vent_d_armor, R.string.phone_le_vent_d_armor) );

        LocationAdapter adapter = new LocationAdapter( getActivity(), locations );
        ListView listView = (ListView) rootView.findViewById( R.id.list );
        listView.setAdapter( adapter );
        return rootView;
    }
}
