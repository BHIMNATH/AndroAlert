package com.project.androalertdialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AndroAlert extends Dialog {
    Context context;
    public AndroAlert(Context context) {
        super(context);
        this.context = context;
    }

    protected AndroAlert(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    protected AndroAlert(Context context, int themeResId) {
        super(context, themeResId);
    }

    public void alertMessageSuccess(String message){
        ViewGroup viewGroup;
        //before inflating the custom alert dialog layout, we will get the current activity viewgroup
        viewGroup = findViewById(android.R.id.content);

        //then we will inflate the custom alert dialog layout that we created
        View dialogView = LayoutInflater.from(this.context).inflate(R.layout.android_alert_layout, viewGroup, false);
        TextView msg = dialogView.findViewById(R.id.alert_message);

        msg.setText(message);
        //Now we need an AlertDialog.Builder object
        AlertDialog.Builder builder = new AlertDialog.Builder(this.context);

        //setting the view of the builder to our custom view that we already inflated
        builder.setView(dialogView);


        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
    public void alertMessageError(String message){
        ViewGroup viewGroup;
        //before inflating the custom alert dialog layout, we will get the current activity viewgroup
        viewGroup = findViewById(android.R.id.content);

        //then we will inflate the custom alert dialog layout that we created
        View dialogView = LayoutInflater.from(this.context).inflate(R.layout.alert_error, viewGroup, false);
        TextView msg = dialogView.findViewById(R.id.alert_error_message);

        msg.setText(message);

        AlertDialog.Builder builder = new AlertDialog.Builder(this.context);

        //setting the view of the builder to our custom view that we already inflated
        builder.setView(dialogView);

        //finally creating the alert dialog and displaying it
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }


}