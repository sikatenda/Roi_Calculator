package com.example.Returnoninvestment.RoiDomain;

import java.text.DecimalFormat;

public class Roi<roi> {

    DecimalFormat df = new DecimalFormat("0.00"); //this is to format the result of all calculations to 2 columns after the comma

   private double costOfInvest=0;
   private double profit=0;
   private  int time=0;

   private double totalRoi;
   private double monthlyRoi;

    public double getCostOfInvest() {
        return costOfInvest;
    }

    public void setCostOfInvest(double costOfInvest) {
        this.costOfInvest = costOfInvest;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getRoiTotal() { // this method helps to get return on the investment
        totalRoi = (profit/costOfInvest) * 100;
        return df.format(totalRoi) + "%";
    }

    public String getTimeTotal(){ // this method help to get monthly return on the investment
        monthlyRoi =  ( (profit/costOfInvest) * 100) / time;
        return df.format(monthlyRoi) + "%";
    }
}
