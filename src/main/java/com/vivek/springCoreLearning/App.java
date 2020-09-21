package com.vivek.springCoreLearning;
import org.springframework.core.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Getting a class object that has a default constructor, from bean
       ApplicationContext context=new ClassPathXmlApplicationContext("springXMLbasedConfiguration.xml");
       
       //vehicle car, bike name without constructor
       Vehicle vehicleCar=(Vehicle)context.getBean("vehiclecar");
       vehicleCar.drive();
       Vehicle vehicleBike=(Vehicle)context.getBean("vehiclebike");
       vehicleBike.drive();
       
      //vehicle car, bike name initialised with constructor
       Vehicle vehicleCarConstructor=(Vehicle)context.getBean("vehicleCarConstructor");
       vehicleCarConstructor.drive();
       Vehicle vehicleBikeConstructor=(Vehicle)context.getBean("vehicleBikeConstructor");
       vehicleBikeConstructor.drive();
       
       //vehicle car,bike name initialised from setter method of ObjectForConstructor object
       Vehicle vehicleCarSetterObject=(Vehicle)context.getBean("vehicleCarNameObjectSetter");
       vehicleCarSetterObject.drive();
       Vehicle vehicleBikeSetterObject=(Vehicle)context.getBean("vehicleBikeNameObjectSetter");
       vehicleBikeSetterObject.drive();
       
       //vehicle car,bike name initialised from setter method bike, name
       Vehicle vehicleCarSetterProperty=(Vehicle)context.getBean("vehicleCarNamePropertySetter");
       vehicleCarSetterProperty.drive();
       Vehicle vehicleBikeSetterProperty=(Vehicle)context.getBean("vehicleBikeNamePropertySetter");
       vehicleBikeSetterProperty.drive();
      
    }
}
