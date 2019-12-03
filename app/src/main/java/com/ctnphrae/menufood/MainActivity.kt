package com.ctnphrae.menufood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    var recyclerView : RecyclerView? = null

    var foods = arrayOf(
        "Logitech",
        "Corsair",
        "Asus",
        "Razer",
        "HP",
        "HYPER X",
        "Neolution",
        "Legion",
        "Steelseries",
        "MSI",
        "Anitech",
        "Rapoo",
        "Mionix",
        "Nubwo",
        "Acer",
        "Genius",
        "Micropack",
        "THERMALTAKE",
        "FANTECH",
        "ZOWIE"
    )
    var arrImg = arrayOf(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4,
        R.drawable.image5,
        R.drawable.image6,
        R.drawable.image7,
        R.drawable.image8,
        R.drawable.image9,
        R.drawable.image10,
        R.drawable.image11,
        R.drawable.image12
    )
    var foodMenuImage= arrayOf(
        "https://res.cloudinary.com/cenergy-innovation-limited-head-office/image/fetch/c_scale,q_70,f_auto,h_740/https://d1dtruvuor2iuy.cloudfront.net/media/catalog/product/p/w/pwb000245585.jpg",
        "https://www.tohome.com/images/imageproduct/500/30052019/CORSAIR-MOUSE%20IRONCLAW-RGB-6.jpg",
        "https://www.tohome.com/images/imageproduct/500/16102019/Asus-P303-ROG-1.jpg",
        "https://www.tohome.com/images/imageproduct/500/14112019/RazerViperUltimate-1.jpg",
        "https://www.tohome.com/images/imageproduct/500/24062019/hp-m100-1.jpg",
        "https://www.tohome.com/images/imageproduct/500/10062019/Kingston-HX-MC003B-1.jpg",
        "https://www.tohome.com/images/imageproduct/500/25012019/NeolutionAstro.jpg",
        "https://www.tohome.com/images/imageproduct/500/02082018/LenovoLegionM200RGB-1.jpg",
        "https://www.tohome.com/images/imageproduct/500/03012018/STSRSensei310RGB-1.jpg",
        "https://www.tohome.com/images/imageproduct/500/20122016/MSI-Ds100-1.jpg",
        "https://www.tohome.com/images/imageproduct/500/22012018/AnitechZX920-11.jpg",
        "https://www.tohome.com/images/imageproduct/500/09092016/RapooV20-whi.jpg",
        "https://www.tohome.com/images/imageproduct/500/16122016/Mionix-Naos-3200-2.jpg",
        "https://www.tohome.com/images/imageproduct/500/01022017/Nubwo-NM-009-blk.jpg",
        "https://static.acer.com/up/Resource/Acer/Accessories/Predator/Predator%20Gaming%20Mouse%20/Images/20151203/Predator-Gaming-Mouse_sku-main.png",
        "https://res.cloudinary.com/cenergy-innovation-limited-head-office/image/fetch/c_scale,q_70,f_auto,h_740/https://d1dtruvuor2iuy.cloudfront.net/media/catalog/product/p/w/pwb000236230.jpg",
        "https://res.cloudinary.com/cenergy-innovation-limited-head-office/image/fetch/c_scale,q_70,f_auto,h_740/https://d1dtruvuor2iuy.cloudfront.net/media/catalog/product/p/w/pwb000233095.jpg",
        "https://www.jib.co.th/img_master/product/original/2019102209110135568_1.jpg",
        "https://www.jib.co.th/img_master/product/original/2019111513360035748_1.png",
        "https://www.jib.co.th/img_master/product/original/2019102208510235567_1.png"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycleView) as RecyclerView

        recyclerView!!.layoutManager = LinearLayoutManager(this)
        recyclerView!!.setLayoutManager(GridLayoutManager(this, 2))
        val myAdapter = AdapterRecycleView(foods,foodMenuImage,this)
        recyclerView!!.setAdapter(myAdapter)

    }
}
