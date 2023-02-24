package com.example.tablayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerMessengerAdapter extends FragmentStateAdapter {

    private String[] titles= new String[]{"CAMPS","SCHEMES","ABOUT_US","REQUESTS"};
    public ViewPagerMessengerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new CampsFragment();
            case 1:
                return new SchemesFragment();
            case 2:
                return new AboutFragment();
            case 3:
                return new RequestFragments();
        }
        return new SchemesFragment();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
