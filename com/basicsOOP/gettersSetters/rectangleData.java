package Lab3;

class rectangle {
    private int length, width;

    public rectangle() {
        length = 5;
        width = 2;
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public int area() {
        return (length * width);
    }

}

public class rectangleData {
    public static void main(String[] args) {
        rectangle r1 = new rectangle();
        System.out.println(r1.getLength());
        System.out.println(r1.getWidth());
        System.out.println(r1.area());
    }
}