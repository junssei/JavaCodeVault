//Fernandez BSIT-2
import java.util.Scanner;

public class test5{
	public static void main(String args[]){
	Scanner s = new Scanner(System.in);

	float ttmp = 0, htmp = 0, ttempo = 0, htempo = 0;
	float maxtemp = 0, maxhumi = 0, avgtemp = 0, avghumi = 0;

	for(int i=1; i<=3; i++){
		System.out.println("Reading " + i);
		System.out.print("Temperature: ");
		float tempe = s.nextFloat();
		System.out.print("Humidity: ");
		float humi = s.nextFloat();

		ttmp = ttmp + tempe;
		htmp = htmp + humi;

		if(ttempo < tempe){
			maxtemp = tempe;
			ttempo = maxtemp;
		}
		if(htempo < humi){
			maxhumi = humi;
			htempo = maxhumi;
		}
		System.out.println();
		}
		avgtemp = ttmp/3;
		avghumi = htmp/3;

		//Average
		System.out.println("\nAverage Temperature: " + avgtemp);
		System.out.println("Average Humidity " + avghumi);
		//Maximum
		System.out.println("\nMaximum Temperature: " + maxtemp);
		System.out.println("Maximum Humidity: " + maxhumi);

			if(avgtemp < 10){
				System.out.print("\nDominant Weather Condition: Temperate is Cold ");
			} else if (avgtemp > 10 && avgtemp < 25){
				System.out.print("\nDominant Weather Condition: Temperature is Moderate ");
			} else if (avgtemp > 25){
				System.out.print("\nDominant Weather Condition: Temperature is Hot ");
			}

			if(avghumi < 30){
				System.out.println("& Humidity is Dry ");
			} else if (avghumi > 30 && avghumi < 60){
				System.out.println("& Humidity is Moderate ");
			} else if (avghumi > 60){
				System.out.println("& Humidity is Humid ");
			}

		System.out.print("Thank you for using the Weather Analyzer.");
	}
}