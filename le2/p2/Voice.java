abstract class Voice {
    public final void templateMethod() {
        prepareVoice();
        hear();
    }
    public abstract void prepareVoice();
    public abstract void hear();
}