package com.example.nirou.correccionexamen

import android.os.Parcel
import android.os.Parcelable

class Disfraz(var nombre:String, var talla:String, var genero:String, var precio:String):Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString()) {
    }


    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nombre)
        parcel.writeString(talla)
        parcel.writeString(genero)
        parcel.writeString(precio)
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun toString(): String {
        return "${nombre}"
    }

    companion object CREATOR : Parcelable.Creator<Disfraz> {
        override fun createFromParcel(parcel: Parcel): Disfraz {
            return Disfraz(parcel)
        }

        override fun newArray(size: Int): Array<Disfraz?> {
            return arrayOfNulls(size)
        }
    }
}