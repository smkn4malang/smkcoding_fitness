package com.mnizar.app.fitness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class WeekActivity extends AppCompatActivity {

    @BindView(R.id.btnGo)
    Button btnGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnGo)
    public void onBtnClicked(){
        Intent intent = new Intent(this, OnExercisingActivity.class);
        startActivity(intent);
    }

}
