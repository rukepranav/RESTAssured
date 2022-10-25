package utils;

public class PropertyUtils{

    private static final String SQL_USER = "sql.user";
    private static final String SQL_PASSWORD = "sql.pass";
    private static final String SQL_USER_2 = "sql.user2";
    private static final String SQL_PASSWORD_2 = "sql.pass2";
    
    static Utils u = new Utils();
    
    public static String getSqlUser() {
        try {
			return Utils.getGlobalValue(SQL_USER);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }

    public static String getSqlPassword() {
        try {
			return Utils.getGlobalValue(SQL_PASSWORD);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }
    public static String getSqlUser2() {
        try {
			return Utils.getGlobalValue(SQL_USER_2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }

    public static String getSqlPassword2() {
        try {
			return Utils.getGlobalValue(SQL_PASSWORD_2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }


}
