package com.tang.imageloaddemo;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;

import java.lang.annotation.Target;

public class MainActivity extends AppCompatActivity {

    private ImageView iv_02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_02 = (ImageView) findViewById(R.id.iv_02);
        String url = "http://guolin.tech/book.png";
/*
//        String url = "http://guolin.tech/test.gif";

        RequestOptions options = new RequestOptions()
                .override(com.bumptech.glide.request.target.Target.SIZE_ORIGINAL);
        GlideUtil.load(this, url, iv_02, options);
*/


        SimpleTarget<Drawable> simpleTarget = new SimpleTarget<Drawable>() {
            @Override
            public void onResourceReady(Drawable resource, Transition<? super Drawable> transition) {
                iv_02.setImageDrawable(resource);
            }
        };
        Glide.with(this)
                .load("http://guolin.tech/book.png")
                .preload();
        Glide.with(this).load(url).into(iv_02);
    }
}
