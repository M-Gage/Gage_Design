package Observer.EventDelegation;

import java.lang.reflect.Method;

/**
 * @author MiaoGuozhu
 * @describtion 事件（方法）类
 * @date 2019/5/7 16:00
 */
public class Event {
	//要执行方法的对象
	private Object object;
	//要执行的方法名称
	private String methodName;
	//要执行方法的参数
	private Object[] params;
	//要执行方法的参数类型
	private Class[] paramTypes;

	public Event() {

	}

	public Event(Object object, String methodName, Object... args) {
		this.object = object;
		this.methodName = methodName;
		this.params = args;
		contractParamTypes(this.params);
	}

	//根据参数数组生成参数类型数组
	private void contractParamTypes(Object[] params) {
		this.paramTypes = new Class[params.length];
		for (int i = 0; i < params.length; i++) {
			this.paramTypes[i] = params[i].getClass();
		}
	}


	public Object getObject() {
		return object;
	}

	/**
	 * 根据该对象的方法名，方法参数，利用反射机制，执行该方法
	 *
	 * @throws Exception
	 */
	public void invoke() throws Exception {
		//生成object（传进来的类）里面的MethodName与传进来一致的方法
		Method method = object.getClass().getMethod(this.getMethodName(), this.getParamTypes());
		if (null == method) {
			return;
		}
		//执行方法
		method.invoke(this.getObject(), this.getParams());
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public Object[] getParams() {
		return params;
	}

	public void setParams(Object[] params) {
		this.params = params;
	}

	public Class[] getParamTypes() {
		return paramTypes;
	}

	public void setParamTypes(Class[] paramTypes) {
		this.paramTypes = paramTypes;
	}
}
