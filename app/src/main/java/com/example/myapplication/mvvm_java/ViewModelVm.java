package com.example.myapplication.mvvm_java;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewModelVm extends ViewModel implements AsyncResponse{
    private static MutableLiveData<String> coronaCountsMutableLiveData = new MutableLiveData<>();  ;
    private Repository repository ;


    public LiveData<String> getCoronaCounts(){
        return coronaCountsMutableLiveData;
    }

    public void init(){



        repository = repository.getInstance();


        repository.getCoronaCounts(this);

    }


    @Override
    public void processFinish(String string) {
        coronaCountsMutableLiveData.setValue(string);
    }


}