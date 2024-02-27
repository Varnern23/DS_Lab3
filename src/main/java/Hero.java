
public class Hero implements HeroInterface {
    private String raceName;
    private Job job;
    private String jobName;
	public Hero(String raceName, Job job, String jobName) {
		this.raceName = raceName;
		this.job = job;
		this.jobName = jobName;
	}


	@Override
	public int attack(int val) {
		return this.job.attack(val, this.getSTR(), this.getDEX(), this.getINT());
	}

	@Override
	public int getSTR() {
		return 20;
	}

	@Override
	public int getDEX() {
		return 20;
	}

	@Override
	public int getINT() {
		return 20;
	}

	@Override
	public String getRaceName() {
		return this.raceName;
	}

	@Override
	public String getJobName() {
		// TODO Auto-generated method stub
		return this.jobName;
	}

}
