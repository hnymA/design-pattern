package part6.chain_of_responsibility.a4;

public class NoSupport extends Support {

    public NoSupport(String name) {
        super(name);
    }

    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
