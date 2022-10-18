public class Hour {
    private int passagersCount;
    private String comment;

    public Hour(int passagersCount, String comment) {
        this.passagersCount = passagersCount;
        this.comment = comment;
    }

    public int getPassagersCount() {
        return passagersCount;
    }

    public String getComment() {
        return comment;
    }

    public void setPassagersCount(int passagersCount) {
        this.passagersCount = passagersCount;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
