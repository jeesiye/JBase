package ocn.siye.JBase;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.CacheRequest;
import java.net.CacheResponse;
import java.net.HttpURLConnection;
import java.net.JarURLConnection;
import java.net.ResponseCache;
import java.net.SecureCacheResponse;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.URLPermission;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.util.Set;
import java.util.TreeSet;

@SuppressWarnings("all")
public class AppTest {

    public static void main(String[] args) {
	
	ownfuns(ResponseCache.class);
	
    }

    public static void ownfuns(Class<?> cl) {
	Set<String> sets = new TreeSet<>();
	Method[] methods = cl.getMethods();
	for (Method method : methods) {
	    if (method.getDeclaringClass().toString().equals(cl.toString())) {
		sets.add(method.getName() + " <p" + method.getParameterCount() + "> : "
			+ method.getReturnType().getSimpleName());
	    }
	}
	sets.forEach(System.out::println);

	System.out.println();
	System.out.println(sets.size());
    }

    public static void ownfields(Class<?> cl) {
	Set<String> set = new TreeSet<>();
	Field[] fields = cl.getFields();
	for (Field field : fields) {
	    if (field.getDeclaringClass().toString().equals(cl.toString())) {
		set.add(field.getName());
	    }
	}
	set.forEach(System.out::println);
    }

}
