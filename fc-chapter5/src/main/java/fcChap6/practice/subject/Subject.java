package fcChap6.practice.subject;

public class Subject {

    private String subName;
    private int subScore;

    public Subject(String subName, int subScore) {
        this.subName = subName;
        this.subScore = subScore;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public int getSubScore() {
        return subScore;
    }

    public void setSubScore(int subScore) {
        this.subScore = subScore;
    }
}
