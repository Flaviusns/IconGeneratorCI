package IconGenerator;




public class ImageObject{

    private String name;
    private int width;
    private int heigth;
    private int multiplier;


    public ImageObject(int width,int heigth,int multiplier,String name){
        this.heigth = heigth;
        this.width = width;
        this.multiplier = multiplier;
        this.name = String.format("%s-%dx%d@%dx.png", name,width,heigth,multiplier);
        System.out.println(this.name);
    }
}