//ACCOUNT HOLDER
public class AccountHolder{
    private int ID;
    private String address;
}

public AccountHolder(int ID, String address){
    this.ID = ID;
    this.address = address;
}

public int getNextID(){
    return this.ID;
}


//ACCOUNT
public class account{
    private AccountHolder holder;
    private double balance;
}

public Account(double amt, AccountHolder holder){
    this.balance = amt;
    this.holder = holder;
} 

public deposit(double amt){
    this.balance += amt;
}

public withdraw(double amt){
    this.balance -= amt;
} 

public double getBalance(){
    return this.balance;
} 

public AccountHolder getHolder(){
    return this.holder;
} 

void setBalance(double amt){
    this.balance = amt;
} 

void setHolder(AccountHolder holder){
    this.holder = holder;
}



//INDIVIDUAL HOLDER
public class individualHolder{
    private String name;
    private String SSN;
}

public IndividualHolder(int ID, String address, String name, String SSN){
    this.name = name;
    this.SSN = ssn;
} 

String getName(){
    return this.name;
} 

String getSSN(){
    return this.SSN;
}

void setName(String name){
    this.name = name;
}

void setSSN(String SSN){ 
    this.SSN = SSN;
}


//CORPERATE HOLDER
public class CorporateHolder{
    private String contact;
}

public CorportateHolder(int ID, String address, String contact){
    this.contact = contact;
}

public String getContact(){
    return this.contact;
}

public void setContact(String contact){
    this.contact = contact;
}


//UTIL
public interface UTIL{
    public String convertNameUpperCase(String name){
        name = name.toUpperCase();
    } 
}