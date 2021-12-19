package com.company;

public class Date implements Cloneable {

    int kek = 1;
    public Date (Date kek){

    }

    public Date (int kek){
        this.kek = kek;
    }

    public int getKek() {
        return kek;
    }

    public void setKek(int kek) {
        this.kek = kek;
    }

    @Override
    protected Date clone() throws CloneNotSupportedException {
        return (Date) super.clone();
    }
}
