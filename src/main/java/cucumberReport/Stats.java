package cucumberReport;

public class Stats {
	private int pointsPM;
	private int assistsPM;
	private int rebounds;
	public Stats(int pointsPM,int assistsPM,int rebounds) {
		this.pointsPM=pointsPM;
		this.assistsPM=assistsPM;
		this.rebounds=rebounds;
	}
	public int getPointsPM() {
		return this.pointsPM;
	}
	public int getAssistsPM() {
		return this.assistsPM;
	}
	public int getRebounds() {
		return this.rebounds;
	}

}
