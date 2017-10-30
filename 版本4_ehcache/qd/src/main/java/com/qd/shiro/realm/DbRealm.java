package com.qd.shiro.realm;

import java.util.HashSet;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * 数据库Realm
 * 
 * @author liuhb
 *
 */
public class DbRealm extends AuthorizingRealm {

	@Override
	public String getName() {
		return "db_realm";
	}

	@Override
	public boolean supports(AuthenticationToken token) {
		// 仅支持UsernamePasswordToken类型的Token
		return token instanceof UsernamePasswordToken;
	}

	/**
	 * 对登录用户进行认证操作，判断登录用户名密码是否正确
	 * 父类的父类AuthenticatingRealm中的抽象方法
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) {
		String username = (String) token.getPrincipal(); // 得到用户名
		String password = new String((char[]) token.getCredentials()); // 得到密码

		if (!"zhang".equals(username)) {
			throw new UnknownAccountException(); // 如果用户名错误
		}
		if (!"123".equals(password)) {
			throw new IncorrectCredentialsException(); // 如果密码错误
		}

		// 如果身份认证验证成功，返回一个AuthenticationInfo实现；
		return new SimpleAuthenticationInfo(username, password, getName());
	}

	/**
	 * 设置认证成功用户的角色和权限
	 * 此处直接写死的。实际中通过数据库查询出来后，在设置上
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		//权限
		Set<String> permissions = new HashSet<String>();
		permissions.add("p1");
		permissions.add("p2");
		info.setStringPermissions(permissions);
		
		//角色
		Set<String> roles = new HashSet<String>();
		roles.add("r1");
		roles.add("r2");
		info.setRoles(roles);
		return info;
	}
}
