package com.example.glide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends AppCompatActivity {
    ImageView image1,image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1=findViewById(R.id.img1);
        image2=findViewById(R.id.img2);

        Glide.with(MainActivity.this)
                .load("https://i.imgur.com/XHDM6Cn.jpeg")
                .placeholder(R.drawable.progress_bar)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(image1);
        Glide.with(MainActivity.this)
                .load("https://i.makeagif.com/media/10-10-2015/fOsM55.gif")
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(image2);

    }
}