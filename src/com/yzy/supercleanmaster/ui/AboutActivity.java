package com.yzy.supercleanmaster.ui;

import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

import com.yzy.supercleanmaster.R;
import com.yzy.supercleanmaster.base.BaseSwipeBackActivity;
import com.yzy.supercleanmaster.utils.AppUtil;



public class AboutActivity extends BaseSwipeBackActivity {


    TextView subVersion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setTitle("关于");
        TextView tv = (TextView) findViewById(R.id.app_information);
        Linkify.addLinks(tv, Linkify.ALL);
        subVersion=(TextView) findViewById(R.id.subVersion);
        subVersion.setText("V"+ AppUtil.getVersion(mContext));

    }

}
