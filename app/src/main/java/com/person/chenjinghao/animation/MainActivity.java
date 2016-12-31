package com.person.chenjinghao.animation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnOpenSvgImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidget();
        initClickListener();
    }

    private void initClickListener() {
        mBtnOpenSvgImage.setOnClickListener(this);
    }

    private void initWidget() {
        mBtnOpenSvgImage = (Button) findViewById(R.id.btn_open_svg_image);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_open_svg_image:
                startActivity(new Intent(this, SVGImageActivity.class));
                break;
        }
    }
}
