class Box{
    int height, width, depth;

    Box (int h, int w, int d ){
        this.height = h;
        this.width = w;
        this.depth = d;
    }

    void getVolume(){
        System.out.println("Volume : " + height * width * depth);
    }

    public static void main(String[] args){
        Box box1 = new Box(10, 10, 5);
        box1.getVolume();
    }
}
