package Exercise11;

public class AppUser {
	static String dbUrl;
	static String pFileName;
	String userName;
	String password;

	public AppUser(String userName, String password) {

	this.userName = userName;
	this.password = password;
	}

	static
	{
	dbUrl="jdbc:mySQL://localhost:3306/Users";
	pFileName="Employee.sql";

	}

	@Override
	public String toString() {
	return " userName=" + userName + ", password=" + password+"dbUrl:"+dbUrl+","+"project filename"+pFileName;
	}


	public static void main(String[] args)
	{
	AppUser u1=new AppUser("Yogesh","Yog@$31246");
	System.out.println(u1);
	AppUser u2=new AppUser("Abhiranjan","Abhi@4326");
	System.out.println(u2);

	}
}
