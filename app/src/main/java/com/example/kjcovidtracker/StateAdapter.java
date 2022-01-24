package com.example.kjcovidtracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kjcovidtracker.databinding.TestingBinding;

import java.util.ArrayList;

public class StateAdapter extends RecyclerView.Adapter<StateAdapter.ViewHolder>{

    Context context;
    ArrayList<StateModel> stateModels;

    public StateAdapter(Context context, ArrayList<StateModel> stateModels) {
        this.context = context;
        this.stateModels = stateModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.testing,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        StateModel model = stateModels.get(position);
        holder.binding.tvCity.setText(model.getStateName());
        holder.binding.tvActiveNo.setText(model.getActive());
        holder.binding.tvTodayCaseNo.setText(model.getConfirmed());
        holder.binding.tvDeathNo.setText(model.getDeath());
        holder.binding.tvRecoveredNo.setText(model.getRecovered());


    }

    @Override
    public int getItemCount() {
        return stateModels.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        TestingBinding binding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = TestingBinding.bind(itemView);
        }
    }
}
