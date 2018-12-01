package codedragon.com.guider;

public class Location {

    private int mImageResourceId;
    private int mLocationId;
    private int mAddressId;
    private int mPhoneId;

    // Create a new ParisLocation object
    public Location(int imageResourceId, int locationId, int addressId, int phoneId) {
        mImageResourceId = imageResourceId;
        mLocationId = locationId;
        mAddressId = addressId;
        mPhoneId = phoneId;
    }

    // Create a new ParisLocation object
    public Location(int imageResourceId, int locationId) {
        mImageResourceId = imageResourceId;
        mLocationId = locationId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getLocationResourceId() {
        return mLocationId;
    }

    public int getAddressResourceId() {
        return mAddressId;
    }

    public int getPhoneId() {
        return mPhoneId;
    }

}
