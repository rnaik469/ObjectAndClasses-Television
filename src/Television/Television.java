package Television;

public class Television {
	private int channel;
	private int volume;
	private boolean powerOn; // .....is the television On or off?

	// ......Constructor used to give initial values to the attributes
	public Television() {
		powerOn = false;
		volume = 50;
		channel = 3;
	}

	public int getVolume() // ....Used to get Volume
	{
		return volume;
	}

	public int getChannel() // ......Used to get channel
	{
		return channel;
	}

	public boolean getPowerOn()// ....used to get power state
	{
		return powerOn;
	}

	public boolean setchannel(int choosechannel)// ........used to set channel
	{
		boolean changed = false;
		if (choosechannel <= 200 && choosechannel > 0) {
			channel = choosechannel;
			changed = true;

		}
		return changed;
	}

	public void power()// ........toggle for power
	{
		powerOn = !powerOn;
	}

	public int increaseVolume() // ...........volume change
	{
		if (volume < 100) {
			volume = volume + 1;
		}
		return volume;
	}

	public int decreaseVolume() // ...........volume change
	{
		if (volume > 0) {
			volume = volume - 1;
		}
		return volume;
	}

}
