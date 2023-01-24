package it.figuccia;

import java.util.Objects;


public class SmartphonePrice implements Cloneable {
    private final String priceType;
    private final double priceInEuros;

    public SmartphonePrice(String type, double price) {
        this.priceType = type;
        this.priceInEuros = price;
    }

    @Override
    public SmartphonePrice clone() throws CloneNotSupportedException {
        return (SmartphonePrice) super.clone();
    }

    @Override
    public String toString() {
        return "SmartphonePrice{" +
                "priceType='" + priceType + '\'' +
                ", priceInEuros=" + priceInEuros +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice that = (SmartphonePrice) o;
        return Double.compare(that.priceInEuros, priceInEuros) == 0 &&
                Objects.equals(priceType, that.priceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }
}