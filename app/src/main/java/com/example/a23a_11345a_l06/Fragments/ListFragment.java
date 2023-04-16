package com.example.a23a_11345a_l06.Fragments;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.a23a_11345a_l06.Interfaces.CallBack_SendClick;
import com.example.a23a_11345a_l06.R;
import com.google.android.material.button.MaterialButton;

public class ListFragment extends Fragment {

    private AppCompatEditText list_ET_name;
    private MaterialButton list_BTN_send;

    private CallBack_SendClick callBack_SendClick;

    public void setCallBack(CallBack_SendClick callBack_SendClick) {
        this.callBack_SendClick = callBack_SendClick;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        findViews(view);
        list_BTN_send.setOnClickListener(v -> {
            sendClicked();
        });
        return view;
    }

    private void sendClicked() {
        if(callBack_SendClick != null){
            callBack_SendClick.userNameChosen(list_ET_name.getText().toString());
        }
    }

    private void findViews(View view) {
        list_ET_name = view.findViewById(R.id.list_ET_name);
        list_BTN_send = view.findViewById(R.id.list_BTN_send);
    }
}