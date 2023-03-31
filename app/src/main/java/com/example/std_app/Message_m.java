//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.std_app;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

public final class Message_m implements Parcelable {
    //public static final Creator<Message> CREATOR = null;
    public int arg1;
    public int arg2;
    public Object obj;
    public Messenger replyTo;
    public int sendingUid = -1;
    public int what;

    public Message_m() {
        throw new RuntimeException("Stub!");
    }

    protected Message_m(Parcel in) {
        arg1 = in.readInt();
        arg2 = in.readInt();
        replyTo = in.readParcelable(Messenger.class.getClassLoader());
        sendingUid = in.readInt();
        what = in.readInt();
    }

    public static final Creator<Message_m> CREATOR = new Creator<Message_m>() {
        @Override
        public Message_m createFromParcel(Parcel in) {
            return new Message_m(in);
        }

        @Override
        public Message_m[] newArray(int size) {
            return new Message_m[size];
        }
    };

    public static Message obtain() {
        throw new RuntimeException("Stub!");
    }

    public static Message obtain(Message orig) {
        throw new RuntimeException("Stub!");
    }

    public static Message obtain(Handler h) {
        throw new RuntimeException("Stub!");
    }

    public static Message obtain(Handler h, Runnable callback) {
        throw new RuntimeException("Stub!");
    }

    public static Message obtain(Handler h, int what) {
        throw new RuntimeException("Stub!");
    }

    public static Message obtain(Handler h, int what, Object obj) {
        throw new RuntimeException("Stub!");
    }

    public static Message obtain(Handler h, int what, int arg1, int arg2) {
        throw new RuntimeException("Stub!");
    }

    public static Message obtain(Handler h, int what, int arg1, int arg2, Object obj) {
        throw new RuntimeException("Stub!");
    }

    public void recycle() {
        throw new RuntimeException("Stub!");
    }

    public void copyFrom(Message o) {
        throw new RuntimeException("Stub!");
    }

    public long getWhen() {
        throw new RuntimeException("Stub!");
    }

    public void setTarget(Handler target) {
        throw new RuntimeException("Stub!");
    }

    public Handler getTarget() {
        throw new RuntimeException("Stub!");
    }

    public Runnable getCallback() {
        throw new RuntimeException("Stub!");
    }

    public Bundle getData() {
        throw new RuntimeException("Stub!");
    }

    public Bundle getData(Bundle x) {
        throw new RuntimeException("Stub!");
    }

    public Bundle peekData() {
        throw new RuntimeException("Stub!");
    }

    public void setData(Bundle data) {
        throw new RuntimeException("Stub!");
    }

    public void sendToTarget() {
        throw new RuntimeException("Stub!");
    }

    public boolean isAsynchronous() {
        throw new RuntimeException("Stub!");
    }

    public void setAsynchronous(boolean async) {
        throw new RuntimeException("Stub!");
    }

    public String toString() {
        throw new RuntimeException("Stub!");
    }

    public int describeContents() {
        throw new RuntimeException("Stub!");
    }

    public void writeToParcel(Parcel dest, int flags) {
        throw new RuntimeException("Stub!");
    }
}
