import java.util.*;
public class ADMITCARD
{
    public static int tm,rn;
    String examcentre;
    void centreno()
    {
        Random gen=new Random();
        for(int i=0;i<1;i++)
        {
           tm=gen.nextInt(80000)+1;
        }
    }
 void displayadmitcard()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your REGISTRATION  NUMBER to print ADMIT CARD");
    rn=sc.nextInt();
    if(rn==PAYMENT.tp)
    {
        System.out.println("\f");
        System.out.println("*****************************************************************************************************************");
        System.out.println("REGISTRATION NUMBER:"+PAYMENT.tp);
        System.out.println("AADHAR NUMBER:"+FILLFORM.aadharno);
        System.out.println("NAME OF CANDIDATE:"+FILLFORM.nm);
        System.out.println("MOTHER'S NAME:"+FILLFORM.mn);
        System.out.println("FATHER'S NAME:"+FILLFORM.fn);
        System.out.println("CATEGORY:"+FILLFORM.cg);
        System.out.println("GENDER:"+FILLFORM.gen);
        System.out.println("NATIONALITY:"+FILLFORM.nat);
        System.out.println("STATE:"+FILLFORM.state);
        System.out.println("EXAMINATION DATE:07/05/2018(SUNDAY)");
        System.out.println("EXAMINATION TIMING:10.00A.M.-1.00P.M.");
        System.out.println("CENTRE NO.:"+tm);
        System.out.println("YOUR EXAM CENTRE:"+examcentre);
        System.out.println();
        System.out.println();
        System.out.println("YOUR SIGNATURE:####"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"NEET ADMINISTRATOR:****");
        System.out.println();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
    else
    System.out.println("YOU ARE NOT A REGISTERED CANDIDATE!!");
}
void CENTREEXAM()
    {
        Scanner sc=new Scanner(System.in);
        if(FILLFORM.state.equalsIgnoreCase("MAHARASHTRA"))
        examcentre="RYAN INTERNATIONAL SCHOOL 90 FEET ROAD ASHA NAGAR, OPP SANSKRUTI COMPLEX, KANDIVLI (EAST) , MUMBAI, MAHARASHTRA 400101";
        
        if(FILLFORM.state.equalsIgnoreCase("GUJARAT"))
        examcentre="NAVRACHANA SCHOOL, Vasna-Bhayli Road, Vadodara, Gujarat 391410";
        
        if(FILLFORM.state.equalsIgnoreCase("HARYANA"))
        examcentre="DELHI PUBLIC SCHOOL,Sector 40-C, Chandigarh, 160036";
        
        if(FILLFORM.state.equalsIgnoreCase("KERALA"))
        examcentre="CHRIST NAGAR SCHOOL,Sector 40-C, Chandigarh, 16003Keston rd, Kaudiar, Thiruvananthapuram, Kerala 695003";
        
        if(FILLFORM.state.equalsIgnoreCase("RAJASTHAN"))
        examcentre="BANSAL PUBLIC SCHOOL,Near Medical College, Ganesh Nagar, Kota, Rajasthan 324005";
        
        if(FILLFORM.state.equalsIgnoreCase("GOA"))
        examcentre="DON BOSCO HIGHER SECONARY SCHOOL,Don Bosco Campus Panjim, Panjim, Goa 403001";
        
        if(FILLFORM.state.equalsIgnoreCase("TELANGANA"))
        examcentre="OAKRIDGE INTERNATIONAL SCHOOL, Nanakramguda Road, Near Lanco Hills, Khajaguda, Gachibowli, Hyderabad, Telangana 500008";
        
        if(FILLFORM.state.equalsIgnoreCase("PUNJAB"))
        examcentre="B.C.M SCHOOL,200 Feet Road, Near Gram Level Convent School, Gurudwara Rd, Basant Avenue, Janta Enclave,Ludhiana, Punjab 141003";
        
        if(FILLFORM.state.equalsIgnoreCase("KARNATAKA"))
        examcentre="NATIONAL PUBLIC SCHOOL,12 A Main, Near BSNL Office, HAL II Stage, Bengaluru, Karnataka 560008";
        
        if(FILLFORM.state.equalsIgnoreCase("ASSAM"))
        examcentre="DISPUR GOV HIGHER SECONDARY SCHOOL,Sohid Dilip Huzuri Path, Mathura Nagar, Dispur, Guwahati, Assam 781036";
        
        if(FILLFORM.state.equalsIgnoreCase("ODISHA"))
        examcentre="KIIT INTERNATIONAL SCHOOL,KIIT campus 9, Bhubaneswar, Odisha 751024";
        
        if(FILLFORM.state.equalsIgnoreCase("UTTARAKHAND"))
        examcentre="St. Joseph's Academy,12, Rajpur Road, Dehradun, Uttarakhand 248001";
        
        if(FILLFORM.state.equalsIgnoreCase("SIKKIM"))
        examcentre="Taktse International School,Gangtok, Sikkim 737107";
        
        if(FILLFORM.state.equalsIgnoreCase("JHARKHAND"))
        examcentre="Bishop Westcott Boys' School,Namkum, Ranchi, Jharkhand 834010";
        
        if(FILLFORM.state.equalsIgnoreCase("MANIPUR"))
        examcentre="Don Bosco High School,Chingmeirong, Imphal, Manipur 795010";
        
        if(FILLFORM.state.equalsIgnoreCase("NAGALAND"))
        examcentre="Northfield School,Khikha Kohima Nagaland, National Highway 61, Kohima, Nagaland 797004";
        
        if(FILLFORM.state.equalsIgnoreCase("MEGHALAYA"))
        examcentre="St. Edmund's School,Laitumkhrah, Shillong, Meghalaya 793003";
        
        if(FILLFORM.state.equalsIgnoreCase("CHHATISGARH"))
        examcentre="Bharat Mata Higher Secondary School,GE Road, Tatibandh, Raipur, Chhattisgarh 492001";
        
        if(FILLFORM.state.equalsIgnoreCase("TRIPURA"))
        examcentre="Holy Cross School,Durjaynagar, Agartala, Tripura 799009";
        
        if(FILLFORM.state.equalsIgnoreCase("MIZORAM"))
        examcentre="St. Paul's Higher Secondary School,Dam veng, Tlangnuam, Aizawl, Mizoram 796005";
        
        if(FILLFORM.state.equalsIgnoreCase("UP"))
        examcentre="City Montessori School,Sector D, Kanpur Road, LDA Colony, Lucknow, Uttar Pradesh 226012";
        
        if(FILLFORM.state.equalsIgnoreCase("JK"))
        examcentre="Burn Hall School,Temple Path, Munshi Bagh, Srinagar, Jammu and Kashmir 190001";    
        
        if(FILLFORM.state.equalsIgnoreCase("AP"))
        examcentre="Podar International School,Survey No. 84/2, Kathora, Opposite Pote Farm,, Kathora Road, Amravati, Andhra Pradesh 444602";
        
        if(FILLFORM.state.equalsIgnoreCase("TN"))
        examcentre="Vidya Mandir Senior Secondary School,24, Royapettah High Road, Mylpore, Chennai, Tamil Nadu 600004";
        
        if(FILLFORM.state.equalsIgnoreCase("WB"))
        examcentre="Birla High School,1, Moira St, Elgin, Kolkata, West Bengal 700017";
        
        if(FILLFORM.state.equalsIgnoreCase("MP"))
        examcentre="Campion School,E-7, Arera Colony, Bhopal, Madhya Pradesh 462016";
        
        if(FILLFORM.state.equalsIgnoreCase("HP"))
        examcentre="Bishop Cotton School,Shimla Bypass, Near khalini, Shimla, Himachal Pradesh 171002";
        
        if(FILLFORM.state.equalsIgnoreCase("BIHAR"))
        examcentre="St. Michael's High School,Digha Ghat, Patna, Bihar 800011";
        
    }        
}

