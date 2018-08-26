package com.mnizarzr.fitnessapp.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ExerciseFragment extends android.support.v4.app.Fragment{

    @BindView(R.id.img1)
    android.support.v7.widget.CardView img1;
    @BindView(R.id.img2)
    android.support.v7.widget.CardView img2;
    @BindView(R.id.img3)
    android.support.v7.widget.CardView img3;
    @BindView(R.id.img4)
    android.support.v7.widget.CardView img4;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_exercise, container, false);
        ButterKnife.bind(this,v);
        return v;
    }

    @OnClick({R.id.img1,R.id.img2,R.id.img3,R.id.img4,})
    public void onImageClicked(){
        Intent intent = new Intent(getActivity(), DifficultActivity.class);
        startActivity(intent);
    }

}

