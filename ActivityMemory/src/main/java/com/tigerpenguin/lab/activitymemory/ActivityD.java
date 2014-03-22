package com.tigerpenguin.lab.activitymemory;

import android.content.Intent;
import android.view.View;

public class ActivityD extends HeavyActivity {

    @Override
    protected int getImageId() {
        return R.drawable.d;
    }

    @Override
    public void onImageClick(View view) {
        startActivity(new Intent(this, ActivityE.class));
    }
}
