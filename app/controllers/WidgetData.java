package controllers;

import play.data.validation.Constraints;


public class WidgetData {

    @Constraints.Required
    private String name;

    @Constraints.Min(0)
    private int price;

    public WidgetData() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
