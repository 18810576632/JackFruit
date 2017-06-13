package com.example.asus.jackfruit.father_fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.asus.jackfruit.R;
import com.example.asus.jackfruit.adapter.MyListView;
import com.panxw.android.imageindicator.AutoPlayManager;
import com.panxw.android.imageindicator.ImageIndicatorView;

import java.util.ArrayList;

/**
 * Created by ASUS on 2017/6/12.
 */

public class FatherHomeFragment extends Fragment{
    private ImageIndicatorView indicate_view;
    private GridView lv;
    private MyListView myListView;
    private ArrayList<String> list=new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=View.inflate(getContext(), R.layout.hot_fragment,null);
        indicate_view = (ImageIndicatorView) view.findViewById(R.id.indicate_view);
        lv= (GridView)view.findViewById(R.id.lv);

        return view;



    }

}
