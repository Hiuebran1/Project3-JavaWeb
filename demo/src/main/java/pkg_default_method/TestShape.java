package pkg_default_method;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();              // Gọi phương thức override
        circle.setColor("Đỏ");      // Gọi default method từ interface
    }
}
