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
        Area obj = new Area();
        obj.setDim(10, 5);
        System.out.println("Area of Rectangle = " + obj.getArea());
    }
}
