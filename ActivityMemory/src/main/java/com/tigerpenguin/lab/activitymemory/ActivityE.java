package com.tigerpenguin.lab.activitymemory;

import android.content.Intent;
import android.view.View;

public class ActivityE extends HeavyActivity {

    @Override
    protected int getImageId() {
        return R.drawable.e;
    }

    @Override
    public void onImageClick(View view) {
        startActivity(new Intent(this, ActivityF.class));
    }

}
