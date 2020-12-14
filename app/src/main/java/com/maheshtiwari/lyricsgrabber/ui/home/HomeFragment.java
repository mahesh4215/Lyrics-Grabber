package com.maheshtiwari.lyricsgrabber.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.maheshtiwari.lyricsgrabber.MainActivity;
import com.maheshtiwari.lyricsgrabber.R;

public class HomeFragment extends Fragment {

    SearchView searchView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        searchView = root.findViewById(R.id.search_view);
        root.findViewById(R.id.search_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity().getApplicationContext(), MainActivity.class);
                Toast.makeText(getActivity().getApplicationContext(),"msg:"+searchView.getQuery().toString(),Toast.LENGTH_SHORT).show();
                i.putExtra("song_name",searchView.getQuery().toString());
                startActivity(i);
             }
        });
        return root;
    }
}