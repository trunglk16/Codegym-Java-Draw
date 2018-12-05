public class draw {
    public static void main(String[] args) {
        int choice = -1;
        java.util.Scanner input = new java.util.Scanner(System.in);
        int i;
        int j;


        while (choice != 4) {

            System.out.println("");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (i = 0; i < 3; i++) {
                        System.out.println("");
                        for (j = 0; j < 6; j++) {
                            System.out.print("* ");

                        }
                    }
                    break;
                case 2:
                    for (i = 1; i <= 5; i++) {
                        System.out.println("");
                        for (j = 6 - i; j <= 5; j++) {
                            System.out.print("* ");
                        }
                    }

                    for (i = 1; i <= 5; i++) {
                        System.out.println("");
                        for (j = i; j <= 5; j++) {
                            System.out.print("* ");
                        }
                    }


                    break;
                case 3:
                    for ( i = 1; i <= 9 ; i ++){
                        for( j = 1 ; j <= 9-i; j ++) System.out.print(" ");
                        for(int k = 1; k <=i ; k ++) System.out.print("* ");
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }


        }

    }
}
