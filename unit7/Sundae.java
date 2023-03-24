package unit7;

public class Sundae extends IceCream{
private double costTopping;
private String toppingName;
public Sundae(String name,double cost,String toppingName,double costTopping) {
super(name,cost);
this.costTopping=costTopping;
this.toppingName=toppingName;
}
public String getName() {
return super.getName();
}
public String padRight(int width,String original) {
int numSpaces = width - original.length();

for (int i = 0; i < numSpaces; i++) {
   original += " ";
}
return original;
}
public double getCost() {
return super.getCost()+costTopping;
}
public String buildReceipt() {
return padRight(30,getName()+getToppingName())+getCost();

}
public String getToppingName() {
return toppingName;
}
public void setToppingName(String toppingName) {
this.toppingName = toppingName;
}
public double getCostTopping() {
return costTopping;
}
public void setCostTopping(double costTopping) {
this.costTopping = costTopping;
}

}