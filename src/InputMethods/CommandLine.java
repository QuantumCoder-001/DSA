package InputMethods;

class  CommandLine {
    public static void main(String[] args) {
        //(always in string)
//        String fName = args[0];
//        String lName = args[1];
//        System.out.println(fName.toLowerCase() +" "+ lName.toUpperCase());
//        int aint = Integer.parseInt(args[2]);
//        int bint = Integer.parseInt(args[3]);
//        int result = aint + bint;
//        System.out.println(result);
        int sum=0;
        for(int i=0;i<args.length;i+=1){
            sum+=Integer.parseInt(args[i]);
        }
        System.out.println("Result:"
                +sum);
    }
}
