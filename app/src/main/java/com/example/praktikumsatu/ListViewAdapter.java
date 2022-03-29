package com.example.praktikumsatu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    //Deklarasi variabel dengan jenis data context
    Context mContext;

    //Deklarasi variabel dengan jenis data Layout Inflater
    LayoutInflater inflater;

    //Deklarasi variabel dengan jenis data arrayList
    private ArrayList<ClassNama> arrayList;

    //Membuat konstruktor Listviewadapter
    public ListViewAdapter(Context context){
        //Memberi nilai mContext dengan context
        mContext = context;

        //mengatur Layoutinflater dari context yang diberikan
        inflater = LayoutInflater.from(mContext);

        //Memberikan nilai arrayList dari class ClassNama
        this.arrayList = new ArrayList<ClassNama>();

        //Menambahkan semua elemen ke arraylist
        this.arrayList.addAll(activity_popup.classNamaArrayList);
    }
    public class ViewHolder{
        TextView name;
    }


    @Override
    public int getCount() {
        return activity_popup.classNamaArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return activity_popup.classNamaArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return (i);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final ViewHolder holder;

        if (view == null){
            holder = new ViewHolder();

            view = inflater.inflate(R.layout.item_listview, null);

            holder.name = (TextView) view.findViewById(R.id.tvnama_item);

            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }
        holder.name.setText(activity_popup.classNamaArrayList.get(i).getName());
        return view;
    }
}
