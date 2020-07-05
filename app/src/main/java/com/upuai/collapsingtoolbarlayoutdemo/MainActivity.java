package com.upuai.collapsingtoolbarlayoutdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class MainActivity extends AppCompatActivity {

    private Toolbar tbMain;
    private CollapsingToolbarLayout ctlMain;
    private ImageView ivFruit;
    private TextView tvFruit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 初始化
        init();
    }

    private void init() {
        // 初始化控件id
        tbMain = findViewById(R.id.tb_main);
        ctlMain = findViewById(R.id.ctl_main);
        ivFruit = findViewById(R.id.iv_fruit);
        tvFruit = findViewById(R.id.tv_fruit);
        // 设置ActionBar
        setSupportActionBar(tbMain);
        // 设置CollapsingToolBar
        ctlMain.setTitle("水果名称");
        // 设置ImageView
        ivFruit.setImageResource(R.drawable.ic_image);
        // 设置TextView
        String s = generateFruitContent();
        tvFruit.setText(s);
    }

    private String generateFruitContent() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 500; i++) {
            sb.append("水果名称");
        }
        return sb.toString();
    }
}