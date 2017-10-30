package com.qd.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qd.csrf.CsrfToken;
import com.qd.service.Account;
import com.qd.service.AccountService;

@Controller
@RequestMapping("/mvc")
public class LoginController {
	@Autowired
	public AccountService accountService ;
	
	
	@GetMapping("/login")
	@CsrfToken(create = true)
	public String login() {
		return "/login";
	}

	@PostMapping("/login")
	@CsrfToken(remove = true)
	public String login(HttpServletRequest request, String name, String password) {
		Map<String, String> map = new HashMap<String, String>();

		try {
			Subject subject = SecurityUtils.getSubject();
			UsernamePasswordToken token = new UsernamePasswordToken(name, password);

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
		return "redirect:/mvc/index";
	}

	@GetMapping("/index")
	public String index() {
		return "/index";
	}

	/**
	 * shiro权限功能
	 * 只有拥有此处注解指定权限的用户才能访问此方法。没有权限返回404.
	 * 权限是在Realm中的doGetAuthorizationInfo中设置的。
	 * @return
	 */
	@RequiresRoles("r1")
	@RequestMapping(value = "/role1")
	@ResponseBody
	public String demo01() {
		return "role1 success";
	}
	
	@RequestMapping("/ehcache")
	@ResponseBody
	public  String doEhcache() {
		Account account = accountService.getAccountByName("someone");
		return account.getPassword();
	}
}
