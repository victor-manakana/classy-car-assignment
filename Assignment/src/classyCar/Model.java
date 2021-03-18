package classyCar;

public class Model {
	private String modelName;
    private int yearMan;
	
    public void setModelName(String mName)
    {
        this.modelName=mName;
    }
    
    public String getModelName()
    {
        return modelName;
    }
    
    public int getYearMan()
    {
        return yearMan;
    }
    
    public void setYear(int yMan)
    {
        this.yearMan=yMan;
    }
    
    public static void main(String[] args) 
	{
		
		Model mod = new Model();
		mod.setModelName("Focus RS");
        mod.setYear(2019);
        System.out.println(" Model of the car is a "+mod.getModelName()()+" manufatured in "+mod.getYearMan());
		
	}
    

}
