package com.colive.DesignModel.Factory.Human;

import com.colive.DesignModel.Factory.Interfaces.HumanInterface;

public class WhiteHuman implements HumanInterface {


    @Override
    public void getColor() {
        System.out.println("i am white");
    }

    @Override
    public void talk() {
        System.out.println("i speak english");
    }
}
