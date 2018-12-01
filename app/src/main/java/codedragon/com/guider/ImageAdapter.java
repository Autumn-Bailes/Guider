package codedragon.com.guider;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ImageAdapter extends ArrayAdapter<Location> {

    public ImageAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from( getContext() ).inflate(
                    R.layout.list_images, parent, false );
        }

        // Get the object located at this position in the list
        Location currentLocation = getItem( position );

        // Find the ImageView in the list_item.xml layout with the Id imageView
        ImageView imageView = (ImageView) listItemView.findViewById( R.id.imageView );
        if (currentLocation != null) {
            imageView.setImageResource( currentLocation.getImageResourceId() );
        }

        // Find the TextView in the list_item.xml layout with the Id location
        TextView locationView = (TextView) listItemView.findViewById( R.id.location );
        if (currentLocation != null) {
            locationView.setText( currentLocation.getLocationResourceId() );
        }

        // Return the whole list item layout
        return listItemView;
    }
}
