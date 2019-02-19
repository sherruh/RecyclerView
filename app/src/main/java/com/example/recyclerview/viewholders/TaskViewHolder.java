package com.example.recyclerview.viewholders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.recyclerview.R;

public class TaskViewHolder extends RecyclerView.ViewHolder {

    private TextView title;

    public TaskViewHolder(@NonNull View itemView) {
        super(itemView);
        title=itemView.findViewById(R.id.vh_task_Title);
    }

    public void onBind(String strTitle){
        title.setText(strTitle);
    }
}
