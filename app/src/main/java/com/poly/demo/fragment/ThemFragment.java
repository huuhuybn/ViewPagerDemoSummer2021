package com.poly.demo.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.poly.demo.R;
import com.poly.demo.Sach;
import com.poly.demo.SachSqlite;


public class ThemFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_them, container, false);
    }

    private TextView textView;
    private EditText editTextTextPersonName;
    private EditText editTextTextPersonName2;
    private EditText editTextTextPersonName3;
    private Button button;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        textView = view.findViewById(R.id.textView);
        editTextTextPersonName = view.findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2 = view.findViewById(R.id.editTextTextPersonName2);
        editTextTextPersonName3 = view.findViewById(R.id.editTextTextPersonName3);
        button = view.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = editTextTextPersonName.getText().toString();
                String name = editTextTextPersonName2.getText().toString();
                String price = editTextTextPersonName3.getText().toString();
                Sach sach = new Sach(id,name,price);
                SachSqlite sachSqlite = new SachSqlite(getActivity());
                sachSqlite.them(sach);
            }
        });


    }
}