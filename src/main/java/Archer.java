
public class Archer extends Job {

	public int attack(int val, int str, int dex, int tel) {
		return (int)(dex * 1.5 * val);
	}

}
