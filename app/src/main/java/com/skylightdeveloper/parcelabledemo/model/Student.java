package com.skylightdeveloper.parcelabledemo.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Akash Wangalwar on 16-10-2016.
 */
public class Student implements Parcelable{

    private String mName;
    private int mRollNumber;
    private String mAddress;

    public Student(String mName, int mRollNumber, String mAddress){
        this.mName = mName;
        this.mRollNumber = mRollNumber;
        this.mAddress = mAddress;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmRollNumber() {
        return mRollNumber;
    }

    public void setmRollNumber(int mRollNumber) {
        this.mRollNumber = mRollNumber;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    @Override
    public int describeContents() {
        return 0;
    }
    public static final Parcelable.Creator CREATOR = new ClassLoaderCreator() {
        @Override
        public Student createFromParcel(Parcel source, ClassLoader loader) {
            return new Student(source);
        }

        @Override
        public Student createFromParcel(Parcel source) {
            return new Student(source);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };
    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(mName);
        dest.writeInt(mRollNumber);
        dest.writeString(mAddress);
    }

    public Student(Parcel parcel){

        mName = parcel.readString();
        mRollNumber = parcel.readInt();
        mAddress = parcel.readString();
    }
}
