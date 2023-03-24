package unit7;
/**
* Superclass for DessertItem hierarchy
* @author Aaron Chamberlain
*/
public class DessertItem {
public final static double TAX_RATE = 6.5; // 6.5%
public final static String STORE_NAME = "C & J Dessert Shoppe";
public final static int MAX_ITEM_NAME_SIZE = 25;
public final static int COST_WIDTH = 6;
private String name;
/** One argument constructor - Initializes DessertItem data
*/
public DessertItem(String name) {
if (name.length() <= MAX_ITEM_NAME_SIZE)
this.name = name;
else
this.name = name.substring(0, MAX_ITEM_NAME_SIZE);
}//end constructor
/** Returns name of DessertItem
* @return name of DessertItem
*/
public String getName() {
return name;
}//end getName method
/** Returns cost of DessertItem
* @return cost of DessertItem
*/
public double getCost() {
return 0;
}
/**
* @return String which contains receipt information
*/
public String buildReceipt() {
return "";
}
}//end class