package com.person.chenjinghao.animation;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.ImageView;

public class SVGImageActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 在Android 5.0以下的系统中，这是5.0以下系统兼容vectorDrawable遗留下来的坑
     * 在ImageView,ImageButton这种带状态的控件中通过selector中使用vectorDrawable
     * 打开开关，布局文件才可以使用vectorDrawable，实际测试中小米4C没有此问题***
     */
    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    private ImageView ivLeftRightArrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_svgimage);

        initWidght();
        initEvents();
    }

    private void initEvents() {
        ivLeftRightArrow.setOnClickListener(this);
    }

    private void initWidght() {
        ivLeftRightArrow = (ImageView) findViewById(R.id.iv_left_right_arrow);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_left_right_arrow:
                Drawable drawable = ivLeftRightArrow.getDrawable();
                if (drawable instanceof Animatable){
                    ((Animatable)drawable).start();
                }
                break;
        }
    }
}
