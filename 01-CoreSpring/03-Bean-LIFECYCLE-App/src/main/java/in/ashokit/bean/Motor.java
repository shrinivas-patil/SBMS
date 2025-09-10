
//Using Programming Approach
package in.ashokit.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Motor implements InitializingBean, DisposableBean{
	public Motor() {
		System.out.println("Constructor :: Motor");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Motor Started.......");
		
	}
	
	public void doWork() {
		System.out.println("Motor pulling water");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Motor Stopped......");
		
	}

}



//using Xml Approach
/*package in.ashokit.bean;

public class Motor {
	public Motor() {
		System.out.println("Constructor :: Motor");
	}
	
	public void Start() {
		System.out.println("Motor Started.......");
	}
	
	public void doWork() {
		System.out.println("Motor pulling water");
	}
	
	public void Stop() {
		System.out.println("Motor Stooped......");
	}

}*/
