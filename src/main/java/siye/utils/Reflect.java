package siye.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.SocketImplFactory;
import java.util.Set;
import java.util.TreeSet;

@SuppressWarnings("all")
public class Reflect {

    public static void main(String[] args) {
	ownfuns(SocketImplFactory.class);
    }

    public static void ownfuns(Class<?> cl) {
	Set<String> set = new TreeSet<>();
	for (Method method : cl.getMethods()) {
	    if (method.getDeclaringClass().toString().equals(cl.toString()))
		set.add(method.getName() + " <p" + method.getParameterCount() + "> : "
			+ method.getReturnType().getSimpleName());
	}
	set.forEach(System.out::println);
    }

    public static void ownfields(Class<?> cl) {
	Set<String> set = new TreeSet<>();
	for (Field field : cl.getFields()) {
	    if (field.getDeclaringClass().toString().equals(cl.toString()))
		set.add(field.getName());
	}
	set.forEach(System.out::println);
    }

    public static void newline() {
	System.out.println();
    }

}
