package utils;

public enum CowinResource {
	
	GenerateOTP("/v2/auth/public/generateOTP"),
	GetStates("/v2/admin/location/states"),
	GetDistricts("/v2/admin/location/districts"),
	FindByPin("/v2/appointment/sessions/public/findByPin"),
	FindByDistrict("/v2/appointment/sessions/public/findByDistrict"),
	Find7DayData("/v2/appointment/sessions/public/calendarByPin");
	
	private String resource;
	
	CowinResource(String resource)
	{
		this.resource=resource;
	}
	
	public String getResource()
	{
		return resource;
	}
	


}
