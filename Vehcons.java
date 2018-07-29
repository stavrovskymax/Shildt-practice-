class Vehicle {
 int passengers;
 int fuelcap;
 int mpg;
 
 Vehicle (int р, int f, int m) {
  passengers = р;
  fuelcap = f;
  mpg = m;
 }
    
 int range () {
  return mpg * fuelcap;
 }
    
 double fuelneeded(int miles) {
  return (double) miles / mpg;
 }
}
class Vehcons {
  public static void main(String args[]) {
    Vehicle minivan = new Vehicle(4, 16, 21);
    Vehicle sportscar = new Vehicle(2, 14, 12);
    double gallons;
    int dist = 252;
    
/*    minivan.passengers = 7;
    minivan.fuelcap = 16;
    minivan.mpg = 21;
        
    sportscar.passengers = 2;
    sportscar.fuelcap = 14;
    sportscar.mpg = 12;    */
 
    gallons = minivan.fuelneeded(dist);
    System.out.println("Для преодоления " + dist 
       + " миль мини-фургону требуется "
       + gallons + " галлонов топлива " + " число пасажиров " 
       + minivan.passengers + " при этом проедет " + minivan.range());
 
    gallons = sportscar.fuelneeded(dist);
    System.out.println("Для преодоления " + dist  
       + " миль спортивному автомобилю требуется " 
       + gallons + " галлонов топлива " + " число пасажиров " + 
       + sportscar.passengers + " при этом проедет " + sportscar.range());
  }
}