class Baki {
    private String name;
    private int mark;
    Baki(String n, int m) {
        this.name = n;
        this.mark = m;
    }
    public String getName() {
        return this.name;
    }

    public int getMark() {
        return this.mark;
    }
    public void setName(String n) {
        this.name = n;
    }

    public void setMark(int m) {
        this.mark = m;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Baki baki = new Baki("John", 90);
        System.out.println("Name: " + baki.getName());
        System.out.println("Mark: " + baki.getMark());
        baki.setMark(95);
        baki.setName("Prakash");
        System.out.println("Updated Mark: " + baki.getMark());
        System.out.println("Updated Name: " + baki.getName());

    }
}
