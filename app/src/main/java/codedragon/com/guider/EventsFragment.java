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

public class EventsFragment extends Fragment {

    public EventsFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.tour_list, container, false );

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<>(  );

        locations.add( new Location( R.drawable.fashion_week_event, R.string.month_fashion_week) );

        locations.add( new Location( R.drawable.valentines_day_paris, R.string.month_valentines_day) );

        locations.add( new Location( R.drawable.fit_bit_half_marathon, R.string.month_fitbit_half_marathon) );

        locations.add( new Location( R.drawable.paris_expo_porte_de_versailles, R.string
                .month_paris_expo_porte_de_versailles) );

        locations.add( new Location( R.drawable.villette_sonique, R.string.month_villette_sonique) );

        locations.add( new Location( R.drawable.download_festival, R.string.month_download_festival) );

        locations.add( new Location( R.drawable.bastille_day, R.string.month_bastille_day) );

        locations.add( new Location( R.drawable.open_air_cinema_festival, R.string.month_open_air_cinema_festival) );

        locations.add( new Location( R.drawable.european_heritage_days, R.string.month_european_heritage_days) );

        locations.add( new Location( R.drawable.nuit_blanche, R.string.month_nuit_blanche) );

        locations.add( new Location( R.drawable.christmas_illuminations, R.string.month_christmas_illuminations) );

        locations.add( new Location( R.drawable.christmas_window_displays, R.string.month_christmas_window_displays) );



        ImageAdapter adapter = new ImageAdapter( getActivity(), locations );
        ListView listView = rootView.findViewById( R.id.list );
        listView.setAdapter( adapter );
        return rootView;
    }
}
