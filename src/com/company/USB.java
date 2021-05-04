package com.company;

public class USB {
    String portType;
    int portID;

    public USB() {
    }

    public USB(String portType, int portID) {
        this.portType = portType;
        this.portID = portID;
    }

    public void printInfo(){
        System.out.println("USB: portType - " + portType + ",  portID - " + portID);
    }

    public void setPortType(String portType) {
        this.portType = portType;
    }

    public String getPortType() {
        return portType;
    }

    public void setPortID(int portID) {
        this.portID = portID;
    }

    public int getPortID() {
        return portID;
    }
}
