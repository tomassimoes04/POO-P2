package ZZZ;
public class Admin extends UserAbstract{
    String type="Admin";
    public Admin(String name) {
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
        return false;
    }

    @Override
    public boolean isAdmin() {
        return true;
    }
}
