package com.syntax.class23;
// overriding methods
public class Car {
    void start(){System.out.println("Use key to start me");}
    void stop(){System.out.println("Use breaks to stop me");}
    void park(){System.out.println("Park me manually");}
}
class BMW extends Car{
    void start(){System.out.println("Auto start me with button");}
    void stop(){System.out.println("Can use break or auto break");}
    void park(){System.out.println("Use auto parking sensor");}
}
class Tesla extends Car{
    void start(){System.out.println("Auto start me with App");}
    void stop(){System.out.println("Can use break or smart break");}
    void park(){System.out.println("Use smart parking sensor");}
}
class Toyota extends Car{
    void start(){System.out.println("keys to start");}
    void stop(){System.out.println("Break to stop");}
    void park(){System.out.println("Manual parking");}
}