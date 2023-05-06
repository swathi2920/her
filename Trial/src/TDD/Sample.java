package TDD;

public class Sample {

	public String getNull(String str) 
	{		
		return null;
	}
	
	public String firstChar(String str) 
	{		
		return str.replaceAll("A", "");
	}

	public String onlyFirstChar(String str) 
	{		
		String firstpart = str.substring(0,2);
		String lastpart = str.substring(2);
		return firstpart.replaceAll("A", "")+lastpart;
	}
	public String onlyOneChar(String str) 
	{		
		if(str.length()<2) return str;
		String firstpart = str.substring(0,2);
		String lastpart = str.substring(2);
		return firstpart.replaceAll("A", "")+lastpart;
	}
	public String onlyOneCharA(String str) 
	{		
		if(str.length()<2) return str.replace("A", "");
		String firstpart = str.substring(0,2);
		String lastpart = str.substring(2);
		return firstpart.replaceAll("A", "")+lastpart;
	}
}
