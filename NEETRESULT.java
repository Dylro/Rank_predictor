import java.util.*;
 class NEETRESULT
{
     public static int srank;
      void main4()
    {
        Scanner sc=new Scanner(System.in);
        Random r = new Random();
        int low,high,airrank=0;
        int phy= 70 + (int) Math.ceil(Math.random() * 101);
        int chem=70 + (int) Math.ceil(Math.random() * 101);
        int bot= 70 + (int) Math.ceil(Math.random() * 101);
        int zoo= 70 + (int) Math.ceil(Math.random() * 101);
        int total=phy+chem+bot+zoo;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Please enter your registration number and centre number to view your NEET result");
        System.out.println("ENTER REGISTRATION NUMBER!");
        int rgno=sc.nextInt();
        System.out.println("ENTER CENTRE NUMBER!");
        int cno=sc.nextInt();
        if((rgno==ADMITCARD.rn)&&(cno==ADMITCARD.tm))
        {
        System.out.println("\f");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("YOUR NEET RESULT AS PER YOUR PERFORMANCE IN THE EXAMINATION:");
        System.out.println("Your marks are as follows:");
        System.out.println("PHYSICS:"+phy+"/180");
        System.out.println("CHEMISTRY:"+chem+"/180");
        System.out.println("BOTANY:"+bot+"/180");
        System.out.println("ZOOLOGY:"+zoo+"/180");
        System.out.println("FINAL SCORE:"+total+"/720");
        System.out.println("USE YOUR NEET PASSWORD TO VIEW YOUR COLLEGE:"+PasswordGenerator.password);
        if(total==0)
        {
        low=350000;
        high=500000;
        airrank=r.nextInt(high-low) + low;
        }
        if(total>=25&&total<=74)
        {
        low=350000;
        high=500000;
        airrank=r.nextInt(high-low) + low;
        }
        if(total>=75&&total<=124)
        {
        low=300000;
        high=450000;
        airrank=r.nextInt(high-low) + low;
        }
        if(total>=125&&total<=174)
        {
        low=250000;
        high=350000;
        airrank=r.nextInt(high-low) + low;
        }
        if(total>=175&&total<=224)
        {
        low=200000;
        high=300000;
        airrank=r.nextInt(high-low) + low;
        }
        if(total>=225&&total<=274)
        {
        low=100000;
        high=250000;
        airrank=r.nextInt(high-low) + low;
        }
        if(total>=275&&total<=324)
        {
        low=60000;
        high=150000;
        airrank=r.nextInt(high-low) + low;
        }
        if(total>=325&&total<=374)
        {
        low=37000;
        high=65000;
        airrank=r.nextInt(high-low) + low;
        }
        if(total>=375&&total<=424)
        {
        low=25000;
        high=37000;
        airrank=r.nextInt(high-low) + low;
        }
        if(total>=425&&total<=475)
        {
        low=13600;
        high=25000;
        airrank=r.nextInt(high-low) + low;
        }
        if(total>=475&&total<=524)
        {
        low=4500;
        high=13000;
        airrank=r.nextInt(high-low) + low;
        }
        if(total>=525&&total<=574)
        {
        low=3000;
        high=4000;
        airrank=r.nextInt(high-low) + low;
        }
        if(total>=575&&total<=624)
        {
        low=1000;
        high=1500;
        airrank=r.nextInt(high-low) + low;
        }
        if(total>=625&&total<=675)
        {
        low=200;
        high=500;
        airrank=r.nextInt(high-low) + low;
        }
        if(total>675)
        {
        low=1;
        high=100;
        airrank=r.nextInt(high-low) + low;
        }
        srank=(25*airrank)/500;
        System.out.println("Your AIR(ALL INDIA RANK):"+airrank);
        System.out.println("Your MAHARASHTRA State rank:"+srank);
        System.out.println("############################################################################################################################################################################################################");
    }
    else
    {
    System.out.println("YOU ARE NOT A REGISTERED CANDIDATE!");
    System.exit(0);
    }
}
}

        