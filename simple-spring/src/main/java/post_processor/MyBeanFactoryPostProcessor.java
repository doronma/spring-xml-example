package post_processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.util.Assert;

import event_sample.LateRegistered;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	public MyBeanFactoryPostProcessor() {
		// TODO Auto-generated constructor stub
	}

	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
		System.out.println("In postProcessBeanFactory - " + arg0.getClass().getName());
		Assert.isInstanceOf(BeanDefinitionRegistry.class, arg0);
		BeanDefinitionRegistry registry = (BeanDefinitionRegistry)arg0;
	
		BeanDefinitionReaderUtils.registerWithGeneratedName(new RootBeanDefinition(LateRegistered.class), registry);

	}

}
