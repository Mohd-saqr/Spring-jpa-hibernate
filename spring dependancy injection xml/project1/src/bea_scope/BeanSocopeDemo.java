package bea_scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanSocopeDemo {

	public static void main(String[] args) {
	
	// load the spring configuration file

 ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("beanScope.xml");

  // retrive bean from spring container 

      Farmmer farmmer = context.getBean("farmer", Farmmer.class);
      
     System.out.print(farmmer.getNote());
	}

}
