package com.project.androalert;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;

public class AndroAlert extends Dialog {
    String message;
    private static int SIMPLE_ALERT = 1;
    protected AndroAlert(Context context) {
        super(context);
    }

    protected AndroAlert(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    protected AndroAlert(Context context, int themeResId) {
        super(context, themeResId);
    }

    public static void alertMessage(Context context, String message,int alertType){
        ViewGroup viewGroup;
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_alert_layout);
    }
}