import java.util.*;
class CarDealership{
	private String name;
	private int establishedYear;
	private Car car;
	public CarDealership(String name,int establishedYear{
		this.name=name;
		this.establishedYear=establishedYear;
	}
	public void setCar(Car car){
		this.car=car;
	}
	public String getName(){
		return name;
	}
	public int getEstablishedYear(){
		return establishedYear;
	}
	public class Car{
		private String brand;
		private String model;
		private int year;
		public Car(String brand,String model,int year){
			this.brand=brand;
			this.model=model;
			this.year=year;
		}
		public String getBrand(){
			return brand;
		}
		public String getModel(){
			return model;
		}
		public int getYear(){
			return year;
		}
		public void displayCarInfo(){
			System.out.println("Car brand: "+brand);
			System.out.println("Car model: "+model);
			System.out.println("Car year: "+year);
		}
	}
}
class Main{
	public static void main(String[] st){
		CarDealership obj1=new CarDealership("Your dealership",1996);
	}
}