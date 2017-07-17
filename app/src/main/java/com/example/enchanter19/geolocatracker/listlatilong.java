package com.example.enchanter19.geolocatracker;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by enchanter19 on 12/7/17.
 */

public class listlatilong implements Parcelable {
    String lati;
    String longi;
    String names;
    String filter;


    protected listlatilong(Parcel in) {
        lati = in.readString();
        longi = in.readString();
        names = in.readString();
        filter = in.readString();
    }

    public static final Creator<listlatilong> CREATOR = new Creator<listlatilong>() {
        @Override
        public listlatilong createFromParcel(Parcel in) {
            return new listlatilong(in);
        }

        @Override
        public listlatilong[] newArray(int size) {
            return new listlatilong[size];
        }
    };

    public String getLati() {
        return lati;
    }

    public void setLati(String lati) {
        this.lati = lati;
    }

    public String getLongi() {
        return longi;
    }

    public void setLongi(String longi) {
        this.longi = longi;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(lati);
        parcel.writeString(longi);
        parcel.writeString(names);
        parcel.writeString(filter);
    }
}
