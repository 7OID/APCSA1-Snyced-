package unit7;

public class Cookie extends DessertItem{
private int number;
private double price;

public Cookie(String name,int number, double price) {
super(name);
this.number=number;
this.price=price;
}
public String getName() {
return super.getName();
}
public double getCost() {
double cost = (price/12)*number;
return Math.round(cost * 100.0) / 100.0;
}
public String padRight(int width,String original) {
int numSpaces = width - original.length();

for (int i = 0; i < numSpaces; i++) {
   original += " ";
}
return original;

}
public String buildReceipt() {
return padRight(30,getName())+getCost();

}

public int getNumber() {
return number;
}

public void setNumber(int number) {
this.number = number;
}

public double getPrice() {
return price;
}

public void setPrice(double price) {
this.price = price;
}


}