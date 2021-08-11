package com.poly.demo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class SachSqlite extends SQLiteOpenHelper {

    public SachSqlite(Context context) {
        super(context, "ABC.db", null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table sach(id interger primary key,name text, price text)");
    }

    public void them(Sach sach) {
        // viet cau lenh truy van o day!!!!

    }

    public void xoa(String id) {

    }

    public void sua() {

    }

    public List<Sach> danhSach() {
        List<Sach> sachList = new ArrayList<>();
        return sachList;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
