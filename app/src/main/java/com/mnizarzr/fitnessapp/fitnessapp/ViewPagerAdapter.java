package com.mnizarzr.fitnessapp.fitnessapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter{

    public ViewPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position){
        if(position == 0){
            return new ExerciseFragment();
        }
        else if(position == 1){
            return new BmiFragment();
        }
        else if(position == 2){
            return new InstructionFragment();
        }
        throw new IllegalStateException("Position not valid");
    }

    @Override
    public int getCount(){
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position){
        if(position == 0 || position %5 == 0){
            return "Exercises";
        }
        else if(position %5 == 1){
            return "Body Mass Index";
        }
        else if(position %5 == 2){
            return "Instructions";
        }
        throw new IllegalStateException("Position not valid");
    }

}

