/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe618.dyna.models;

/**
 *
 * @author Josh
 */
public class Power {

    public Power(int earth, int fire, int water, int wind, int solar, int spiritual, int atomic) {
        this.earth = earth;
        this.fire = fire;
        this.water = water;
        this.wind = wind;
        this.solar = solar;
        this.spiritual = spiritual;
        this.atomic = atomic;
    }

    private boolean compare(Power p) {
        if (p.getFire() + this.fire < 0) {
            return false;
        }
        if (p.getEarth() + this.earth < 0) {
            return false;
        }
        if (p.getWater() + this.water < 0) {
            return false;
        }
        if (p.getWind() + this.wind < 0) {
            return false;
        }
        if (p.getSolar() + this.solar < 0) {
            return false;
        }
        if (p.getSpiritual() + this.spiritual < 0) {
            return false;
        }
        return p.getAtomic() + this.atomic >= 0;
    }

    public boolean subtract(Power p) {
        if (compare(p)) {
            this.earth += p.getEarth();
            this.atomic += p.getAtomic();
            this.fire += p.getFire();
            this.solar += p.getSolar();
            this.spiritual += p.getSpiritual();
            this.water += p.getWater();
            this.wind += p.getWind();

            return true;
        }

        return false;
    }
    private int earth;
    private int fire;
    private int water;
    private int wind;
    private int solar;
    private int spiritual;
    private int atomic;

    public int getEarth() {
        return earth;
    }

    public int getFire() {
        return fire;
    }

    public int getWater() {
        return water;
    }

    public int getWind() {
        return wind;
    }

    public int getSolar() {
        return solar;
    }

    public int getSpiritual() {
        return spiritual;
    }

    public int getAtomic() {
        return atomic;
    }

    public void setEarth(int earth) {
        this.earth = earth;
    }

    public void setFire(int fire) {
        this.fire = fire;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public void setWind(int wind) {
        this.wind = wind;
    }

    public void setSolar(int solar) {
        this.solar = solar;
    }

    public void setSpiritual(int spiritual) {
        this.spiritual = spiritual;
    }

    public void setAtomic(int atomic) {
        this.atomic = atomic;
    }

    public void addEarth(int amount) {
        this.earth += amount;
    }

    public void addFire(int amount) {
        this.fire += amount;
    }

    public void addWind(int amount) {
        this.wind += amount;
    }

    public void addWater(int amount) {
        this.water += amount;
    }

    public void addSolar(int amount) {
        this.solar += amount;
    }
      public void addSpiritual(int amount){
      this.spiritual +=amount;
  }
        public void addAtomic(int amount){
      this.atomic +=amount;
  }
        
        
}
