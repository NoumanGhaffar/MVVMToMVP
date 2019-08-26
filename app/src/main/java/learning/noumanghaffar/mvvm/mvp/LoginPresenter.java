package learning.noumanghaffar.mvvm.mvp;

import android.os.CountDownTimer;

import learning.noumanghaffar.mvvm.User;

public class LoginPresenter  {

    LoginContract.View view;

    public LoginPresenter(LoginContract.View view) {
        this.view = view;
    }
    // This method loads User data. To avoid complicated code we are simply creating a Dummy User and
    //returning it back to the activity.

    public void loadUserData() {
        User dummyUser = new User("Nouman", 16, "Ghaffar",
                "Student", "1000", "Lahore", "Pakistan",
                "1$");
        view.updateUserDataOnUi(dummyUser);
        // This timer will update the user object and return it back to the class .
        // It's off 5 seconds. We need it.
        new CountDownTimer(5000, 1000) {

            public void onTick(long millisUntilFinished) {

            }

            public void onFinish() {
                view.updateUserDataOnUi(null);
            }

        }.start();
    }
}
