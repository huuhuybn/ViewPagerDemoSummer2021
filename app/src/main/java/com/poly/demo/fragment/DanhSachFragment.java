package com.poly.demo.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.poly.demo.R;
import com.poly.demo.Sach;
import com.poly.demo.SachSqlite;

import java.util.ArrayList;
import java.util.List;


public class DanhSachFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_danh_sach, container, false);
    }

    private ListView lvList;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lvList = view.findViewById(R.id.list);
        List<Sach> sachList = new SachSqlite(getActivity()).danhSach();

        sachList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            sachList.add(new Sach(i +"","demi","5555"));
        }
        SachAdapter sachAdapter = new SachAdapter(sachList);

        lvList.setAdapter(sachAdapter);
    }

    class SachAdapter extends BaseAdapter {

        private List<Sach> sachList;

        public SachAdapter(List<Sach> sachList) {
            this.sachList = sachList;
        }

        @Override
        public int getCount() {
            return sachList.size();
        }

        @Override
        public Sach getItem(int position) {
            return sachList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sach, parent, false);


            TextView tvContent = view.findViewById(R.id.tvContent);
            Button xoa = view.findViewById(R.id.xoa);
            Button sua = view.findViewById(R.id.sua);
            Sach sach = getItem(position);

            tvContent.setText(sach.id + " - " + sach.name + " - " + sach.price);

            xoa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // xoa
                    SachSqlite sachSqlite = new SachSqlite(parent.getContext());
                    sachSqlite.xoa(sach.id);
                }
            });

            sua.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    SachSqlite sachSqlite = new SachSqlite(parent.getContext());
                    sachSqlite.xoa(sach.id);
                }
            });

            return view;
        }
    }
}