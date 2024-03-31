
package Defaultexception;

class DefaultExceptionExample {
    public static void main(String[] args)
    {
        draw();
        System.out.println(10/0);
    }
    public static void draw()
    {
        Show();
        System.out.print("Hi");

    }
    public static void Show()
    {
        System.out.print("Hello");

    }
}
