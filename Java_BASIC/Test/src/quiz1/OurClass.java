package quiz1;

public class OurClass {
	private int maxScore;
	private String maxScoreName;
	private int minScore;
	private String minScoreName;
	
	OurClass(Student std[]){
		this.maxScore = std[0].getScore();
		this.minScore = std[0].getScore();
		for(int i=0;i<std.length;i++){
			if(this.maxScore <= std[i].getScore()){
				this.maxScore = std[i].getScore();
				this.maxScoreName = std[i].getName();
				
			}
			if(this.minScore > std[i].getScore()){
				this.minScore = std[i].getScore();
				this.minScoreName = std[i].getName();
			}
		}
	}

	public String getMaxScoreName() {
		return this.maxScoreName;
	}

	public String getMinScoreName() {
		return this.minScoreName;
	}
	
	
}
