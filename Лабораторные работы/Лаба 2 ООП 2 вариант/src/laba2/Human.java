package laba2;

public class Human {
    private Hand hand = new Hand();
    private Leg leg = new Leg();
    private Head head = new Head();

    public void setInfo(){
        head.setEyeColor();
        head.setHairColor();
        leg.setFootLength();
        hand.setArmLength();
        hand.setPalmLength();
    }
    public String toString(){
        return "eye color: " + head.getEyeColor() + " | hair color: " + head.getHairColor() + " | foot length: " + leg.getFootLength()
                + " | arm length: " + hand.getArmLength() + " | palm length: " + hand.getPalmLength();
    }
}
