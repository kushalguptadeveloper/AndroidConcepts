package com.example.kushalgupta.androidconcepts.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kushalgupta.androidconcepts.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Intent extends Fragment {


    public Intent() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_intent, container, false);


        TextView defi=view.findViewById(R.id.def);
        defi.setText("Intent is used for communicating between different components \n there are two different types of intents \n 1. Explicit Intent \n 2.Implicit Intent\n"+"\n"+
                "Explicit intent- used for communicating between activities in same application\n Implicit intent- used to communicate between different application"
        );

        return view;
    }

}
