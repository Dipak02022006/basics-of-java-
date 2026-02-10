class Area {
    int length, breadth;

    void setDim(int l, int b) {
        length = l;
        breadth = b;
    }

    int getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Area r = new Area();
        r.setDim(5, 4);
        System.out.println("Area of Rectangle = " + r.getArea());
    }
}
