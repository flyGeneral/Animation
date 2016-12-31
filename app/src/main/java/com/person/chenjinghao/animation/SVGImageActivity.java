package com.person.chenjinghao.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;

public class SVGImageActivity extends AppCompatActivity {

    /**
     * 在Android 5.0以下的系统中，这是5.0以下系统兼容vectorDrawable遗留下来的坑
     * 在ImageView,ImageButton这种带状态的控件中通过selector中使用vectorDrawable
     * 打开开关，布局文件才可以使用vectorDrawable，实际测试中小米4C没有此问题***
     */
    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_svgimage);
    }
}
