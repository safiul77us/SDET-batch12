package com.syntax.class22;
/*
Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
Create a subclass  userInfo that will have user address variable and it also being
initialized through constructor call. Print users name, mobile number
and address in userDetails method. Test your code.
 */


class UserClass{
    String name;
    String mobileNumber;
    UserClass(String name, String mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }
    void classDetail(){
        System.out.println(name + " " + mobileNumber);
    }
}
class UserInfo extends UserClass{
    String userAddress;
    UserInfo(String name, String mobileNumber,String userAddress){
        super(name,mobileNumber);
        this.userAddress = userAddress;
    }
    void userDetail(){
        System.out.println(name +" "+ mobileNumber + " "+ userAddress);
    }
}

public class Task1 {
    public static void main(String[] args) {
        UserInfo ui = new UserInfo("Dimit", "1234574234", "USA");
        ui.userDetail();
        UserClass uc = new UserClass("alam", "2124567777");
        uc.classDetail();
    }
}
