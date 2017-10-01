package com.main.java;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
/*
 * It is a java bean class act as spring mvc controller. scan-package will scan
 * the classes with @cotroller on top of it and get to know that its a
 * controller class
 * 
 * @Controller is a stereotype which is use to auto-register class in
 * spring-context schema in xml file.
 */

//@RequestMapping("/hello")
/*
 * @RequestMapping annotation use to map the URLs for particular class or
 * handler method. all handling methods on this controller are relative to the
 * /hello path.
 */
public class HelloController {

	//@RequestMapping(method = RequestMethod.GET)

	/*
	 * @RequestMapping(value="/hello" ,method =RequestMethod.GET)
	 * 
	 * @RequestMapping(method = RequestMethod.GET) is used to declare the
	 * printHello() method as the controller's default service method to handle
	 * HTTP GET request.
	 * 
	 * method attribute defines the service method to handle HTTP GET request
	 * Inside the service method their is bussinuss logic inside businuss logic
	 * , we can create model attribute, and this attribute acceed by the view
	 */

	/*
	 * kindly mention the use of modelMap here. we are using a modelmap here and
	 * adding some message in it. then returning a view(here its hello.jsp)
	 */
	@RequestMapping("/")
	public String printHello(ModelMap model) {
		//now we will try to enhance the code 
		model.addAttribute("message", "Hello Khushi");
		return "index";
	}
	// service method return string as the name of view "hello".
}
