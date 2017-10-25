package pl.sdacademy.oop;

public class Leaf {

		public String color;
		public String size;
		public double length;
		
		public void fly(){
			System.out.println("Lece!!");
		}
		
		public void rot(){
			System.out.println("Ojacie zgnilem :(");
		}
		
		public void deatach(){
			System.out.println("Spaduem");
		}
		
		public String name(String name){
			return "Czesc jestem lisciem i nazywam sie " + name;
		}
		
}
