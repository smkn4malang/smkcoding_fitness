package com.mnizar.app.fitness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DifficultyActivity extends AppCompatActivity {

    @BindView(R.id.btnEasy)
    Button btnEasy;
    @BindView(R.id.btnMed)
    Button btnMed;
    @BindView(R.id.btnHard)
    Button btnHard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnEasy,R.id.btnMed,R.id.btnHard})
    public void onBtnClicked(){
        Intent intent = new Intent(this, OnExercisingActivity.class);
        startActivity(intent);
    }

}
