public class Opinion {
    private int opinionType;
    private String opinionText;
    private User fromUser;
    private User toUser;

    public Opinion(int opinionType, String opinionText, User fromUser, User toUser) {
        this.opinionType = opinionType;
        this.opinionText = opinionText;
        this.fromUser = fromUser;
        this.toUser = toUser;
    }

    @Override
    public String toString() {
        return "Opinion{" +
                "opinionType=" + opinionType +
                ", opinionText='" + opinionText + '\'' +
                ", fromUser='" + fromUser + '\'' +
                ", toUser='" + toUser + '\'' +
                '}';
    }
}
