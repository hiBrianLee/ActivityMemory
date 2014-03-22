package com.tigerpenguin.lab.activitymemory;

import android.content.Intent;
import android.view.View;

public class ActivityC extends HeavyActivity {

    @Override
    protected int getImageId() {
        return R.drawable.c;
    }

    @Override
    public void onImageClick(View view) {
        startActivity(new Intent(this, ActivityD.class));
    }
}
