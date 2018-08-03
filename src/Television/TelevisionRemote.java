package Television;

import java.util.Scanner;

public class TelevisionRemote {
	public static void main(String args[]) {
		Television television = new Television();
		Scanner scanner = new Scanner(System.in);
		int option;
		do {
			System.out.println("Enter your option.....");
			System.out.println("1. Switch");
			System.out.println("2. Increase volume");
			System.out.println("3. Decrease Volume");
			System.out.println("4. Change Channels");
			System.out.println("5. Current State Information");
			System.out.println("6. Exit");

			option = scanner.nextInt();

			switch (option) {
			case 1:
				television.power();
				System.out.println("State changed");
				break;

			case 2:
				int volume = television.increaseVolume();
				System.out.println("Volume increased to " + volume);
				break;

			case 3:
				int volumeDecrease = television.decreaseVolume();
				System.out.println("Volume decreased to " + volumeDecrease);
				break;

			case 4:
				System.out.println("Input channel....");
				int choosechannel = scanner.nextInt();
				boolean changed = television.setchannel(choosechannel);
				if (changed)
					System.out.println("Channel changed to " + choosechannel);
				else
					System.out.println("Invalid Input");
				break;

			case 5:
				boolean state = television.getPowerOn();
				int volumeState = television.getVolume();
				int channelState = television.getChannel();
				String power;
				if (state) {
					power = "on";
				} else
					power = "off";
				System.out.println("Power:" + power);
				System.out.println("channel:" + channelState);
				System.out.println("Volume:" + volumeState);
				break;

			case 6:
				break;

			default:
				System.out.println("Invalid Option");
				break;
			}

		} while (option != 6);
		scanner.close();
	}

}
