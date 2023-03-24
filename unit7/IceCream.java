package unit7;

public class IceCream extends DessertItem{
private double cost;
public IceCream(String name,double cost) {
super(name);
this.cost=cost;
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
public String getName() {
return super.getName();
}
public double getCost() {
return cost;
}
public void setCost(double cost) {
this.cost = cost;
}

}
