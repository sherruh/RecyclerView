package com.example.recyclerview.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import com.example.recyclerview.R;
import com.example.recyclerview.models.Task;

import java.io.Serializable;

public class Activity2 extends AppCompatActivity {
    EditText etTaskTitle;
    EditText etTaskDesc;
    EditText etTaskImage;

    String sTaskTitle;
    String sTaskDesc;
    String sTaskImage;

    public static final String TASK_KEY="task";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        etTaskTitle=findViewById(R.id.task_title_edit_text);
        etTaskDesc=findViewById(R.id.task_description_edit_text);
        etTaskImage=findViewById(R.id.task_image_edit_text);

        etTaskTitle.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                sTaskTitle=etTaskTitle.getText().toString();
            }
        });

        etTaskDesc.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                sTaskDesc=etTaskDesc.getText().toString();
            }
        });

        etTaskImage.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                sTaskImage=etTaskImage.getText().toString();
            }
        });
    }

    void onCreateTask(View v){
        Task task=new Task(sTaskTitle,sTaskDesc,sTaskImage);
        Intent intent=new Intent();
        intent.putExtra(TASK_KEY, (Serializable) task);
        setResult(RESULT_OK,intent);
        finish();
    }
}
