package codedragon.com.guider;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        mContext = context;
    }

    public Fragment getItem(int position) {
        if (position == 0) {
            return new ImagesFragment();
        } else if (position == 1) {
            return new PlacesFragment();
        } else if (position == 2) {
            return new DiningFragment();
        } else {
            return new EventsFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.title_images);
        } else if (position == 1) {
            return mContext.getString(R.string.title_places);
        } else if (position == 2) {
            return mContext.getString(R.string.title_dining);
        } else {
            return mContext.getString(R.string.title_events);
        }
    }
}