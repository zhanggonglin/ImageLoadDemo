package com.tang.imageloaddemo;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

/**
 * Created by admin on 2018/11/10.
 */

public class GlideUtil {

    public static void load(Context context, String url, ImageView imageView, RequestOptions options) {
        if (options != null) {
            Glide.with(context).load(url).apply(options).into(imageView);
        } else {
            RequestOptions requestOptions = new RequestOptions().placeholder(R.mipmap.ic_launcher).diskCacheStrategy(DiskCacheStrategy.NONE).error(R.mipmap.ic_launcher);
            Glide.with(context).asBitmap().load(url).apply(requestOptions).into(imageView);
        }

    }
}
