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

//        ketika imagebutton favorite ditekan maka akan muncul pop up text
        favorite.setOnClickListener{
            Toast.makeText(this, "Ini tombol favorite", Toast.LENGTH_SHORT).show()
        }

//        Ketika button simpan ditekan, akan muncul pop up text sesuai dengan kondisi edit text
        simpan.setOnClickListener {
            if (stambukEdt.text.length > 1 && namaEdt.text.length > 1) {
                Toast.makeText(this, "Stambuk = ${stambukEdt.text} , nama = ${namaEdt.text} telah disimpan", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Tidak dapat disimpan, Silahkan isi dengan benar sebelum menyimpan", Toast.LENGTH_SHORT).show()
            }
        }


//        Ketika button batal ditekan, maka akan mereset edit text dan menampilkan pop up text
        batal.setOnClickListener {
            stambukEdt.setText("")
            namaEdt.setText("")
            Toast.makeText(this, "Data batal disimpan", Toast.LENGTH_SHORT).show()
        }

    }

}