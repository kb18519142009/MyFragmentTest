package com.example.kangbai.myfragmenttest01;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by kangbai on 2017/7/25.
 * 滴水穿石，铁杵成针
 */
public class LoadingFragment extends DialogFragment{
    private Context context;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        context = getActivity();
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.fragment_loading,null);
        builder.setView(view);
        return builder.create();
    }
}
