package assignment3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) {
		MainApplication app = new MainApplication();
		app.calculatateShipping();
	}

	private void calculatateShipping() {
		Zone zone = Zone.OTHER;
		Scanner scan = new Scanner(System.in);

		System.out.println("Please Enter the number of Packages");
		int numOfPackages = scan.nextInt();

		System.out.println("Are you a student? if yes, press y");
		String st = scan.next();
		System.out.println("Are you age above of 65? if yes, press y");
		String overAge = scan.next();
		String bValue = "y";

		String result = "";
		for (int i = 0; i < numOfPackages; i++) {

			System.out.println("Please Enter description Item number " + (i + 1));
			String description = scan.next();

			System.out.println("Please Enter weight of your " + description);
			double weight = scan.nextDouble();

			System.out.println("Please select the State IA, MT, OR, CA, TX, UT, FL, MA, OH or OTHER");
			String state = scan.next();
			switch (state.toUpperCase()) {
			case "IA":
				zone = Zone.IA;
				break;
			case "MT":
				zone = Zone.MT;
				break;
			case "OR":
				zone = Zone.OR;
				break;
			case "CA":
				zone = Zone.CA;
				break;
			case "TX":
				zone = Zone.TX;
				break;
			case "UT":
				zone = Zone.UT;
				break;
			case "FL":
				zone = Zone.FL;
				break;
			case "MA":
				zone = Zone.MA;
				break;
			case "OH":
				zone = Zone.OH;
				break;
			default:
				zone = Zone.OTHER;
				break;
			}

			List<Service> mailService = Arrays.asList(new UPS(weight, description), new USMail(weight, description),
					new FedEx(weight, zone, description), new DHL(weight, description));

			String tempService = mailService.get(0).getClass().getSimpleName();
			double tempValue = mailService.get(0).getRate();

			for (int k = 1; k < mailService.size(); k++) {
				if (tempValue > mailService.get(k).getRate()) {
					tempService = mailService.get(k).getClass().getSimpleName();
					tempValue = mailService.get(k).getRate();
				}
			}

			if (bValue.equalsIgnoreCase(st)) {
				tempValue += (tempValue * 0.10);
			}
			if (bValue.equalsIgnoreCase(overAge)) {
				tempValue += (tempValue * 0.15);
			}

			result += String.format("%s  %s  %.2f\n", description, tempService, tempValue);

		}
		System.out.println();
		System.out.println(result);

		System.out.println("Do you want to ship some other items? if yes press y");
		String bool = scan.next();
		if ("y".equalsIgnoreCase(bool)) {
			calculatateShipping();
		}

		scan.close();
	}

}
