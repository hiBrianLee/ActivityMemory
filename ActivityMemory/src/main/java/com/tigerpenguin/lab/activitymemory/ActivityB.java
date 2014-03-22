package com.tigerpenguin.lab.activitymemory;

import android.content.Intent;
import android.view.View;

public class ActivityB extends HeavyActivity {

    @Override
    protected int getImageId() {
        return R.drawable.b;
    }

    @Override
    public void onImageClick(View view) {
        startActivity(new Intent(this, ActivityC.class));
    }
}
