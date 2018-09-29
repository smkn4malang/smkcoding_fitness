package com.mnizar.app.fitness;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OnRepsActivity extends AppCompatActivity {

    @BindView(R.id.instructionImage)
    ImageView instructionImage;
    @BindView(R.id.floatingActionButton)
    FloatingActionButton fab;
    @BindView(R.id.jenis)
    TextView jeniss;
    @BindView(R.id.instruksi)
    TextView instruksi;
    @BindView(R.id.view_flipper)
    ViewFlipper mViewFlipper;

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_reps);
        ButterKnife.bind(this);

        getImage();

        mViewFlipper.setAutoStart(true);
        mViewFlipper.setFlipInterval(1000);
        mViewFlipper.startFlipping();
    }

    public void getImage() {
        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();


        databaseAccess.close();
    }

    @OnClick(R.id.floatingActionButton)
    public void onBtnClicked() {
        Intent intent = new Intent(this, FinishActivity.class);
        startActivity(intent);
        finish();
    }

}
