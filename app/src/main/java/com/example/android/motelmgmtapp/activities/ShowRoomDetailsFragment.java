package com.example.android.motelmgmtapp.activities;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.motelmgmtapp.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class ShowRoomDetailsFragment extends Fragment {

    public ShowRoomDetailsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_show_room_details, container, false);
    }
}
