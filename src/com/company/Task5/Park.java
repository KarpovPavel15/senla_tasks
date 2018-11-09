package com.company.Task5;

class Park {
    private String name;
    private String time;
    private int cost;

Park(String name,String time,int cost){
    this.name=name;
    this.time=time;
    this.cost=cost;
}
    public void displayPerson(){
        System.out.printf("Park \t Name: %s \t Time: %s \t  Cost: %s \t \n", name, time,cost);
    }
}
