package com.tigerpenguin.lab.activitymemory;

import android.content.Intent;
import android.view.View;

public class ActivityA extends HeavyActivity {

    @Override
    protected int getImageId() {
        return R.drawable.a;
    }

    @Override
    public void onImageClick(View view) {
        startActivity(new Intent(this, ActivityB.class));
    }
}
