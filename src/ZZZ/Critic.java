package ZZZ;
public class Critic extends UserAbstract{
    String type="Critic";
    public Critic(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void addReview() {

    }

    @Override
    public void addShow() {

    }

    @Override
    public boolean canReview() {
        return true;
    }

    @Override
    public boolean isAdmin() {
        return false;
    }
}
