package com.tigerpenguin.lab.activitymemory;

import android.content.Intent;
import android.view.View;

public class ActivityF extends HeavyActivity {

    @Override
    protected int getImageId() {
        return R.drawable.f;
    }

    @Override
    public void onImageClick(View view) {
        startActivity(new Intent(this, ActivityG.class));
    }
}
