package part4.strategy.s1;

public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
