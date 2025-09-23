***Assignment 1: Abstract Factory and Factory Method***

This project demonstrates the use of the Abstract Factory and Factory Method design patterns in a Java program.  
The scenario is a smart home system where two brands (Brand A & Brand B) each have two devices: a Smart Bulb, and a Smart Lock.  

The Abstract Factory `SmartDeviceFactory` lets us make  families of products (Bulb + Lock) without specifying their concrete classes.  
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
		ExternalTestData.java # Simulated external data source  

	test/
		Main.java # test driver program for output of program	
  
 diagrams/ # UML diagrams exported from Visual Paradigm  
 uml_smart_home_factory.png  

screenshots/ # Screenshots of IntelliJ output  
  
output.png  
   
README.md # Project description and instructions  

**Output**

1. create Bulb (Brand A)  
	call factory: brandAfactory.createBulb()  
	product method: bulbA.getPowerUsage  
 	This shows hoe the Abstract Factory returns the correct product and that the Factory-Method step sets the power value from `DataReader.java` external file.

2. Create Lock (Brand B)
	call factory: brandBfactory.createLock()  
	product method: LockB.getBatteryUsage
	This tells that a different factory will return the matching lock product and the usage battery value is set after creation.  
  
I ran the program from compiling the complete project in IntelliJ and running 'Main.main()' to get the output which is: 

The power usage of the Brand A Bulb is: 10W  
The battery usage of the Brand B lock is: 25%  
  
Process finished with exit code 0  

<img width="945" height="482" alt="SOFE3650_Assignment1_Output" src="https://github.com/user-attachments/assets/e6a0e02b-3487-4765-95cc-e90574f279f6" />













