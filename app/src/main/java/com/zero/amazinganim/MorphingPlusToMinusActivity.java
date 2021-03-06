package com.zero.amazinganim;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by linzewu on 17-2-28.
 */

public class MorphingPlusToMinusActivity extends AppCompatActivity {

    private ImageView mImageView;
    private boolean mIsChecked = false;
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morphing_plus_to_minus);

        mImageView = (ImageView) findViewById(R.id.imageview);
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mIsChecked = !mIsChecked;
                final int[] stateSet = {android.R.attr.state_checked * (mIsChecked ? 1 : -1)};
                mImageView.setImageState(stateSet, true);
            }
        });
    }
}
