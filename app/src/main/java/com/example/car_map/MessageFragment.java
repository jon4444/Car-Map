package com.example.car_map;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MessageFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<FragmentModel> fragmentHolder;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_message, container, false);
        recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        fragmentHolder = new ArrayList<>();
        FragmentModel obj1 = new FragmentModel(R.drawable.obj1, "Shop1", "Info");
        FragmentModel.add(obj1);
        FragmentModel obj2 = new FragmentModel(R.drawable.obj2, "Shop2", "Info");
        FragmentModel.add(obj2);
        FragmentModel obj3 = new FragmentModel(R.drawable.obj3, "Shop3", "Info");
        FragmentModel.add(obj3);
        FragmentModel obj4 = new FragmentModel(R.drawable.obj3, "Shop3", "Info");
        FragmentModel.add(obj4);
        FragmentModel obj5 = new FragmentModel(R.drawable.obj3, "Shop3", "Info");
        FragmentModel.add(obj5);
        FragmentModel obj6 = new FragmentModel(R.drawable.obj3, "Shop3", "Info");
        FragmentModel.add(obj6);
        FragmentModel obj7 = new FragmentModel(R.drawable.obj3, "Shop3", "Info");
        FragmentModel.add(obj7);

        recyclerView.setAdapter(new myadapter(fragmentHolder));
        return view;
    }
}
