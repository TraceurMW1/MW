package com.traceurmw.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by TraceurMW on 2016/7/28.
 */
public class CrimeListActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
