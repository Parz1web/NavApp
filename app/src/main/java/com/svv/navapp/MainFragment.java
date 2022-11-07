package com.svv.navapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.svv.navapp.databinding.FragmentMainBinding;


public class MainFragment extends Fragment {

    private FragmentMainBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(getLayoutInflater(), container, false);
        return binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.fragmentABtn.setOnClickListener(view1 -> {
            Navigation.findNavController(view1).navigate(R.id.action_mainFragment_to_fragmentA);
        });

        binding.fragmentBBtn.setOnClickListener(view1 -> {
            Navigation.findNavController(view1).navigate(R.id.action_mainFragment_to_fragmentB);
        });
    }
}