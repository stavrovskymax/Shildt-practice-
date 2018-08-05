class Vehicle {
 private int passengers; // Количество пассажиров
 private int fuelcap;    // Объем топливного бака в галлонах
 private int mpg;        // Потребление топлива в милях на галлон
 
 Vehicle (int р, int f, int m) {
  passengers = р;
  fuelcap = f;
  mpg = m;
 }
 
 // Возвратить дальность поездки ТС   
 int range () {
  return mpg * fuelcap;
 }
 
 // Вычислить объем топлива, требующегося
 // для прохождения заданного пути   
 double fuelneeded(int miles) {
  return (double) miles / mpg;
 }

 int getPassengers() { return passengers; }
 int getFuelcap() { return fuelcap; }
 int getMpg() { return mpg; } 
 void setPassengers(int p) { passengers = p; }
 void setFuelcap(int f) { fuelcap = f; }
 void setMpg(int m) { mpg = m; }
}

class Truck extends Vehicle {
 private  int cargocap; // Грузоподъемность в фунтах

 Truck(int p, int f, int m, int c) {
  super(p, f, m);
  cargocap = c;
 }

 int getCargocap() { return cargocap; } 
 void setCargocap(int c) { cargocap = c; } 
}

class TruckDemo {
  public static void main(String[] args) {
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
       + minivan.getPassengers() + " при этом проедет " + minivan.range());
 
    gallons = sportscar.fuelneeded(dist);
    System.out.println("Для преодоления " + dist  
       + " миль спортивному автомобилю требуется " 
       + gallons + " галлонов топлива " + " число пасажиров " + 
       + sportscar.getPassengers() + " при этом проедет " + sportscar.range());

    Truck semi = new Truck(2, 200, 7, 44000);
    Truck pickup = new Truck(3, 28, 15, 2000);

    gallons = semi.fuelneeded(dist);

    System.out.println("Грузовик может перевезти " + semi.getCargocap() + 
                       " фунтов.");
    
    System.out.println("Для преодоления " + dist  
       + " миль грузовику требуется " + gallons + 
         " галлонов топлива " + " число пасажиров " + 
       + semi.getPassengers() + " при этом проедет " + semi.range());
 
    gallons = pickup.fuelneeded(dist);

    System.out.println("Пикап может перевезти " + pickup.getCargocap() + 
                       " фунтов.");
    
    System.out.println("Для преодоления " + dist  
       + " миль пикапу требуется " + gallons + 
         " галлонов топлива " + " число пасажиров " + 
       + pickup.getPassengers() + " при этом проедет " + pickup.range());

  }
}