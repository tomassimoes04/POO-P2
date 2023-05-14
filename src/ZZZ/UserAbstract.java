package ZZZ;

import dataStructures.Array;
import dataStructures.ArrayClass;

public abstract class UserAbstract implements  User{
    String name;
    Array<Review>reviews;

    public UserAbstract(String name) {
        this.name = name;
        reviews=new ArrayClass<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public abstract String getType();

    @Override
    public abstract void addReview();

    @Override
    public abstract void addShow();

    @Override
    public abstract boolean canReview() ;

    @Override
    public abstract boolean isAdmin();
}
