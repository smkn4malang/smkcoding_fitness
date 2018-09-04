package com.mnizar.app.fitness;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SettingsActivity extends AppCompatActivity {

    @BindView(R.id.btnPengingat)
    Button btnPengingat;
    @BindView(R.id.btnAbout)
    Button btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnPengingat)
    public void onReminderClicked(){
        Intent intent = new Intent(this, ReminderActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btnAbout)
    public void onAboutClicked(){
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

}
