class Vehicle {
 private int passengers; // ���������� ����������
 private int fuelcap;    // ����� ���������� ���� � ��������
 private int mpg;        // ����������� ������� � ����� �� ������
 
 Vehicle (int �, int f, int m) {
  passengers = �;
  fuelcap = f;
  mpg = m;
 }
 
 // ���������� ��������� ������� ��   
 int range () {
  return mpg * fuelcap;
 }
 
 // ��������� ����� �������, ������������
 // ��� ����������� ��������� ����   
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
 private  int cargocap; // ���������������� � ������

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
    System.out.println("��� ����������� " + dist 
       + " ���� ����-������� ��������� "
       + gallons + " �������� ������� " + " ����� ��������� " 
       + minivan.getPassengers() + " ��� ���� ������� " + minivan.range());
 
    gallons = sportscar.fuelneeded(dist);
    System.out.println("��� ����������� " + dist  
       + " ���� ����������� ���������� ��������� " 
       + gallons + " �������� ������� " + " ����� ��������� " + 
       + sportscar.getPassengers() + " ��� ���� ������� " + sportscar.range());

    Truck semi = new Truck(2, 200, 7, 44000);
    Truck pickup = new Truck(3, 28, 15, 2000);

    gallons = semi.fuelneeded(dist);

    System.out.println("�������� ����� ��������� " + semi.getCargocap() + 
                       " ������.");
    
    System.out.println("��� ����������� " + dist  
       + " ���� ��������� ��������� " + gallons + 
         " �������� ������� " + " ����� ��������� " + 
       + semi.getPassengers() + " ��� ���� ������� " + semi.range());
 
    gallons = pickup.fuelneeded(dist);

    System.out.println("����� ����� ��������� " + pickup.getCargocap() + 
                       " ������.");
    
    System.out.println("��� ����������� " + dist  
       + " ���� ������ ��������� " + gallons + 
         " �������� ������� " + " ����� ��������� " + 
       + pickup.getPassengers() + " ��� ���� ������� " + pickup.range());

  }
}