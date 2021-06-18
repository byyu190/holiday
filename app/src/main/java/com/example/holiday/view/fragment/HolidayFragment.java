package com.example.holiday.view.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.holiday.R;
import com.example.holiday.adapter.HolidayDiscoverAdapter;
import com.example.holiday.model.holiday.HolidaysDiscoverItem;
import com.example.holiday.view.viewmodel.HolidayViewModel;

import java.util.ArrayList;


public class HolidayFragment extends Fragment {

    private HolidayDiscoverAdapter holidayDiscoverAdapter;
    private RecyclerView rvHolidayDiscover;
    private HolidayViewModel holidayViewModel;


    public HolidayFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_holiday, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        holidayDiscoverAdapter = new HolidayDiscoverAdapter(getContext());
        holidayDiscoverAdapter.notifyDataSetChanged();

        rvHolidayDiscover = view.findViewById(R.id.fragmentholiday_rv);
        rvHolidayDiscover.setLayoutManager(new GridLayoutManager(getContext(),1));

        holidayViewModel = new ViewModelProvider(this).get(HolidayViewModel.class);
        holidayViewModel.setHolidayDiscover();
        holidayViewModel.getHolidayDiscover().observe(this, getHolidayDiscover);

        rvHolidayDiscover.setAdapter(holidayDiscoverAdapter);
    }

    private Observer<ArrayList<HolidaysDiscoverItem>> getHolidayDiscover = new Observer<ArrayList<HolidaysDiscoverItem>>() {
        @Override
        public void onChanged(ArrayList<HolidaysDiscoverItem> holidaysDiscoverItems) {
            if(holidaysDiscoverItems != null){
                holidayDiscoverAdapter.setData(holidaysDiscoverItems);
            }
        }
    };
}