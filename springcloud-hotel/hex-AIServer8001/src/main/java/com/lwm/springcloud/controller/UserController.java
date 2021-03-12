package com.lwm.springcloud.controller;
 
import java.io.IOException;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.lwm.springcloud.entities.User;
import com.lwm.springcloud.service.UserService;

 
@Controller
public class UserController {
	
	@Resource(name="userService")
	private UserService userService;
	/**
	 * 根据当前用户是否存在
	 */
	/*@ResponseBody
	@RequestMapping(value="/index")
	public String index(){
		return "index";
	}*/
	
	@ResponseBody
	@RequestMapping(value="/index")
	public User index(){
		User user = null;
		try {
			user = userService.findByName("Jack");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	
	@RequestMapping(value="/register")
	public String register(){
		System.out.println("进来啦.......");
		return "register";
	}
	
	@ResponseBody
	@RequestMapping(value="/login")
	public User queryById(HttpServletRequest request,HttpServletResponse response){
		//request获取username参数
		String username = request.getParameter("username");
		String pwd = request.getParameter("password");
		System.out.println("LoginServlet get username:"+username+"  "+pwd);
		
		User user = null;
		try {
			user = userService.findByName(username);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if(user!=null && user.getPwd().equals(pwd)){
			return user;
		}
			
		return null;
	}
	
	@ResponseBody
	@RequestMapping("/Register")
	public User Register(HttpServletRequest request,HttpSession session,HttpServletResponse response){
		
		//request获取username参数
		String userName = request.getParameter("userName");
		String userPwd = request.getParameter("userPwd");
		String userNumber = request.getParameter("userNumber");
		String userID = request.getParameter("userID");
		System.out.println("RegisterServlet get username:"+userName+"  "+userPwd+" "+userNumber+" "+userID);
		
		User user = userService.createNewUser("0", userName, userPwd, userNumber, userID);
		userService.register(user);
		return user;

	}
	
	@RequestMapping("/mydata")
	public ModelAndView mydata(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("mydata");
		return mv;
	}
	
	@ResponseBody
	@RequestMapping(value="/UpdateUserData")
	public boolean getmap(HttpServletRequest request,HttpServletResponse response){	
		System.out.println(request.getParameter("userName"));
		
		
		User user = userService.createNewUser(request.getParameter("userNo"), request.getParameter("userName"), request.getParameter("userPwd"), request.getParameter("userNumber"), request.getParameter("userID"));
		System.out.println(user);
		userService.updateUserData(user);
		return true;		
	}
}