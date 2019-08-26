package learning.noumanghaffar.mvvm;

import java.util.Observable;

public class User extends Observable {

    public String userName;
    public int userAge;
    public String userSirName;
    public String userOcc;
    public String userId;
    public String userCity;
    public String userCountry;
    public String userSalary;

    public User(String userName, int userAge, String userSirName, String userOcc,
                String userId, String userCity, String userCountry, String userSalary) {
        this.userName = userName;
        this.userAge = userAge;
        this.userSirName = userSirName;
        this.userOcc = userOcc;
        this.userId = userId;
        this.userCity = userCity;
        this.userCountry = userCountry;
        this.userSalary = userSalary;
    }
}
