package com.example.android.mindorksinternship;

public interface MvpPresenter <V extends MvpView>  {

    void onAttach(V mvpView);
}
