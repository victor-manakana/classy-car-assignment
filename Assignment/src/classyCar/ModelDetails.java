package classyCar;

public class ModelDetails {

	private String driverType;
    private int doors;
    private String color;
    
    public void setDriverType(String typeDriver)
    {
        this.driverType=typeDriver;
    }
    
    public String getDriverType()
    {
        return driverType;
    }
    
    public void setDoors(int dDoors)
    {
        this.doors = dDoors;
    }
    
    public int getDoors()
    {
    	return doors;
    }
    
    public void setColor(String cColor)
    {
    	this.color = cColor;
    }
    
    public String getColor(int yMan)
    {
        return color;
    }
    
    public static void main(String[] args) 
	{
		
		ModelDetails modd = new ModelDetails();
		modd.setDriverType("Right");
        modd.setDoors(2);
        modd.setColor("Matt Grey");
        System.out.println(" Driver type "+modd.getDriverType()+" with "+modd.getDoors()+ " with a nice dash of "+ modd.getColor());
		
	}
}
