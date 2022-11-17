package com.example.recyleviewtp;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class WordListAdapter extends
       RecyclerView.Adapter<WordListAdapter.WordViewHolder>  {
    @NonNull
    @Override
    public WordListAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        class WordViewHolder extends RecyclerView.ViewHolder {
            public WordViewHolder(View itemView, WordListAdapter adapter) {
            super(itemView);
            wordItemView = itemView.findViewById(R.id.word);
            this.mAdapter = adapter;
        }
        }
        return null;

    }

    @Override
    public void onBindViewHolder(@NonNull WordListAdapter.WordViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
}
