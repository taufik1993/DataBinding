package com.iffcokisan.databinding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.databinding.DataBindingUtil;

import com.iffcokisan.databinding.databinding.ActivitySimpleDataBindingBinding;
import com.iffcokisan.databinding.models.Users;

public class SimpleDataBindingActivity extends AppCompatActivity {

    Users user;

    MyClickHandlers myClickHandlers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivitySimpleDataBindingBinding bindingBinding=DataBindingUtil.setContentView(this, R.layout.activity_simple_data_binding);

        user = new Users();
        user.setName("Ravi Tamada");
        user.setNumber("ravi@androidhive.info");

        bindingBinding.setUser(user);
        myClickHandlers=new MyClickHandlers(this);
        bindingBinding.setMyclickhandler(myClickHandlers);
    }
}
