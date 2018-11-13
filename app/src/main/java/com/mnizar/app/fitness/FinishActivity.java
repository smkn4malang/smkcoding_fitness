package com.mnizar.app.fitness;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FinishActivity extends AppCompatActivity {

    @BindView(R.id.finish)
    Button btnFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.finish)
    public void onBtnClicked(){
        Intent intent = new Intent(this, DifficultyActivity.class);
        startActivity(intent);
    }

}
