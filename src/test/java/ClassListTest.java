import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import org.junit.Test;
import org.smart4j.framework.util.ClassUtil;

public class ClassListTest {
	@Test
	public void getClassList(){
		List<Class> classList = new ArrayList<Class>();
		String  packageName = "org.smart4j.framework";
		try {
			Enumeration urls = ClassUtil.getClassLoad().getResources(packageName.replace(".", "/"));
			while (urls.hasMoreElements()) {
				URL url = (URL) urls.nextElement();
				String urlProt = url.getProtocol();
				if(urlProt.equals("file")) {
					String path = url.getPath().replace("20%", " ");
					addClass(classList,path,packageName);
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private void addClass(List<Class> classList,String path,String packageName) {
		// TODO Auto-generated method stub
		File[] files = new File(path).listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return (pathname.isFile() && pathname.getName().endsWith(".class") || pathname.isDirectory());
			}
		});
//		System.out.println(path);
//		System.out.println(packageName);
		for(File file:files) {
			String fileName = file.getName();
			if(file.isFile()) {
				System.out.println(fileName);
				String className = fileName.substring(0, fileName.indexOf("."));
				className = packageName+"."+className;
				doAddClass(classList,className);
			}else {
				String subPath=path+"/"+fileName;
				String sbuPackageName = packageName+"."+fileName;
				addClass(classList,subPath,sbuPackageName);
			}
		}
		System.out.println(classList);
	}
	private void doAddClass(List<Class> classList, String className) {
		// TODO Auto-generated method stub
		Class cls = ClassUtil.loadClass(className,false);
		classList.add(cls);
	} 
}
