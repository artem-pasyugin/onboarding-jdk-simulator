public class Cookie {
    private boolean isReady;        // [1]

    public Cookie(boolean isReady) {
        this.isReady = isReady;
    }

    private void crumble() {      // [2]

        System.out.println("крошиться");
    }

    public void bite() {           // [3]

        System.out.println("кусать");
    }

    public void eat() {             // [4]
        isReady = true;             // [5]
        crumble();
        bite();
    }
}