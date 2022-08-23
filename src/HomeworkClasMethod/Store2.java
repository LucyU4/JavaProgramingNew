package HomeworkClasMethod;

public class Store2 {
    public static void main(String[] args) {
        Rectangle object = new Rectangle();


        object.base = 12;
        object.height = 10;
        object.calculatePerimeter();
        object.calculateArea();

        System.out.println(object);

    }
}
