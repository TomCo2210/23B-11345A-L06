package com.example.a23a_11345a_l06.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.a23a_11345a_l06.R;

public class MapFragment extends Fragment {
    private TextView map_LBL_title;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_map, container, false);
        findViews(view);
        return view;
    }

    private void findViews(View view) {
        map_LBL_title = view.findViewById(R.id.map_LBL_title);
    }

    public void zoomOnUser(String name) {
        map_LBL_title.setText(name);
    }
}