package com.dsi32g14.khzenty;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;

public class ExempleDialog extends AppCompatDialogFragment
//class d'alert de dialog
    {
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        //alert de dialog
        builder.setTitle("Information").setMessage("Consulter Votre E-Mail ! ").setPositiveButton("Ok ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {

            }
        });

        return builder.create();
    }
    }

