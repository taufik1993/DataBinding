package com.iffcokisan.databinding;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.iffcokisan.databinding.models.Users;

public class MyClickHandlers {
    Context context;

    public MyClickHandlers(Context context) {
        this.context = context;
    }

    public void onFabClicked(View view) {
        Toast.makeText(context, "FAB clicked!", Toast.LENGTH_SHORT).show();
    }

    public void onButtonClick(View view) {
        Toast.makeText(context, "Button clicked!", Toast.LENGTH_SHORT).show();
    }

    public void onButtonClickWithParam(View view, Users user) {
        Toast.makeText(context, "Button clicked! Name: " + user.name, Toast.LENGTH_SHORT).show();
    }

    public boolean onButtonLongPressed(View view) {
        Toast.makeText(context, "Button long pressed!", Toast.LENGTH_SHORT).show();
        return false;
    }
}
