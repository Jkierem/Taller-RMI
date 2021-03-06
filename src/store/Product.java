package store;

import shared.exceptions.InsufficientQuantityException;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private int quantity;
    private String name;
    private int value;

    public Product(int id, int quantity, String name, int value) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public void changeQuantityBy(int amount ) throws InsufficientQuantityException {
        if( quantity + amount < 0 ){
            System.out.println("Not enough");
            throw new InsufficientQuantityException();
        }
        this.quantity += amount;
    }

    public Product copy(){
        return new Product( id , quantity , name , value );
    }

    public String[] toTuple(){
        String[] tuple = new String[4];
        tuple[0] = String.valueOf(id);
        tuple[1] = name;
        tuple[2] = String.valueOf(quantity);
        tuple[3] = String.valueOf(value);
        return tuple;
    }
}
