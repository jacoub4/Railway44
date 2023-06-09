
package gui1;

import java.io.Serializable;


public  class Client extends Person implements Serializable{
    private static final long serialVersionUID = 1L;
private String password;
private int ID;
private int age;
private String name;
private boolean pensioner;
private String adress;
private int  Ntravels=0;
private double TraveledDistance=0;

Client(){

}

public Client(String name,int age,int ID,String adress,boolean p,int Ntravels,double distance,String password){
this. name=name;
this.age=age;
this.ID=ID;
this.adress=adress;
pensioner=p;
this.Ntravels=Ntravels;
TraveledDistance=distance;
this.password=password;

}
public boolean isGolden(){
    return false;
}


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean isPensioner() {
        return pensioner;
    }

    @Override
    public void setPensioner(boolean pensioner) {
        this.pensioner = pensioner;
    }

    @Override
    public String getAdress() {
        return adress;
    }

    @Override
    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getNtravels() {
        return Ntravels;
    }

    @Override
    public void setNtravels(int Ntravels) {
        this.Ntravels = Ntravels;
    }

    public double getTraveledDistance() {
        return TraveledDistance;
    }

    public void setTraveledDistance(double TraveledDistance) {
        this.TraveledDistance = TraveledDistance;
    }
//public abstract void TakeTrain(Train tr1);
//public abstract void buyTicket(Ticket ticket);
    
    
    @Override
    public String toString() {
        return "Client{" + "ID=" + ID + ", age=" + age +", name=" + name + ", Password: "+password+ ", pensioner=" + pensioner + ", adress=" + adress + ", Ntravels=" + Ntravels + ", TraveledDistance=" + TraveledDistance + '}';
    }}
