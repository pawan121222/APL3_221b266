class AnimalVoice extends Voice2 {
    @Override
    public void prepareVoice() {
        System.out.println("Preparing the animal's voice...");
    }

    @Override
    public void hear() {
        System.out.println("Hearing the animal's voice: Meow! Woof! Moo!");
    }
}