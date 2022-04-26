public class Hamster {

    public String speak() {
        return "Squeak!";
    }

    public String exercise() {
        //первый голос перед упражнением
        return this.speak() + " Running on wheel";
    }
}
