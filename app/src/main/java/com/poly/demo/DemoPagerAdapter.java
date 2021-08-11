package com.poly.demo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.poly.demo.fragment.DanhSachFragment;
import com.poly.demo.fragment.ThemFragment;

public class DemoPagerAdapter extends FragmentPagerAdapter {


    public DemoPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Them Sach";
            case 1:
                return "Danh Sach Sach";
        }
        return super.getPageTitle(position);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ThemFragment();
            case 1:
                return new DanhSachFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
