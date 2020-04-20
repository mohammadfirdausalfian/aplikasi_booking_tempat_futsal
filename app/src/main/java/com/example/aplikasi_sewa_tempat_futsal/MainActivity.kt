package com.example.aplikasi_sewa_tempat_futsal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_Carapesan()
        btn_jadwal()
        btn_MenuLapangan()
        btn_booking()
    }

    fun btn_Carapesan() {
        btn_Carapesan.setOnClickListener() {
            val CaraPesan = Intent(context, CaraPesan::class.java)
            startActivity(CaraPesan)
            finish()
        }

    }

    fun btn_jadwal() {
        btn_jadwal.setOnClickListener() {
            val LihatJadwal = Intent(context, LihatJadwal::class.java)
            startActivity(LihatJadwal)
            finish()
        }

    }

    fun btn_MenuLapangan() {
        btn_MenuLapangan.setOnClickListener() {
            val MenuLapangan = Intent(context, MenuLapangan::class.java)
            startActivity(MenuLapangan)
            finish()
        }
    }
    fun btn_booking(){
        btn_booking.setOnClickListener(){
            val Booking = Intent(context,Booking::class.java)
            startActivity(Booking)
            finish()
        }
    }
}

