import java.util.Scanner;
public class Btvn1_1{
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc 2 : ax2 + bx + c = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị a :");
        double a = scanner.nextDouble();
        if (a==0){
            System.out.println("Không thể giải phương trình nếu a=0");
            return;
        }
        System.out.println("Nhập giá trị b :");
        double b = scanner.nextDouble();
        System.out.println("nhập giá trị c :");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation= new QuadraticEquation(a,b,c);
        System.out.println("delta =" + quadraticEquation.getDelta());
        if (quadraticEquation.getDelta()==0){
            System.out.println("Phương trình có 1 nghiệm là " + quadraticEquation.motNghiem());
        }else if (quadraticEquation.getDelta()<0){
            System.out.println("Phương trình vô nghiệm ");
        } else if (quadraticEquation.getDelta()>0) {
            System.out.println("Phương trình có 2 nghiệm là ");
            System.out.println("Nghiệm 1 là "+ quadraticEquation.getRoot1()+ "\n Nghiệm 2 là :" + quadraticEquation.getRoot2());

        }
    }
}