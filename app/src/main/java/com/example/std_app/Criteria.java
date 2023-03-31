//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.std_app;


import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Criteria implements Parcelable {
    public static final int ACCURACY_COARSE = 2;
    public static final int ACCURACY_FINE = 1;
    public static final int ACCURACY_HIGH = 3;
    public static final int ACCURACY_LOW = 1;
    public static final int ACCURACY_MEDIUM = 2;

    public static final Creator<Criteria> CREATOR = null;
    public static final int NO_REQUIREMENT = 0;
    public static final int POWER_HIGH = 3;
    public static final int POWER_LOW = 1;
    public static final int POWER_MEDIUM = 2;

    public Criteria() {
        throw new RuntimeException("Stub!");
    }

    public Criteria(Criteria criteria) {
        throw new RuntimeException("Stub!");
    }

    public void setHorizontalAccuracy(int accuracy) {
        throw new RuntimeException("Stub!");
    }

    public int getHorizontalAccuracy() {
        throw new RuntimeException("Stub!");
    }

    public void setVerticalAccuracy(int accuracy) {
        throw new RuntimeException("Stub!");
    }

    public int getVerticalAccuracy() {
        throw new RuntimeException("Stub!");
    }

    public void setSpeedAccuracy(int accuracy) {
        throw new RuntimeException("Stub!");
    }

    public int getSpeedAccuracy() {
        throw new RuntimeException("Stub!");
    }

    public void setBearingAccuracy(float accuracy) {
        throw new RuntimeException("Stub!");
    }

    public int getBearingAccuracy() {
        throw new RuntimeException("Stub!");
    }

    public void setAccuracy(int accuracy) {
        throw new RuntimeException("Stub!");
    }

    public int getAccuracy() {
        throw new RuntimeException("Stub!");
    }

    public void setPowerRequirement(int powerRequirement) {
        throw new RuntimeException("Stub!");
    }

    public int getPowerRequirement() {
        throw new RuntimeException("Stub!");
    }

    public void setCostAllowed(boolean costAllowed) {
        throw new RuntimeException("Stub!");
    }

    public boolean isCostAllowed() {
        throw new RuntimeException("Stub!");
    }

    public void setAltitudeRequired(boolean altitudeRequired) {
        throw new RuntimeException("Stub!");
    }

    public boolean isAltitudeRequired() {
        throw new RuntimeException("Stub!");
    }

    public void setSpeedRequired(boolean speedRequired) {
        throw new RuntimeException("Stub!");
    }

    public boolean isSpeedRequired() {
        throw new RuntimeException("Stub!");
    }

    //public void setBearingRequired(boolean bearingRequired) {
    //    throw new RuntimeException("Stub!");
    //}

    public boolean isBearingRequired() {
        throw new RuntimeException("Stub!");
    }

    public int describeContents() {
        throw new RuntimeException("Stub!");
    }

    public void writeToParcel(Parcel parcel, int flags) {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }
}

