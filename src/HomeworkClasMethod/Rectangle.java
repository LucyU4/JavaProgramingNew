package HomeworkClasMethod;

public class Rectangle {
  /*
    Create a class Rectangle

create instance variables:
    base, height, perimeter, area

create instance methods:

    - toString(): [return String]
        returns all the information of the Rectangle objects, including the perimeter and area

    - calculatePerimeter(): [void]
        calculate the perimeter and store the result into the perimeter instance variable

        a perimeter of a rectangle is the 4 sides added together

    - calculateArea(): [void]
        calculate the area and store the result into the area instance variable

        an area of a rectangle is the height x width
   */
    int base;
    int height;
    int perimeter;
    int area;

    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", height=" + height +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
     public void calculatePerimeter(){
        perimeter= ((base*2) + (height *2));

     }
     public void calculateArea(){
        area = height *base;
     }
}
