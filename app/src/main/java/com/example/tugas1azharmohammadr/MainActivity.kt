package com.example.tugas1azharmohammadr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val stambukEdt = findViewById<EditText>(R.id.stambukEdt)
        val namaEdt = findViewById<EditText>(R.id.namaEdt)
        val simpan = findViewById<Button>(R.id.btnSimpan)
        val batal = findViewById<Button>(R.id.btnBatal)

        val favorite = findViewById<ImageButton>(R.id.faveImgButton)

        simpan.setOnClickListener {
            if (stambukEdt.text.length > 1 && namaEdt.text.length > 1) {
                Toast.makeText(this, "Stambuk = ${stambukEdt.text} , nama = ${namaEdt.text} telah disimpan", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Tidak dapat disimpan, Silahkan isi dengan benar sebelum menyimpan", Toast.LENGTH_SHORT).show()
            }
        }


        batal.setOnClickListener {
            stambukEdt.setText("")
            namaEdt.setText("")
            Toast.makeText(this, "Data batal disimpan", Toast.LENGTH_SHORT).show()
        }

    }

}