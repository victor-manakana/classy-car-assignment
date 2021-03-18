package classyCar;

public class Make 
{
	private String brandName;
    private String countryOfOrigin;
	
    public  void setBrandName(String bName)
    {
        this.brandName=bName;
    }
    
    public String getBrandName()
    {
        return brandName;
    }
    
    public void setCountryOfOrigin(String cOrigin)
    {
       this.countryOfOrigin=cOrigin;
    }
    
    public String getCountryOfOrigin()
    {
        return countryOfOrigin;
    }
    
	public static void main(String[] args) 
	{
		
		Make obj = new Make();
		obj.setBrandName("Ford");
        obj.setCountryOfOrigin("America");
        System.out.println(" The name of the car is:"+obj.getBrandName()+" originated from :"+obj.getCountryOfOrigin());
		
	}
}





    

    


