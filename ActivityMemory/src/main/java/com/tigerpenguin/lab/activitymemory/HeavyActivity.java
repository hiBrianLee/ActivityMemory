package com.tigerpenguin.lab.activitymemory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public abstract class HeavyActivity extends Activity {

    public abstract void onImageClick(View view);
    protected abstract int getImageId();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView pictureView = (ImageView) findViewById(R.id.pictureView);
        pictureView.setImageResource(getImageId());
    }
}
