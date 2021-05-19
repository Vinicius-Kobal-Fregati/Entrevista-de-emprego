package com.example.projetoentrevistadeemprego

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projetoentrevistadeemprego.api.ApiUtils
import com.example.projetoentrevistadeemprego.api.Endpoint
//import com.example.projetoentrevistadeemprego.api.Posts
import retrofit2.Call
import retrofit2.Response
import retrofit2.Callback

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        var image = mutableListOf<Image>()
        for (i in 1..50){
            image.add(Image(R.drawable.img'$i'))
        }
        Tentativa de automatizar a listagem das fotos locais, não deu certo por divergência de tipos.
         */

    var images = listOf<Image>(
        Image(R.drawable.img1),
        Image(R.drawable.img2),
        Image(R.drawable.img3),
        Image(R.drawable.img4),
        Image(R.drawable.img5),
        Image(R.drawable.img6),
        Image( R.drawable.img7),
        Image(R.drawable.img8),
        Image(R.drawable.img9),
        Image(R.drawable.img10),
        Image(R.drawable.img11),
        Image(R.drawable.img12),
        Image(R.drawable.img13),
        Image(R.drawable.img14),
        Image(R.drawable.img15),
        Image(R.drawable.img16),
        Image(R.drawable.img17),
        Image(R.drawable.img18),
        Image(R.drawable.img19),
        Image(R.drawable.img20),
        Image(R.drawable.img21),
        Image(R.drawable.img22),
        Image(R.drawable.img23),
        Image(R.drawable.img24),
        Image(R.drawable.img25),
        Image(R.drawable.img26),
        Image(R.drawable.img27),
        Image(R.drawable.img28),
        Image(R.drawable.img29),
        Image(R.drawable.img30),
        Image(R.drawable.img31),
        Image(R.drawable.img32),
        Image(R.drawable.img33),
        Image(R.drawable.img34),
        Image(R.drawable.img35),
        Image(R.drawable.img36),
        Image(R.drawable.img37),
        Image(R.drawable.img38),
        Image(R.drawable.img39),
        Image(R.drawable.img40),
        Image(R.drawable.img41),
        Image(R.drawable.img42),
        Image(R.drawable.img43),
        Image(R.drawable.img44),
        Image(R.drawable.img45),
        Image(R.drawable.img46),
        Image(R.drawable.img47),
        Image(R.drawable.img48),
        Image(R.drawable.img49),
        Image(R.drawable.img50),
    )

    val recyclerView = findViewById<RecyclerView>(R.id.imagesRecyclerView)
    recyclerView.layoutManager = GridLayoutManager(this, 3)
    recyclerView.setHasFixedSize(true)
    recyclerView.adapter = ImageAdapter(this, images)
        //Aqui preparei o RecyclerView, com seu dimensionamento, fixação do tamanho e conteúdo.
}
}