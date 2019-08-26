package learning.noumanghaffar.mvvm.mvvm;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.os.CountDownTimer;


import learning.noumanghaffar.mvvm.User;

public class LoginViewModel extends ViewModel {
    private MutableLiveData<User> users;

    public MutableLiveData<User> getUserData() {
        if (users == null) {
            users = new MutableLiveData<User>();
            loadUsers();
        }
        return users;
    }


    public User getUsers() {
        return users.getValue();
    }

    private void loadUsers() {
        User dummyUser = new User("Nouman", 16, "Ghaffar",
                "Student", "1000", "Lahore", "Pakistan",
                "1$");
        users.postValue(dummyUser);
        new CountDownTimer(5000, 1000) {

            public void onTick(long millisUntilFinished) {

            }

            public void onFinish() {
                users.postValue(null);
            }

        }.start();
    }

}