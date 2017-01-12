package starter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bean1;
import beans.Bean2;
import beans.Bean2Son;
import beans.HelloStarterBean;
import beans.HelloWorldBean;

public class Mainapp {
	public static void main(String[] args) {
		System.out.println("XML Configuration");
		ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorldBean bean = (HelloWorldBean)context.getBean("helloWorld");
		System.out.println("Message is - " + bean.getMessage());
		Bean1 bean1 = (Bean1)context.getBean("bean1");
		System.out.println(bean1.getBeanName());
		System.out.println(bean1.getMsg());
		HelloStarterBean helloStarterBean = (HelloStarterBean)context.getBean("helloStarterBean");
		System.out.println("Inner message is - " + helloStarterBean.getMessage());
		System.out.println("Inner bean1 msg - " + helloStarterBean.getBean1().getMsg());
		System.out.println(helloStarterBean.getResourceMessage());
		Bean2 bean2 = (Bean2)context.getBean("bean2");
		System.out.println(bean2.getLongName());
		System.out.println("Bean 2 son name - " + ((Bean2Son)context.getBean("bean2Son")).getMyname());
		
		
		
		((ConfigurableApplicationContext)context).close();
		
		
	}

}
