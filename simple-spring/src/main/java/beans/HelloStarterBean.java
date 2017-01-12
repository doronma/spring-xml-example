package beans;

import org.springframework.context.MessageSource;

public class HelloStarterBean {
	private HelloWorldBean helloWorldBean;
	private Bean1 bean1;
	private Bean2 bean2;
	private MessageSource messageSource;
	
	public void setMessageSource(MessageSource source){
		messageSource=source;
	}
	
	public String getResourceMessage(){
		return messageSource.getMessage("message", null, "Default",null);
	}

	public Bean1 getBean1() {
		return bean1;
	}

	public void setBean1(Bean1 bean1) {
		this.bean1 = bean1;
	}

	public Bean2 getBean2() {
		return bean2;
	}

	public void setBean2(Bean2 bean2) {
		this.bean2 = bean2;
	}

	public String getMessage() {
		return helloWorldBean.getMessage();
	}

	public HelloStarterBean(HelloWorldBean helloWorldBean) {
		super();
		this.helloWorldBean = helloWorldBean;
	}

	public HelloStarterBean() {
		super();
		// TODO Auto-generated constructor stub
	}
}