package week10;

class Result {
	@Override
	public String toString() {
		return "Result [sno=" + sno + ", cname=" + cname + ", score=" + score + "]";
	}
	private String sno;
	private String cname;
	private double score;
	
	Result(){
		
	}
	Result(String sno, String cname, double score){
		this.score = score;
		this.cname = cname;
		this.sno = sno;
	}
	
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
}
