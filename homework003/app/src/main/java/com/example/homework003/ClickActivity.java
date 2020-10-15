package com.example.homework003;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ClickActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click);
        //从布局文件中获取叫btn_click的按钮控件
        Button btn_click =findViewById(R.id.btn_click);
        //给btn_click设置监听器，一旦用户点击按钮，就触发监听器onClick方法
        btn_click.setOnClickListener((View.OnClickListener) new MyOnClickListener());
        //给btn_click设置长按监听器，一旦用户长按监听器，就触发监听器的OnLOngclick方法
        btn_click.setOnLongClickListener(new MyLongClickListener());
    }
    //定义一个点击监听器，它实现了接口View。OnclickListener
    class MyOnClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {//点击事件处理方法
            if(v.getId()==R.id.btn_click){
                Toast.makeText(ClickActivity.this,"您点击了控件："+((TextView)v).getText(),Toast.LENGTH_SHORT).show();
            }
        }
    }
    //定义了一个长按监听器，它实现了接口View.OnlongClickListener
    class MyLongClickListener implements View.OnLongClickListener{

        @Override
        public boolean onLongClick(View v) {//长按事件处理方法
            if(v.getId()==R.id.btn_click){
                Toast.makeText(ClickActivity.this,"你长按了控件"+((TextView)v).getText(),Toast.LENGTH_SHORT).show();
            }
            return true;
        }
    }
}