package com.badra.submissiondicoding;

import android.os.Parcel;
import android.os.Parcelable;

public class BahasaPemograman implements Parcelable {
    private String name, note, photo,desc;

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public String getNote() {
        return note;
    }

    public String getDesc() {
        return desc;
    }

    public String getPhoto() {
        return photo;
    }

    protected BahasaPemograman(Parcel in){
        name= in.readString();
        note= in.readString();
        photo= in.readString();
        desc= in.readString();
    }

    public static final Creator<BahasaPemograman> CREATOR = new Creator<BahasaPemograman>() {
        @Override
        public BahasaPemograman createFromParcel(Parcel in) {
            return new BahasaPemograman(in);
        }

        @Override
        public BahasaPemograman[] newArray(int size) {
            return new BahasaPemograman[size];
        }
    };
    public BahasaPemograman() {

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(note);
        parcel.writeString(photo);
        parcel.writeString(desc);
    }
}
