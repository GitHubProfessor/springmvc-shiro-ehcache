package qd;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.apache.jasper.tagplugins.jstl.core.Set;


public class ReflectionTest {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class clazz = Class.forName("qd.People");
		
		//获取带有参数的构造函数
		Constructor c = clazz.getConstructor(String.class,int.class);
		
		//实例化
		Object obj = c.newInstance("john",14);
		
		//获取要调用的方法
		Method method = clazz.getMethod("getName");
		
		//调用方法
		System.out.println(method.invoke(obj));
		
		TreeSet set = new TreeSet();
		set.add("2");
		set.add("1");
		set.add("3");
		for (Object object : set) {
			System.out.println(object);
		}
	}

}
