package utils;

public enum DatePatterns {
	
	DD_MM_YYYY("dd/MM/yyyy"),
	D_M_YYYY("d/M/yyyy"),
    YYYY_MM_DD("yyyy-MM-dd"),
    YYYY_DD_MM("yyyy-dd-MM");
    
    private String date;
    
    DatePatterns(String date)
	{
		this.date=date;
	}
	
	public String getDatePattern()
	{
		return date;
	}


}
