public class Flower {
    private String flowerName;
    private String flowerColor;
    private String country;
    float cost;
    private int lifeSpan;
    public int quantity;
    static int totalQuantity = 0;
    static float totalCost = 0.00f;


    Flower(String flowerName, String flowerColor, String country, float cost, int lifeSpan, int quantity) {
        this.flowerName = flowerName;
        setFlowerColor(flowerColor);
        setCountry(country);
        setCost(cost);
        setLifeSpan(lifeSpan);
        setQuantity(quantity);
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == "" || flowerColor == null) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == "" || country == null) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan <= 0 || lifeSpan % 1 > 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }

    public static int getTotalQuantityInBouqeut(Flower[] flowers) {
        for (int i = 0; i < flowers.length; i++) {
            totalQuantity = totalQuantity + flowers[i].quantity;
        }
        return totalQuantity;
    }

    public static float getCostOfBouqeut(Flower[] flowers) {
        for (int i = 0; i < flowers.length; i++) {
            totalCost = totalCost + flowers[i].getCost() * flowers[i].getQuantity();
        }
        return totalCost;
    }

    public static int getMinLifeSpan(Flower[] flowers) {
        int minLifeSpan = flowers[0].getLifeSpan();
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i].getLifeSpan() < minLifeSpan) {
                    minLifeSpan = flowers[i].getLifeSpan();
                }
        }
        return minLifeSpan;
    }

    @Override
    public String toString() {
        return getFlowerName() + ", цвет " + getFlowerColor() + ", страна " + getCountry() + ", срок стояния " + getLifeSpan() + " дней, цена за единицу " + String.format("%.2f", getCost())  + " рублей. Цена за " + getQuantity() + " штук равна " + String.format("%.2f", getCost() * getQuantity()) + " рублей.";
    }
}
