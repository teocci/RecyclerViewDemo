package com.github.teocci.recyclerviewdemo.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.teocci.recyclerviewdemo.R;
import com.github.teocci.recyclerviewdemo.adapter.RecyclerViewAdapter;

/**
 * Created by teocci.
 *
 * @author teocci@yandex.com on 2017/Mar/13
 */

public class BlankFragment extends Fragment
{
    public BlankFragment()
    {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_blank, container, false);

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.rv_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(new String[]{
                "test one",
                "test two",
                "test three",
                "test four",
                "test five",
                "test six",
                "test seven",
                "test eight",
                "test nine",
                "test ten",
                "test eleven",
                "test twelve"
        });
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);

        return rootView;
    }
}