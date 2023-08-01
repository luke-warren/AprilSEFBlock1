package org.example;

public class OutdoorPatagoniaBackPack extends PatagoniaBackpack{
    private Integer carabiners;
    private Integer durabilityIndex;

    public OutdoorPatagoniaBackPack(Integer pockets, String color, Integer zippers, Integer buckles, String size, Integer carabiners, Integer durabilityIndex) {

        super(pockets, color, zippers, buckles, size);
        this.carabiners = carabiners;
        this.durabilityIndex = durabilityIndex;

    }

    public Integer getCarabiners() {
        return carabiners;
    }

    public Integer getDurabilityIndex() {
        return durabilityIndex;
    }

    public void setCarabiners(Integer carabiners) {
        this.carabiners = carabiners;
    }

    public void setDurabilityIndex(Integer durabilityIndex) {
        this.durabilityIndex = durabilityIndex;
    }

    @Override
    public String toString() {
        return "OutdoorPatagoniaBackPack{" +
                "carabiners=" + carabiners +
                ", durabilityIndex=" + durabilityIndex +
                ", color=" + this.getColor() +
                ", producer= " + getProducer() +
                '}';
    }
}
