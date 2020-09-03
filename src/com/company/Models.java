// Models.java:

package com.company;

interface IPriceable
{
    int getPrice();
}

class Product implements IPriceable
{
    private int price;

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
