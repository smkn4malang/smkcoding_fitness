package com.mnizarzr.fitnessapp.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DifficultActivity extends AppCompatActivity {


    @BindView(R.id.txtEasy)
    TextView txtEasy;
    @BindView(R.id.txtMedium)
    TextView txtMedium;
    @BindView(R.id.txtHard)
    TextView txtHard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficult);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.txtEasy, R.id.txtMedium, R.id.txtHard})
    public void easyClicked(){
        Intent intent = new Intent(this, ExerciseActivity.class);
        startActivity(intent);
    }

}
