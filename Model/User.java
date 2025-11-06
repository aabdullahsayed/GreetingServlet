package Model;

public class User{

private String name;

public User(String name){

this.name = name;

}

public String getGreeting(){
return "Welcome "+name+" Hope you are doing well!"; 

}

}