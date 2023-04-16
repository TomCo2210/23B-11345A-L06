package com.example.a23a_11345a_l06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.a23a_11345a_l06.Fragments.ListFragment;
import com.example.a23a_11345a_l06.Fragments.MapFragment;
import com.example.a23a_11345a_l06.Interfaces.CallBack_SendClick;

public class MainActivity extends AppCompatActivity {

    private ListFragment listFragment;
    private MapFragment mapFragment;

    CallBack_SendClick callBack_SendClick = new CallBack_SendClick() {
        @Override
        public void userNameChosen(String name) {
            showUserLocation(name);
        }
    };

    private void showUserLocation(String name) {
        mapFragment.zoomOnUser(name);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFragments();

        beginTransactions();
    }


    private void initFragments() {
        listFragment = new ListFragment();
        listFragment.setCallBack(callBack_SendClick);
        mapFragment = new MapFragment();
    }
    private void beginTransactions() {
        getSupportFragmentManager().beginTransaction().add(R.id.main_FRAME_list, listFragment).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.main_FRAME_map, mapFragment).commit();
    }
}