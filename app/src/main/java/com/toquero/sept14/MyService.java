package com.toquero.sept14;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.NonNull;

public class MyService extends IntentService {

    public MyService(String name) {
        super (name);
    }

    @Override
    protected void onHandleIntent(Intent intent){
        for(int i=0;i<10;i++)
        {
            Log.d("MyService", "Hello" + (i+1));
        }
    }
}
