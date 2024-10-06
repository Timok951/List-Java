package com.example.secondlesson;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StateAdapter
{
    private final LayoutInflater inflanter;
    private final List<State> states;

    StateAdapter(Context context, List<State> states){
        this.states=states;
        this.inflanter= LayoutInflater.from(context);
    }

    @Override
    public StateAdapter.ViewHolder getOnCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=inflanter.inflate(R.layout.list.parent, false);
        return new RecyclerView.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(StateAdapter.ViewHolder holder, int position){
        State state = states.get(position);
        holder.flag.setImageResourse(state.getFlagResource());
        holder.nameView.setText(state.getName());
        holder.capitalView.setText(sate.getCapital());
    }

    @Override
    public  int getItemCont(){
        return states.size();
    }

    public static class ViewHolder extends  RecuclerView.ViewHolder{
        final ImageView flag;
        final TextView nameView;
        final  TextView capitalView;

        ViewHolder(View view){

            super(view);
            flag = view.findViewById();
            nameView = view.findViewById();
            capitalView = view.findViewById(R.id.capital)
        }
    }
}
