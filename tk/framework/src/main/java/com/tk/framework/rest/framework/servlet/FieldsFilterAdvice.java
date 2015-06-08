package com.tk.framework.rest.framework.servlet;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletResponse;

import javassist.ClassClassPath;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.bytecode.AnnotationsAttribute;
import javassist.bytecode.ClassFile;
import javassist.bytecode.ConstPool;
import javassist.bytecode.annotation.Annotation;
import javassist.bytecode.annotation.ArrayMemberValue;
import javassist.bytecode.annotation.MemberValue;
import javassist.bytecode.annotation.StringMemberValue;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.codehaus.jackson.map.ObjectMapper;

import com.tk.framework.annotations.JsonFilter;
import com.tk.framework.annotations.JsonFilters;
import com.tk.framework.util.EntityClassLoader;
import com.tk.framework.util.json.FieldslFilter;
import com.tk.framework.util.json.WebContext;

/**
 *  TK Automation
 * 
 * @File:FieldsFilterAdvice.java
 * @author TK
 * @Description: * 过滤字段 给方法注解@JsonFilter 和 JsonFilters注解 例如：@JsonFilter(target=AgUserVo.class)
 * 
 *               需要过滤多个对象的字段是可以使用注解：@JsonFilters(value=               {@JsonFilter(target=AgUserVo.class),@JsonFilter(...)
 * 
 * 
 *  }) (暂时未确定过滤多个类的字段时的一些约定)
 *               其中mixin的值保持不变，target为字段对应的类 被注解的方法第一个参数为要请求的字段(以逗号分割的字符串，参数名为fields)
 * 
 * @Notes: <一些特别的描述的信息>
 * @Revision History: <<2014年12月16日下午4:44:18>>, <<TK>>, <<Create>>
 */
public class FieldsFilterAdvice
{

	public static final String fieldsFilterClassName = "com.tk.framework.util.json.FieldslFilter";

	// private static final Logger logger = LoggerFactory.getLogger(FieldsFilterAdvice.class);

	public Object doAround(ProceedingJoinPoint pjp, String fields) throws Throwable
	{

		Class<?> c = null;

		MethodSignature msig = (MethodSignature) pjp.getSignature();
		Method m = msig.getMethod();
		JsonFilter annotation = m.getAnnotation(JsonFilter.class);
		JsonFilters annotations = m.getAnnotation(JsonFilters.class);

		if (annotation == null && annotations == null)
		{
			return pjp.proceed();
		}

		if (fields == null || "".equals(fields))
		{
			return pjp.proceed();
		}

		ObjectMapper mapper = new ObjectMapper();
		if (annotation != null)
		{
			Class<?> target = annotation.target();

			String ignorestr = FieldslFilter.ConversionProperties(fields, target);
			String fieldstr[] = ignorestr.split(",");

			String classfilename = fieldsFilterClassName;
			ClassPool classPool = ClassPool.getDefault();
			classPool.appendClassPath(new ClassClassPath(FieldsFilterAdvice.class));

			// 加入注解类的包
			classPool.importPackage("org.codehaus.jackson.annotate");
			// 从内存中获取制定对象
			CtClass clazz = classPool.get(classfilename);
			clazz.defrost();
			ClassFile classFile = clazz.getClassFile();

			ConstPool constPool = classFile.getConstPool();

			// 读取运行时的注解信息
			AnnotationsAttribute attribute = (AnnotationsAttribute) classFile
					.getAttribute(AnnotationsAttribute.visibleTag);
			Annotation a = new Annotation("org.codehaus.jackson.annotate.JsonIgnoreProperties", constPool);

			MemberValue[] mvs = new MemberValue[fieldstr.length];

			// 组装新的注解信息
			for (int i = 0; i < fieldstr.length; i++)
			{
				mvs[i] = new StringMemberValue(fieldstr[i], constPool);
			}
			ArrayMemberValue amv = new ArrayMemberValue(constPool);
			amv.setValue(mvs);
			a.addMemberValue("value", amv);

			attribute.setAnnotation(a);
			// 修改类的注解信息
			classFile.addAttribute(attribute);
			classFile.setVersionToJava5();

			// 重新加载指定的类、、一个加载器对一个对象只能加载一次。
			EntityClassLoader loader = new EntityClassLoader(FieldsFilterAdvice.class.getClassLoader());
			c = clazz.toClass(loader, null);

			if (target != null)
			{

				mapper.getSerializationConfig().addMixInAnnotations(target, c);

			}
			else
			{
				mapper.getSerializationConfig().addMixInAnnotations(msig.getMethod().getReturnType(), c);

			}

		}
		if (annotations != null)
		{
			JsonFilter[] filters = annotations.value();
			for (JsonFilter filter : filters)
			{
				// Object mixin = filter.mixin();
				Class<?> target = filter.target();

				String ignorestr = FieldslFilter.ConversionProperties(fields, target);
				String fieldstr[] = ignorestr.split(",");

				String classfilename = fieldsFilterClassName;
				ClassPool classPool = ClassPool.getDefault();
				classPool.appendClassPath(new ClassClassPath(FieldsFilterAdvice.class));

				// 加入注解类的包
				classPool.importPackage("org.codehaus.jackson.annotate");
				// 从内存中获取制定对象
				CtClass clazz = classPool.get(classfilename);
				clazz.defrost();
				ClassFile classFile = clazz.getClassFile();

				ConstPool constPool = classFile.getConstPool();

				// 读取运行时的注解信息
				AnnotationsAttribute attribute = (AnnotationsAttribute) classFile
						.getAttribute(AnnotationsAttribute.visibleTag);
				Annotation a = new Annotation("org.codehaus.jackson.annotate.JsonIgnoreProperties", constPool);

				MemberValue[] mvs = new MemberValue[fieldstr.length];

				// 组装新的注解信息
				for (int i = 0; i < fieldstr.length; i++)
				{
					mvs[i] = new StringMemberValue(fieldstr[i], constPool);
				}
				ArrayMemberValue amv = new ArrayMemberValue(constPool);
				amv.setValue(mvs);
				a.addMemberValue("value", amv);

				attribute.setAnnotation(a);
				// 修改类的注解信息
				classFile.addAttribute(attribute);
				classFile.setVersionToJava5();

				// 重新加载指定的类、、一个加载器对一个对象只能加载一次。
				EntityClassLoader loader = new EntityClassLoader(FieldsFilterAdvice.class.getClassLoader());
				c = clazz.toClass(loader, null);

				if (target != null)
				{
					mapper.getSerializationConfig().addMixInAnnotations(target, c);
				}
				else
				{
					mapper.getSerializationConfig().addMixInAnnotations(msig.getMethod().getReturnType(), c);
				}
			}
		}
		HttpServletResponse response = WebContext.getInstance().getResponse();
		response.setContentType("application/json");
		// WebContext.getInstance().getResponse().setContentType("application/json");
		mapper.writeValue(response.getOutputStream(), pjp.proceed());

		return null;

	}

}
/*
 * $Log: av-env.bat,v $
 */