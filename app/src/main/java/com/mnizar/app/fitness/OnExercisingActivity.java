package com.mnizar.app.fitness;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OnExercisingActivity extends AppCompatActivity {

    @BindView(R.id.instructionImage)
    ImageView instructionImage;
    @BindView(R.id.floatingActionButton)
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_exercising);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.floatingActionButton)
    public void onBtnClicked(){
        Intent intent = new Intent(this, OnRepsActivity.class);
        startActivity(intent);
    }

}
