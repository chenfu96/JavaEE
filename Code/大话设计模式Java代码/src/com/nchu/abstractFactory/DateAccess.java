package com.nchu.abstractFactory;

public class DateAccess {

	private static String assemblyName = "com.nchu.abstractFactory.SqlserverDepartment";
	private static String db = "com.nchu.abstractFactory.SqlserverUser";
	public static IUser createUser() throws Exception{
		Class<?> sqlServerUser = Class.forName(db);
		Object obj = sqlServerUser.newInstance();
		
		return (IUser)obj;
	}
	
	public static IDepartment createDepartment() throws Exception{
		Class<?> sqlServerDepartment = Class.forName(assemblyName);
		Object obj = sqlServerDepartment.newInstance();
		return (IDepartment)obj;
	}
}
