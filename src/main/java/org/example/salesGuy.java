package org.example;

public class salesGuy{

    private String name;
    private int    sales;
    private int    quota;


public void setName(String newValue){
    name = newValue;
}

public void setSales (int newValue){
    sales = newValue;
}

public void setQuota (int newValue){
    quota = newValue;
}

public int getSales(){
    return sales;
}

public int getQuota(){
    return quota;
}

/*public double IncomeClaculator(double NumberOfSales, double NumberOfQuota){
    double ans=0;
    ans = NumberOfSales * NumberOfQuota;
    return ans;
}*/
}