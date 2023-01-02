package com.example.cardock;

public class car {
    public String manu;
    public String model;
    public String year;
    public String mile;
    public String trans;
    public String fuel;
    public String cap;
    public String loc;
    public String price;

    public car(String manu, String model,String year,String mile,String trans,String fuel,String cap,String loc,String price){
        this.manu = manu;
        this.model = model;
        this.year=year;
        this.mile=mile;
        this.trans=trans;
        this.fuel=fuel;
        this.cap=cap;
        this.loc=loc;
        this.price=price;
    }

    public String getManu() {
        return manu;
    }

    public void setManu(String manu) {
        this.manu = manu;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMile() {
        return mile;
    }

    public void setMile(String mile) {
        this.mile = mile;
    }

    public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void Display(){
        System.out.println("Manufacturer: "+getManu());
        System.out.println("Car model: "+getModel());
        System.out.println("Manufactured year: "+getYear());
        System.out.println("Mileage: "+getMile());
        System.out.println("Transmission: "+getTrans());
        System.out.println("Fuel type: "+getFuel());
        System.out.println("Capacity: "+getCap());
        System.out.println("Location of the car: "+getLoc());
        System.out.println("listing price: "+getPrice());

    }

}
