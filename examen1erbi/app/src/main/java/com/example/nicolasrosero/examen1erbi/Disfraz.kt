package com.example.nicolasrosero.examen1erbi

import android.os.Parcel
import android.os.Parcelable

class Disfraz constructor(public var idDisfraz:Int, var nombreDisfraz:String, var talla:String
                          , var cantidad:Int,var precio:Double) :Parcelable {



    constructor(parcel: Parcel) : this(
            parcel.readInt(),
            parcel.readString(),
            parcel.readString(),
            parcel.readInt(),
            parcel.readDouble())
             {
    }

                    override fun writeToParcel(parcel: Parcel, flags: Int) {
                    parcel.writeInt(idDisfraz)
                    parcel.writeString(nombreDisfraz)
                        parcel.writeString(talla)
                        parcel.writeInt(cantidad)
                        parcel.writeDouble(precio)
            }

                override fun describeContents(): Int {
                    return 0
                }

                override fun toString(): String {
                    return "${nombreDisfraz}"
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