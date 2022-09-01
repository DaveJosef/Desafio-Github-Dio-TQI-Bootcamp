package one.digitalinnovation;

import java.util.Objects;

public class Carro implements Comparable<Carro> {

    private String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(getMarca(), carro.getMarca());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMarca());
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }
//    
//    @Override
//    public int compareTo(Carro carro) {
//        if (marca.length() < carro.getMarca().length()) {
//            return -1;
//        } else if (marca.length() > carro.getMarca().length()) {
//            return 1;
//        }
//        return 0;
//    }

    @Override
    public int compareTo(Carro carro) {
        return getMarca().compareTo(carro.getMarca());
    }
}
