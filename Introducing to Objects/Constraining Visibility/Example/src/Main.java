public class Main {

    public static void main(String[] args) {
        Cookie cookie = new Cookie(false);
        cookie.bite();
        // Нету доступа до функций:
        // x.isReady();
        // x.crumble();
        cookie.eat();
    }
}