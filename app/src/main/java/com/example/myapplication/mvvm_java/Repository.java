package com.example.myapplication.mvvm_java;

import android.os.AsyncTask;

import androidx.lifecycle.MutableLiveData;

import java.io.IOException;

public class Repository {
    private static Repository instance;
    private String s;
    MutableLiveData<String> data;
    
    private Repository() {

    }

    public static Repository getInstance() {
        if (instance == null) {
            instance = new Repository();
        }
        return instance;
    }

    public void getCoronaCounts(AsyncResponse asyncResponse) {
        setCoronaCounts(asyncResponse);

    }

    public void setCoronaCounts(final AsyncResponse asyncResponseCorona) {
        new AsyncTask<Void, Void, Void>() {


            public AsyncResponse delegate = asyncResponseCorona;


            @Override
            protected Void doInBackground(Void... voids) {


                s = "This is the String";
                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);
                delegate.processFinish(s);
            }
        }.execute();


    }
}
