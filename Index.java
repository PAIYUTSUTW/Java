import java.io.*; 
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.FileInputStream;

public class Index
{
    public static void main(String[] args) throws IOException
    {    int Max=128;
		 String Allname = new String();
		 String Allphone = new String();
		 String Allyear = new String();
		 String Allmonth = new String();
		 String Allday = new String();
		 String Allclass = new String();
		 String Allemail = new String();
		 String All[][]= new String[Max][7];
		 String All2[]= new String[Max];
		 String All3[][]= new String[Max][7];
		 int    All4[][]=new int[Max][7];
		 int    All5[][]=new int[Max][7];
		 String    All6[][]=new String[Max][7];
		 String    All8[][]=new String[Max][7];
		 String    All7[]=new String[Max];
         int i=0;
         int  k= 0;
		 int j=0;
	     int updown=0;
		 int printtofile=0;
		 int eoc=0;
	 PrintWriter outputStream=null;
	   FileReader fr=null;
	   BufferedReader br=null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("account");
		String account = sc.next();
		System.out.println("password");
		String password = sc.next();
		System.out.println("0.English\n1.Chinese");
		eoc=sc.nextInt();
		while((account.equals("cis"))&&(password.equals("1234")))
		{    
	         
		      fr=new FileReader("Index.txt");
               br=new BufferedReader(fr);
			   k=0;
			  while(br.readLine()!=null){ k++;}
		       
	        System.out.println("your data amount "+k);
			   
			if(eoc==0){   
	        System.out.println("1.writedata\n2.Read\n3.Display\n4.search data\n5.Manager\n6.copy to other place\n7.end");}
			if(eoc==1){
			System.out.println("1.寫入資料\n2.讀取存檔\n3.顯示資料\n4.搜索資料\n5.管理\n6.備份至其他路徑\n7.結束程式");}
			
			
			
			
			
			String select = sc.next();
			 
			
			
			while(select.equals("1"))//writedata
			{
				j=0;i=0;
             outputStream=null;
	       System.out.println("1.do you want reset\n2.inherit");
		   int reset=sc.nextInt();
		   
           if(reset==1)
		   {
			   i=0;
			   
		   }
		   
		   if(reset==2)
		   {
			   i=k;
		   }			   
			outputStream = 
                 new PrintWriter(new FileOutputStream("Index.txt"));
           
		   
		     
			
				
				
				for(;true;++i){
				
				
				System.out.println("input your name:   if you want to close , please enter stop ");
                String name = sc.next();
				All[i][0]= name+" ";
				if(name.equals("stop"))
				{
				All[i][0]="";
                 				
				break;
                }
				System.out.println("input your mobile phone number:");
                String phone = sc.next( );
				
				if((phone.indexOf("(")!=-1)&&(phone.indexOf(")")!=-1))
				{All[i][1] = phone;}
			    else{
					if(i==0)break;
					for(;j<=i-1;j++)
			    {
                outputStream.println(All[j][0]+" "+All[j][1]+" "+All[j][2]+" "+All[j][3]+" "+All[j][4]+" "+All[j][5]+" "+All[j][6]); }
				System.out.println("wrong format"); break;}
				System.out.println("input yor year");
                String year = sc.next();
				All[i][2]=year;
				
				System.out.println("input yor month");
				String month = sc.next();
				All[i][3] = month;
				
				System.out.println("input yor day");
				String day = sc.next();
				All[i][4] = day;
				
				System.out.println("input yor classification");
				String classification = sc.next();
				All[i][5] =classification;
				
				System.out.println("input yor email");
				String email = sc.next();
				if(email.indexOf("@")!=-1)
				{All[i][6] = email;}
			    
				else{
					if(i==0)break;
					for(;j<=i-1;j++)
			    {
                outputStream.println(All[j][0]+" "+All[j][1]+" "+All[j][2]+" "+All[j][3]+" "+All[j][4]+" "+All[j][5]+" "+All[j][6]); }
				System.out.println("wrong format"); break;}
			    System.out.println("Writing to file.");
				
				
				
				
				
				
				for(;j<=i;j++){
                outputStream.println(All[j][0]+" "+All[j][1]+" "+All[j][2]+" "+All[j][3]+" "+All[j][4]+" "+All[j][5]+" "+All[j][6]);}
                
				
				if(reset==2){break;}
			
			}

              outputStream.close( );
			  break;
			}
			
			while(select.equals("2"))
			{
				
				  
		       try{
		       fr=new FileReader("Index.txt");
			   br=new BufferedReader(fr);
			   
			   StringTokenizer stoken = null;
			        for(j=0 ; j<k ;j++ ){
				     stoken = new StringTokenizer(br.readLine());
					 br.mark(10000);
					 All[j][0]= stoken.nextToken( );
					 All[j][1]= stoken.nextToken( );
					 All[j][2]= stoken.nextToken( );
					 All[j][3]= stoken.nextToken( );
					 All[j][4]= stoken.nextToken( );
				     All[j][5]= stoken.nextToken( );
				     All[j][6]= stoken.nextToken( );
			     }
			  
			   br.reset();}catch (Exception ex){System.out.println("something wrong");}
				break;
			}
			
			while(select.equals("3"))//AllData
			{
				 if(eoc==0){
				 System.out.println("1.All\n2.Page\n3.class\n4.pageclass\n5.kind_display\n6.back");}
				 if(eoc==1){System.out.println("1.顯示所有資料\n2.分頁顯示所有資料\n3.顯示特定欄位\n4.分頁顯示特定欄位\n5.以種類顯示資料\n6.返回");}
				String AllorOne=sc.next();
				
		         for(int y=0;y<k;y++) /////////////////////////////////////
				 {
					 All3[y][0]=All[y][0];
					 All3[y][1]=All[y][1];
					 All3[y][2]=All[y][2];
					 All3[y][3]=All[y][3];
					 All3[y][4]=All[y][4];
					 All3[y][5]=All[y][5];
					 All3[y][6]=All[y][6];
				 }
					for(int y=0;y<k;y++) /////////////////////////////////////
				 {
					 All6[y][0]=All[y][0];
					 All6[y][1]=All[y][1];
					 All6[y][2]=All[y][2];
					 All6[y][3]=All[y][3];
					 All6[y][4]=All[y][4];
					 All6[y][5]=All[y][5];
					 All6[y][6]=All[y][6];
				 }
					for(int y=0;y<k;y++) /////////////////////////////////////
				 {
					 All8[y][0]=All[y][0];
					 All8[y][1]=All[y][1];
					 All8[y][2]=All[y][2];
					 All8[y][3]=All[y][3];
					 All8[y][4]=All[y][4];
					 All8[y][5]=All[y][5];
					 All8[y][6]=All[y][6];
				 }
					try{
					for(int y=0;y<k;y++)
					{
						for(int x=2;x<5;x++)
						{
							String a=All3[y][x];
							int value = Integer.parseInt(a);
							All4[y][x]=value;
							All5[y][x]=value;
						}
						
					}}catch(Exception e){System.out.println("Wrong data format");break;}///////////////////////////////////////
					
					while(AllorOne.equals("1"))
					{
					while(updown==1)
					{
						 
			 
	               System.out.println("Select the data\n2.year\n3.month\n4.day");
                 int num=sc.nextInt();
                  for(int s=0;s<k;s++)
               {
                       All7[s]= All[s][0]+" "+All[s][1]+" "+All[s][2]+" "+All[s][3]+" "+All[s][4]+" "+" "+All[s][5]+" "+" "+All[s][6];
	  
					  
			   }
			 
			 
			 for (int f=k-1;f>=0;f=f-1)
             {
                  for (int d=0;d<f;d=d+1)
                {
                      if (All5[d][num]>All5[f][num])
                      {
                      int tmp=All5[d][num];
                       All5[d][num]=All5[f][num];
                      All5[f][num]=tmp;
					  String tmp2=All7[d];
					  All7[d]=All7[f];
					  All7[f]=tmp2;
                      }
                }
             }
			 
			 
			 for(int s=0;s<k;s++)
				{
					System.out.println(All7[s]);
				}
				while(printtofile==1)
				{
					
	       
             outputStream = 
                 new PrintWriter(new FileOutputStream("Index.txt"));
				  for(int s=0;s<k;s++)
				{
					outputStream.println(All7[s]);
				}
				outputStream.close();
				break;
				}
				break;
				}///////////////////////
					
					while(updown==2)
		     {
				

			   
                    System.out.println("Select the data\n2.year\n3.month\n4.day");
                 int num=sc.nextInt();
                  for(int s=0;s<k;s++)
               {
                       All2[s]= All[s][0]+" "+All[s][1]+" "+All[s][2]+" "+All[s][3]+" "+All[s][4]+" "+" "+All[s][5]+" "+" "+All[s][6];
	  
					  
			   }
                      
				 for (int u=0;u<k-1;u++)  
               {
            		
                     for (int l=0;l<k-u;l++)  
                     {
                         if (All4[l+1][num]>All4[l][num])
                        {
                            int temp = All4[l+1][num];  
                            All4[l+1][num]=All4[l][num];
                            All4[l][num]= temp;
							String temp2 = All2[l+1];
							All2[l+1]=All2[l];
							All2[l]=temp2;
                        }
                     }
               
			   }
				for(int h=0;h<k;h++)
				{
					System.out.println(All2[h]);
				}
				while(printtofile==1)
				{
					
	       
             outputStream = 
                 new PrintWriter(new FileOutputStream("Index.txt"));
				  for(int s=0;s<k;s++)
				{
					outputStream.println(All2[s]);
				}
				outputStream.close();
				break;
				}
				break;
				
			 }////////////

					
					while(updown==0){
				      for(j=0; j<k;j++)
			          {
			    	
				      System.out.println(All[j][0]+" phone "+All[j][1]+" Birthday "+All[j][2]+" "+All[j][3]+" "+All[j][4]+" "+"class "+All[j][5]+" "+"email"+All[j][6]);				
				
			          
					  }
					 break;
					}
					break;
					}//////////////////////////////////////////Allone1
                   
					
					while(AllorOne.equals("2"))
					{int g=0; int e=0;
					   
					   
					   while(updown==1)
					{
						 
			 
	               System.out.println("Select which data\n2.year\n3.month\n4.day");
                 int num=sc.nextInt();
                  for(int s=0;s<k;s++)
               {
                       All7[s]= All[s][0]+" phone "+All[s][1]+" Birthday "+All[s][2]+" "+All[s][3]+" "+All[s][4]+" "+"class "+All[s][5]+" "+"email"+All[s][6];
	  
					  
			   }
			 
			 
			 for (int f=k-1;f>=0;f=f-1)
             {
                  for (int d=0;d<f;d=d+1)
                {
                      if (All5[d][num]>All5[f][num])
                      {
                      int tmp=All5[d][num];
                       All5[d][num]=All5[f][num];
                      All5[f][num]=tmp;
					  String tmp2=All7[d];
					  All7[d]=All7[f];
					  All7[f]=tmp2;
                      }
                }
             }
					   
					   
					   
					   System.out.println("Select How Many Data");
					   int HowMany=sc.nextInt();
					   int temp=HowMany;
					  while(true)
					  {						  
					   for(;g<temp;g++)
					   {
						   try{
						   System.out.println(All7[g]);
						   
						   e++;}catch (Exception ex){System.out.println("something wrong");}
					   }
					    System.out.println("next\nend");
						String next=sc.next();
						if(next.equals("next")){g=g-e; g=g+temp; temp=temp+HowMany; }
						if(next.equals("end")){break;}
					  }
					  break;
					}/////////updown1
					while(updown==2)
		     {
				

			   
                    System.out.println("Select which data\n2.year\n3.month\n4.day");
                 int num=sc.nextInt();
                  for(int s=0;s<k;s++)
               {
                       All2[s]= All[s][0]+" phone "+All[s][1]+" Birthday "+All[s][2]+" "+All[s][3]+" "+All[s][4]+" "+"class "+All[s][5]+" "+"email"+All[s][6];
	  
					  
			   }
                      
				 for (int u=0;u<k-1;u++)  
               {
            		
                     for (int l=0;l<k-u;l++)  
                     {
                         if (All4[l+1][num]>All4[l][num])
                        {
                            int temp = All4[l+1][num];  
                            All4[l+1][num]=All4[l][num];
                            All4[l][num]= temp;
							String temp2 = All2[l+1];
							All2[l+1]=All2[l];
							All2[l]=temp2;
                        }
                     }
               
			   }
			   
			   System.out.println("Select How Many Data");
					   int HowMany=sc.nextInt();
					   int temp=HowMany;
					  while(true)
					  {						  
					   for(;g<temp;g++)
					   {
						   try{
						   System.out.println(All2[g]);
						   
						   e++;}catch (Exception ex){System.out.println("something wrong");}
					   }
					    System.out.println("next\nend");
						String next=sc.next();
						if(next.equals("next")){g=g-e; g=g+temp; temp=temp+HowMany; }
						if(next.equals("end")){break;}
					  }
					  break;
			   
			   
			 }//////////updown2
			 while(updown==0)
					{ g=0; e=0;
					   System.out.println("Select How Many Data");
					   int HowMany=sc.nextInt();
					   int temp=HowMany;
					  while(true)
					  {						  
					   for(;g<temp;g++)
					   {
						   try{
						   System.out.println(All[g][0]+" phone "+All[g][1]+" Birthday "+All[g][2]+" "+All[g][3]+" "+All[g][4]+" "+"class "+All[g][5]+" "+"email"+All[g][6]);
						   
						   e++;}catch (Exception ex){System.out.println("something wrong");}
					   }
					    System.out.println("next\nend");
						String next=sc.next();
						if(next.equals("next")){g=g-e; g=g+temp; temp=temp+HowMany; }
						if(next.equals("end")){break;}
					  }
					  break;
					}
					
					break;
					}//////////Allone2
					
					
					
                    while(AllorOne.equals("3"))////////Allone3
					{
						   while(updown==1)
					{
						 
			 
	               System.out.println("which data do you want?\n2.year\n3.month\n4.day");
                 int num=sc.nextInt();
						 for (int f=k-1;f>=0;f=f-1)
             {
                  for (int d=0;d<f;d=d+1)
                {
                      if (All5[d][num]>All5[f][num])
                      {
                      int tmp=All5[d][num];
                       All5[d][num]=All5[f][num];
                      All5[f][num]=tmp;
					  
					  
                      }
                }
             }
						
						for(j=0; j<k;j++)
			          {
						  System.out.println(All5[j][num]);
					  }
						
						break;
						}///////updown1
					    while(updown==2)
					{
						 
			 
	               System.out.println("which data do you want?\n2.year\n3.month\n4.day");
                 int num=sc.nextInt();
						 for (int u=0;u<k-1;u++)  
               {
            		
                     for (int l=0;l<k-u;l++)  
                     {
                         if (All4[l+1][num]>All4[l][num])
                        {
                            int temp = All4[l+1][num];  
                            All4[l+1][num]=All4[l][num];
                            All4[l][num]= temp;
							String temp2 = All2[l+1];
							All2[l+1]=All2[l];
							All2[l]=temp2;
                        }
                     }
               
			   }
						
						for(j=0; j<k;j++)
			          {
						  System.out.println(All4[j][num]);
					  }
						
						break;
						}/////updown2
					 
						
						
						
						
						while(updown==0)
						{
						System.out.println("which data do you want?\n0.name\n1.phone\n2.year\n3.month\n4.day\n5.class\n6.email");
						int which=sc.nextInt();
						for(j=0; j<k;j++)
			          {
						  System.out.println(All[j][which]);
					  }
						break;
						}
					   break;
					 }//////////////////////Allone3
					 
					 
					 while(AllorOne.equals("4"))
					 {
						 int g=0; int e=0;
                        while(updown==1)
					{  
				         System.out.println("which data do you want?");
						 System.out.println("2.year\n3.month\n4.day");
                           int num=sc.nextInt();
					       System.out.println("Select How Many Data");
					       int HowMany=sc.nextInt();
					       int tmmp=HowMany;
						    for (int f=k-1;f>=0;f=f-1)
             {
                  for (int d=0;d<f;d=d+1)
                {
                      if (All5[d][num]>All5[f][num])
                      {
                      int tmp=All5[d][num];
                       All5[d][num]=All5[f][num];
                      All5[f][num]=tmp;
					  
                      }
                }
             }
			   
			   while(true)
					  {						  
					   for(;g<tmmp;g++)
					   {
						   try{
						   System.out.println(All5[g][num]);
						   
						   e++;}catch (Exception ex){System.out.println("something wrong");}
					   }
					    System.out.println("next\nend");
						String next=sc.next();
						if(next.equals("next")){g=g-e; g=g+tmmp; tmmp=tmmp+HowMany; }
						if(next.equals("end")){break;}
					  }
						break;
						}
                         while(updown==2)
					{  
				         System.out.println("which data do you want?");
						 System.out.println("2.year\n3.month\n4.day");
                           int num=sc.nextInt();
					       System.out.println("Select How Many Data");
					       int HowMany=sc.nextInt();
					       int tmmp=HowMany;
						    for (int u=0;u<k-1;u++)  
               {
            		
                     for (int l=0;l<k-u;l++)  
                     {
                         if (All4[l+1][num]>All4[l][num])
                        {
                            int temp = All4[l+1][num];  
                            All4[l+1][num]=All4[l][num];
                            All4[l][num]= temp;
							
                        }
                     }
               
			   }
			   while(true)
					  {						  
					   for(;g<tmmp;g++)
					   {
						   try{
						   System.out.println(All4[g][num]);
						   
						   e++;}catch (Exception ex){System.out.println("something wrong");}
					   }
					    System.out.println("next\nend");
						String next=sc.next();
						if(next.equals("next")){g=g-e; g=g+tmmp; tmmp=tmmp+HowMany; }
						if(next.equals("end")){break;}
					  }
						break;
						}


					   while(updown==0)
						{							
						System.out.println("which data do you want?");
						 System.out.println("0.name\n1.phone\n2.year\n3.month\n4.day\n5.class\n6.email");
						int which=sc.nextInt();
					   System.out.println("Select How Many Data");
					   int HowMany=sc.nextInt();
					   int tmmp=HowMany;
					  while(true)
					  {						  
					   for(;g<tmmp;g++)
					   {
						   try{
						   System.out.println(All[g][which]);
						   
						   e++;}catch (Exception ex){System.out.println("something wrong");}
					   }
					    System.out.println("next\nend");
						String next=sc.next();
						if(next.equals("next")){g=g-e; g=g+tmmp; tmmp=tmmp+HowMany; }
						if(next.equals("end")){break;}
					  }
						
						break;}////////updown0
					  break;
						 
					 }
					 
					 
					 
					 
					while(AllorOne.equals("5"))////////////////////////////////////////////////////////////////////////////////////
					{int g=0; int e=0;
					   
					   
					   while(updown==1)
					{
						 
			 
	               System.out.println("Select which data\n2.year\n3.month\n4.day");
                 int num=sc.nextInt();
                  for(int s=0;s<k;s++)
               {
                       All7[s]= All[s][0]+" phone "+All[s][1]+" Birthday "+All[s][2]+" "+All[s][3]+" "+All[s][4]+" "+"class "+All[s][5]+" "+"email"+All[s][6];
	  
					  
			   }
			 
			 
			 for (int f=k-1;f>=0;f=f-1)
             {
                  for (int d=0;d<f;d=d+1)
                {
                      if (All5[d][num]>All5[f][num])
                      {
                      int tmp=All5[d][num];
                       All5[d][num]=All5[f][num];
                      All5[f][num]=tmp;
					  String tmp2=All7[d];
					  All7[d]=All7[f];
					  All7[f]=tmp2;
					  String tmp3=All6[d][5];
					  All6[d][5]=All6[f][5];
					  All6[f][5]=tmp3;
                      }
                }
             }
					   
					   
					   
					   System.out.println("Select How Many Data");
					   int HowMany=sc.nextInt();
					   int temp=HowMany;
					   System.out.println("Select your kind");
					   String kind=sc.next();
					  while(true)
					  {						  
					   for(;g<k;g++)
					   {   
				           try{
						   if(All6[g][5].equals(kind)){
						   System.out.println(All7[g]);
						   
					   e++;}}catch (Exception ex){System.out.println("something wrong");}
                              if(e==temp)break;					   
					   
					   }
					    System.out.println("next\nend");
						String next=sc.next();
						if(next.equals("next")){e=0; }
						if(next.equals("end")){break;}
					  }
					  break;
					}/////////updown1
					while(updown==2)
		     {
				

			   
                    System.out.println("Select which data\n2.year\n3.month\n4.day");
                 int num=sc.nextInt();
                  for(int s=0;s<k;s++)
               {
                       All2[s]= All[s][0]+" phone "+All[s][1]+" Birthday "+All[s][2]+" "+All[s][3]+" "+All[s][4]+" "+"class "+All[s][5]+" "+"email"+All[s][6];
	  
					  
			   }
                      
				 for (int u=0;u<k-1;u++)  
               {
            		
                     for (int l=0;l<k-u;l++)  
                     {
                         if (All4[l+1][num]>All4[l][num])
                        {
                            int temp = All4[l+1][num];  
                            All4[l+1][num]=All4[l][num];
                            All4[l][num]= temp;
							String temp2 = All2[l+1];
							All2[l+1]=All2[l];
							All2[l]=temp2;
							String temp3=All8[l+1][5];
							All8[l+1][5]=All[l][5];
							All8[l][5]=temp3;
                        }
                     }
               
			   }
			   
			   System.out.println("Select How Many Data");
					   int HowMany=sc.nextInt();
					   int temp=HowMany;
					   System.out.println("Select your kind");
					   String kind=sc.next();
					  while(true)
					  {						  
					   for(;g<k;g++)
					   {   try{
						   if(All8[g][5].equals(kind)){
						   System.out.println(All2[g]);
						   
					   e++;}}catch (Exception ex){System.out.println("something wrong");}
					   if(e==temp)break;
					   }
					    System.out.println("next\nend");
						String next=sc.next();
						if(next.equals("next")){e=0; }
						if(next.equals("end")){break;}
					  }
					  break;
			   
			   
			 }//////////updown2
			 while(updown==0)
					{ g=0; e=0;
					   System.out.println("Select How Many Data");
					   int HowMany=sc.nextInt();
					   int temp=HowMany;
					    System.out.println("Select your kind");
					   String kind=sc.next();
					  while(true)
					  {						  
					   for(;g<temp;g++)
					   {   try{
						   if(All[g][5].equals(kind)){
						   System.out.println(All[g][0]+" phone "+All[g][1]+" Birthday "+All[g][2]+" "+All[g][3]+" "+All[g][4]+" "+"class "+All[g][5]+" "+"email"+All[g][6]);
						   
					   e++;}}catch (Exception ex){System.out.println("something wrong");}
					   }
					    System.out.println("next\nend");
						String next=sc.next();
						
					  if(next.equals("next")){g=g-e; g=g+temp; temp=temp+HowMany; }
					  
						if(next.equals("end")){break;}
					  }
					  break;
					}
					
					break;
					}//////////////////////////////////////////////////////////////////Allone77
			
			
			
			
			
                  if(AllorOne.equals("6")){break;}////////////Allone5

					 
			        }
			   
			      while(select.equals("4"))
				  {
					   int p=0;
					   p=0;
					  System.out.println("0.name\n1.phone\n2.year\n3.month\n4.day\n5.class\n6.email\n7.back");
					  int num=sc.nextInt();
					  if(num==7)break;  
					  System.out.println("Select the word");
					  String word = sc.next();
					 for(;p<k;p++)
					 {
						 if(word.equals(All[p][num]))
						 {
							 
							 System.out.println(All[p][0]+" phone "+All[p][1]+" Birthday "+All[p][2]+" "+All[p][3]+" "+All[p][4]+" "+"class "+All[p][5]+" "+"email"+All[p][6]);
						 
							 System.out.println("1.next\n2.modify\n3.delete");
							 String next=sc.next();
							 if(next.equals("1"))
							 break;
						 
						     if(next.equals("2"))
							 {   
						          
								  outputStream = 
                                  new PrintWriter(new FileOutputStream("Index.txt"));
								 
								 String modifyword=sc.next();
								 All[p][num]=modifyword;
								 for(p=0;p<k;p++)
								 {
									outputStream.println(All[p][0]+" "+All[p][1]+" "+All[p][2]+" "+All[p][3]+" "+All[p][4]+" "+All[p][5]+" "+All[p][6]); 
								 }
								 outputStream.close( );
								 break;
							 }
							 
							 
							 if(next.equals("3"))
							 {
								  
								  outputStream = 
                                  new PrintWriter(new FileOutputStream("Index.txt"));
								  
								  for(;p<k-1;p++){
								  for(int q=0;q<7;q++)
								  {
									  All[p][q]=All[p+1][q];
								  }
								  }
								  for(int g=0;g<k-1;g++)
								 {
									outputStream.println(All[g][0]+" "+All[g][1]+" "+All[g][2]+" "+All[g][3]+" "+All[g][4]+" "+All[g][5]+" "+All[g][6]); 
								 }
								 outputStream.close( );
								 break;
							 }
							 
						 }
						 
					 }
	
					
				  }
			 
			 while(select.equals("5"))
			 {
				 if(eoc==0){
				 System.out.println("1.upsort_downsort\n2.printtofile\n3.select language");}
				 if(eoc==1){
			     System.out.println("1.升序或降序\n2.是否排序後儲存\n3.選擇語言");}
				 int choice=sc.nextInt();
				 while(choice==1)
				 {
					 System.out.println("0.normal\n1.up\n2.down\n");
				     updown=sc.nextInt();
					 break;
				 
				 }
				 while(choice==2)
				 {
					 System.out.println("1.yes\n0.no");
					 printtofile=sc.nextInt();
					 break;
				 }
				 while(choice==3)
				 {
					 System.out.println("0.English\n1.Chinese");
					 eoc=sc.nextInt();
					 break;
				 }
			 break;
			 }
			 
			 
			 while(select.equals("6"))
			 {
				 System.out.println("your place");
				 String road=sc.next();
				 
				 
	       
             outputStream = 
                 new PrintWriter(new FileOutputStream(road));
				 if(updown==0){
				 for(int c=0;c<k;c++)
				 {
					 outputStream.println(All[c][0]+" "+All[c][1]+" "+All[c][2]+" "+All[c][3]+" "+All[c][4]+" "+All[c][5]+" "+All[c][6]);
				 }
				 outputStream.close();}
				 if(updown==1){ for(int s=0;s<k;s++)
				{
					outputStream.println(All7[s]);
				}
				outputStream.close();}
				if(updown==2){for(int s=0;s<k;s++)
				{
					outputStream.println(All2[s]);
				}
				outputStream.close();}
				 break;
			 }
			 
			 
			 
			 
			 while(select.equals("7"))
			 {
				 System.out.println("thanks for you");
				 System.exit(0);
			 }
			 
			 
			
			 
			
			 
			 }//////cis
			
			 
  
  
  
      }
   	
			
			
		
}