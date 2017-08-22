package newWish;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CustomerLogin {

	// Note: We have assumed that the input file has dates in ascending order as we get logs in ascending order. 
	// Input file data are stored in inputData HashMap<String, ArrayList<LocalDate>>.
	// consecutiveCustomers is the list of those customers that log in on four consecutive days.
	// getConsecutiveCustomers is the method which calculate list of those customers that log in on four consecutive days.
	
	static HashMap<String, ArrayList<LocalDate>> inputData=new HashMap<String, ArrayList<LocalDate>>();
	static ArrayList<String> consecutiveCustomers =new ArrayList<String>();
	
	@SuppressWarnings("resource")
	public static void main(String[] args)throws IOException,FileNotFoundException {

		try{
			FileInputStream inputFile=new FileInputStream("F:\\Java\\sokrati\\test.txt");
			BufferedReader fileRead=new BufferedReader(new InputStreamReader(inputFile));
			String currentLine="";

			while((currentLine=fileRead.readLine())!=null)
			{
				String[] splitData=currentLine.split("\\\\t"); // split using \t
				String getDate=splitData[0].trim(); // extracting date string
				DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MM/dd/yyyy");
				LocalDate date=LocalDate.parse(getDate, formatter);
				if(inputData.containsKey(splitData[1]))
				{
					if(!(inputData.get(splitData[1]).contains(date)))
					{
						inputData.get(splitData[1]).add(date);
					}
				}else
				{
					ArrayList<LocalDate> dateList=new ArrayList<LocalDate>();
					dateList.add(date);
					inputData.put(splitData[1], dateList);
				}
			}
			
			getConsecutiveCustomers();
			if(!(consecutiveCustomers.size()==0))
			{
				System.out.println("List of those customers that log in on four consecutive days: "+consecutiveCustomers);
			}
			else
			{
				System.out.println("No Customer log in on four consecutive days");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@SuppressWarnings("rawtypes")
	private static void getConsecutiveCustomers() {

		for(Map.Entry mapValues:inputData.entrySet()){
			
	        ArrayList getDateList=inputData.get(mapValues.getKey());
	        LocalDate currentLoginDate=(LocalDate) getDateList.get(0);
	        int index=1;
	        int counter = 0;
	        while(currentLoginDate.isBefore((LocalDate) getDateList.get(getDateList.size()-1)))
	        {
	        	if(getDateList.contains(currentLoginDate))
	        	{
	        		if(currentLoginDate.plus(1,ChronoUnit.DAYS).isEqual((LocalDate) getDateList.get(index)))
	        		{
	        			counter++;
	        		}
		        	else
		        	{
		        		counter=0;
		        	}
	        		
		        	if(!(index==(getDateList.size()-1)))
		        	{
		        		index++;
		        	}
		        	
		        	currentLoginDate=currentLoginDate.plus(1,ChronoUnit.DAYS);
		        	
	        	}else
	        	{
	        		currentLoginDate=currentLoginDate.plus(1,ChronoUnit.DAYS);
	        	}
	        }
	        if(counter >= 3)
	        {
	        	consecutiveCustomers.add((String) mapValues.getKey());
	        }
	        counter =0;
		}
	}	
}
