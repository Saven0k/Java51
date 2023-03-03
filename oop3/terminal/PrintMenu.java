public class PrintMenu {
    // Single Responsbility Principle
    private String menu;

    public PrintMenu(String menu) {
        this.menu = menu;
        System.out.println(this.menu);
    }
}
