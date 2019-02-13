public class Square{
    public static void main(String[] args) {
        int width = Integer.parseInt(args[0]);
        int height = Integer.parseInt(args[0]);

        for(int i = 0; i < height; i++){
            if(i == 0 || i == height - 1){
                for(int w = 0; w < width; w++){
                    System.out.print("#");
                }
                System.out.println("");
            }
            else{
                for(int w2 = 0; w2 < width; w2++){
                    if(w2 == 0 || w2 == width - 1){
                        System.out.print("#");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}