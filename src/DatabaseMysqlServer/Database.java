package DatabaseMysqlServer;

public class Database {
	static Database obj[]=new Database[5];
    static int i=0;
    String userName;
    String password;
    String  url;
     
    public Database(String userName , String password, String url)
    {
    	super();
    	this.userName= userName;
    	this.password=password;
    	this.url = url;
    	
    	System.out.println("Object:"+i);
    	System.out.println(this.userName);
    	System.out.println(this.password);
    	System.out.println(this.url);
    	System.out.println(getClass());
    	System.out.println(hashCode());
    	System.out.println("------------------");
    	
    }
	public static Database getInstance(String username,String password,String url)
	{
		if((i<10)&&(obj[i]==null))
		{
			obj[i] = new Database(username , password,url);
		   return obj[i++];
		}
		else
		{
			if(i==10)
			{
				i--;
				System.out.println("Object Limited to 10");
			}
			return obj[i];
			
			}
          			
		}
}
