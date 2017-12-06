package com.wordpress.nikant20.milkdiary.View;

import android.app.Activity;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by nikant20 on 11/7/2017.
 */

public class LogoutActivity extends Activity{

    public void user_logout(){
        FirebaseAuth.getInstance().signOut();
        finish();
    }

}
