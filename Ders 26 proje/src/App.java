import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner girdi=new Scanner(System.in);

/* 
        int sicaklik;

        System.out.println("Günün sıcaklığını giriniz.");
        sicaklik=girdi.nextInt();

        if((sicaklik>=5) && (sicaklik<=30))
        {
            System.out.println("Bu havada sinemaya gidilir.");

        }
        else if(sicaklik>30)
        {
            System.out.println("Bu havada havuza gidilir");
        }
        else if(sicaklik<5)
        {
            System.out.println("Bu havada kayak yapmaya gidilir.");
        }

*/
        int a,b,c;

        System.out.println("Sıralanmasını istediğiniz sayıları giriniz.");

        a=girdi.nextInt();
        b=girdi.nextInt();
        c=girdi.nextInt();

        if((a>b) && (a>c))
        {
            if(b>c)
            {
                System.out.println(a + ">"+b+">"+c );
            }
            else if(b<c)
            {
                System.out.println("a>c>b");
            }
        }
        
        if((b>a) && (b>c))
        {
            if(a>c)
            {
                System.out.println(b + ">"+a+">"+c );
            }
            else if(a<c)
            {
                System.out.println("b>c>a");
            }
        }
        
        if((c>b) && (c>a))
        {
            if(b>a)
            {
                System.out.println(c + ">"+b+">"+a );
            }
            else if(b<a)
            {
                System.out.println("c>a>b");
            }
        }



























    }
}
