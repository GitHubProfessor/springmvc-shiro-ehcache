package com.qd.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mvc")
public class LoginController {
	@RequestMapping("/login")
	@ResponseBody
	public Map<String, String> login(String name,String password){
		Map<String, String> map= new HashMap<String,String>();
		
		try {
			Subject subject = SecurityUtils.getSubject();
			UsernamePasswordToken token = new UsernamePasswordToken(name,password);
			
			token.setRememberMe(true);
			subject.login(token); 
		} catch (UnknownAccountException e) {
			e.printStackTrace();
			map.put("result", "false"); 
			map.put("msg", "账号不存在");
		} catch (DisabledAccountException e) {
			e.printStackTrace();
			map.put("result", "false");
			map.put("msg", "账号未启用");
		} catch (IncorrectCredentialsException e) {
			e.printStackTrace();
			map.put("result", "false");
			map.put("msg", "密码错误");
		} catch (RuntimeException e) {
			e.printStackTrace();
			map.put("result", "false");
			map.put("msg", "未知错误,请联系管理员");
		} 
	
		map.put("m1", "hello");
		map.put("m2", "world");
		return map;
	}
}
