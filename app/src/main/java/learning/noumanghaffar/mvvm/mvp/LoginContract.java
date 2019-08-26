package learning.noumanghaffar.mvvm.mvp;

import learning.noumanghaffar.mvvm.User;

public class LoginContract {

    public interface View {

        void updateUserDataOnUi(User user);

    }
}
