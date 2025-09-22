***Assignment 1: Abstract Factory and Factory Method***

This project demonstrates the use of the Abstract Factory and Factory Method design patterns in Java.  
The scenario is a smart home system where two brands (Brand A and Brand B) each produce two devices: a Smart Bulb and a Smart Lock.  

The Abstract Factory (`SmartDeviceFactory`) allows us to create families of products (Bulb + Lock) without specifying their concrete classes.  
The Factory Method is used inside the factories to set device-specific usage values (power for bulbs, battery for locks) after the object is created.  

**Repository Structure**
  
SmartHomeFactory  
	src/  

  *Java Files in Source File*  
		SmartDeviceFactory.java   
		BrandAFactory.java # Concrete factory for Brand A  
		BrandBFactory.java # Concrete factory for Brand B  
		Bulb.java # Bulb interface  
		Lock.java # Lock interface  
		BrandABulb.java # Brand A Bulb implementation  
		BrandBBulb.java # Brand B Bulb implementation  
		BrandALock.java # Brand A Lock implementation  
		BrandBLock.java # Brand B Lock implementation  
		DataReader.java # Simulated external data source  
		Main.java # Test driver program  
  
 diagrams/ # UML diagrams exported from Visual Paradigm  
 uml_smart_home_factory.png  

screenshots/ # Screenshots of IntelliJ output  
  
output.png  
   
README.md # Project description and instructions  

**Output**

Brand A Bulb Power Usage: 10W  
Brand B Lock Battery Usage: 25%  
<img width="936" height="500" alt="AbstractFactory_Output" src="https://github.com/user-attachments/assets/0f2d03bc-d922-47b4-8a5f-e1b3bf0d3316" />









