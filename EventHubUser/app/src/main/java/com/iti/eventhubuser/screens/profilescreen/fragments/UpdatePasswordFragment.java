package com.iti.eventhubuser.screens.profilescreen.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.iti.eventhubuser.R;


public class UpdatePasswordFragment extends Fragment {


    public UpdatePasswordFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_update_password, container, false);
    }

}
