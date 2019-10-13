package com.project.androalertdialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.util.List;

public class AndroAlert extends Dialog {
    public Context context;
    public AlertDialog alertDialog;
    public AndroAlert(Context context) {
        super(context);
        this.context = context;
    }

    public void alertMessageSuccess(String message){
        ViewGroup viewGroup;
        //before inflating the custom alert dialog layout, we will get the current activity viewgroup
        viewGroup = findViewById(android.R.id.content);
        //then we will inflate the custom alert dialog layout that we created
        View dialogView = LayoutInflater.from(this.context).inflate(R.layout.android_alert_layout, viewGroup, false);
        TextView msg = dialogView.findViewById(R.id.alert_message);
        Button alert_ok = dialogView.findViewById(R.id.alert_ok);

        alert_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onSuccessOkClick();
            }
        });
        msg.setText(message);
        //Now we need an AlertDialog.Builder object
        AlertDialog.Builder builder = new AlertDialog.Builder(this.context);

        //setting the view of the builder to our custom view that we already inflated
        builder.setView(dialogView);


        alertDialog = builder.create();
        alertDialog.show();
    }

    public void onSuccessOkClick() {
        alertDialog.dismiss();
    }
    public void onErrorOkClick() {
        alertDialog.dismiss();
    }

    public void alertMessageError(String message){
        ViewGroup viewGroup;
        //before inflating the custom alert dialog layout, we will get the current activity viewgroup
        viewGroup = findViewById(android.R.id.content);

        //then we will inflate the custom alert dialog layout that we created
        View dialogView = LayoutInflater.from(this.context).inflate(R.layout.alert_error, viewGroup, false);
        TextView msg = dialogView.findViewById(R.id.alert_error_message);
        Button alert_error_but_ok = dialogView.findViewById(R.id.alert_error_but_ok);

        alert_error_but_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onErrorOkClick();
            }
        });
        msg.setText(message);

        AlertDialog.Builder builder = new AlertDialog.Builder(this.context);

        //setting the view of the builder to our custom view that we already inflated
        builder.setView(dialogView);

        //finally creating the alert dialog and displaying it
        alertDialog = builder.create();
        alertDialog.show();
    }
}