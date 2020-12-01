import java.util.Scanner;
import javax.swing.JOptionPane;
class Rectangle {
    private double length;
    private double width;


    public void setlength(double length) {
        if (length < 0 || length > 20) {
            throw new IllegalArgumentException("For input length:0.0");


        }
        this.length = length;
    }

    public void setwidth(double width) {
        if (width < 0 || width > 20) {
            throw new IllegalArgumentException("For input width:0.0");
        }
        this.width = width;
    }

    public double getLength() { return length;}
    public double getWidth() { return width; }
    public double getPerimeter() { return (length + width) * 2; }
    public double getArea() { return length * width; }


    public class Task8_4 {
        public void main(String args[]) {
            Rectangle r1 = new Rectangle();


            String length, width;

            length = JOptionPane.showInputDialog("Enter Length (0.0 <L <20.0)");


            width = JOptionPane.showInputDialog("Enter Width (0.0 <W <20.0)");

            double d1, d2;


            d1 = Double.parseDouble(length);

            d2 = Double.parseDouble(width);

            r1.setlength(d1);
            r1.setwidth(d2);

            while (true) {
                JOptionPane.showMessageDialog(null, "Length = " + r1.getLength() +
                                "\nWidth = " + r1.getWidth() + "\nPerimeter = " +
                                r1.getPerimeter() + "\nArea = " + r1.getArea(), "Rectangle",
                        JOptionPane.PLAIN_MESSAGE);
                try {
                    Rectangle r2 = new Rectangle();
                } catch (IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(null, "Illegal Argument Exception:",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
                break;
            }
        }
    }
}
