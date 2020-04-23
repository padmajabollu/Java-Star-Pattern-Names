class Alphabets
{
    public static void main(String args[])
    {
        String name=args[0].toUpperCase();
        int n=Integer.parseInt(args[1]);
        //System.out.println(name+" "+n);
        for(int z=0;z<name.length();z++)
        {
            //System.out.println(name.charAt(z));
            if((name.charAt(z))=='A')
            {
                int c=0;
                System.out.println();
                for(int i=1;i<=n;i++)
                {
                c++;
                for(int j=n;j>i;j--)
                {
                System.out.print(" ");
                }
                System.out.print("*");
                if(c==(n+1)/2)
                {
                for(int x=1;x<(n+1)/2;x++)
                {
                System.out.print(" *");
                }
                System.out.println();

                continue;
                }
                for(int a=1;a<(i-1)*2;a++)
                {
                System.out.print(" ");
                }
                if(i==1)
                {
                System.out.println();
                }
                else
                {
                System.out.println("*");
                }

                }
                System.out.println();


            }
            else if((name.charAt(z))=='B')
            {
                System.out.println();
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=n;j++)
                    {
                        if(i==1)
                        {
                            System.out.print("* ");
                        }
                        else if(i==((n+1)/2))
                        {
                            System.out.print("* ");
                        }
                        else if(j==1)
                        {
                            System.out.print("* ");
                        }
                        else if(j==n)
                        {
                            System.out.print("* ");

                        }
                        else if(i==n)
                        {
                            System.out.print("* ");
                        }
                        else
                        {
                            System.out.print("  ");
                        }
                    }

                    System.out.println();
                }
                System.out.println();
            }
            
            else if((name.charAt(z))=='C')
            {
                System.out.println();
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=n;j++)
                    {
                        if(i==1)
                        {
                            System.out.print("* ");
                        }
                        else if(j==1)
                        {
                            System.out.print("* ");
                        }
                        else if(i==n)
                        {
                            System.out.print("* ");
                        }
                        else
                        {
                            System.out.print("  ");
                        }

                    }
                    System.out.println();

                }
                System.out.println();

            }
            else if((name.charAt(z))=='D')
            {
                System.out.println();
                for(int i=0;i<n;i++)
                {
                System.out.print("* ");
                }
                System.out.println();
                for(int b=0;b<(n-2);b++)
                {
                for(int a=0;a<n;a++)
                {
                if(a==0)
                {
                System.out.print("* ");
                }
                else if(a==(n-1))
                {
                System.out.print("* ");
                }
                else
                {
                System.out.print("  ");
                }
                }
                System.out.println();

                }
                for(int j=0;j<n;j++)
                {
                System.out.print("* ");
                }
                System.out.println();

            }
            else if((name.charAt(z))=='E')
            {
                System.out.println();
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=n;j++)
                    {
                        if(i==1)
                        {
                            System.out.print("* ");
                        }
                        else if(j==1)
                        {
                            System.out.print("* ");
                        }
                        else if(i==n)
                        {
                            System.out.print("* ");
                        }
                        else if(i==(n+1)/2)
                        {
                            System.out.print("* ");
                        }
                        else
                        {
                            System.out.print("  ");
                        }

                    }
                    System.out.println();

                }
                System.out.println();

            }
            else if((name.charAt(z))=='F')
            {
                System.out.println();
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=n;j++)
                    {
                        if(i==1)
                        {
                            System.out.print("* ");
                        }
                        else if(j==1)
                        {
                            System.out.print("* ");
                        }
                        
                        else if(i==(n+1)/2)
                        {
                            System.out.print("* ");
                        }
                        else
                        {
                            System.out.print("  ");
                        }

                    }
                    System.out.println();

                }
                System.out.println();

            }
            else if((name.charAt(z))=='G')
            {
                System.out.println();
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=n;j++)
                    {
                        if(i==1)
                        {
                            System.out.print("* ");
                        }
                        else if(j==1)
                        {
                            System.out.print("* ");
                        }
                        else if(i==n)
                        {
                            System.out.print("* ");
                        }
                        else if(i>=(n+2)/2 && j==n)
                        {
                            System.out.print("* ");
                        }
                        else
                        {
                            System.out.print("  ");
                        }

                    }
                    System.out.println();

                }
                
                for(int i=1;i<(n+1)/2;i++)
                {
                    for(int j=1;j<=n;j++)
                    {
                        if(j==n)
                        {
                            System.out.print("* ");
                        }
                        else 
                        {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                System.out.println();

            }
            else if((name.charAt(z))=='H')
            {
                System.out.println();
                for(int a=1;a<=(n/2);a++)
                {
                System.out.print("* ");
                for(int i=1;i<n-1;i++)
                {
                System.out.print("  ");

                }

                System.out.println("*");

                }
                for(int b=1;b<=n;b++)
                {
                System.out.print("* ");

                }

                System.out.println();

                for(int a=1;a<=(n/2);a++)
                {
                System.out.print("* ");
                for(int i=1;i<n-1;i++)
                {
                System.out.print("  ");

                }

                System.out.println("*");

                }
                System.out.println();

            }
            else if((name.charAt(z))=='I')
            {
                System.out.println();

                for(int a=1;a<=n;a++)
                { 
                System.out.print("* ");
                }

                System.out.println();
                for(int m=1;m<n-1;m++)
                {
                for(int l=1;l<n-1;l++)
                {

                if(l==((n+1)/2))
                {
                System.out.println("* ");
                }
                else 
                {System.out.print("  ");
                }
                }
                }
                for(int j=1;j<=n;j++)
                {
                System.out.print("* ");
                }
                System.out.println();

            }
            else if((name.charAt(z))=='J')
            {
                System.out.println();
                for(int i=1;i<n;i++)
                {
                    for(int j=1;j<=n;j++)
                    {
                        if(i==1)
                        {
                            System.out.print("* ");
                
                        }
                        else if(j==(n/2)+1)
                        {
                            System.out.print("* ");
                
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                for(int i=1;i<=n;i++)
                {
                    if(i==(n/2))
                    {
                        System.out.print("* ");
                    }
                    else if(i==(n/2)+1)
                    {
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                    
                }
                System.out.println();
                

            }
            else if((name.charAt(z))=='K')
            {
                System.out.println();

                for(int i=n;i>=1;i--)
                {
                    for(int j=1;j<=n;j++)
                    {
                        if(i==1 && j==1)
                        {
                            System.out.print("*   *");
                        }
                        else if(j==1)
                        {
                            System.out.print("* ");
                        }
                        else if(i==j)
                        {
                            System.out.print("* ");

                        }
                        else
                        {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                for(int i=((n+1)/2)+1;i<=n;i++)
                {
                    for(int j=1;j<=n;j++)
                    {
                        if(j==1)
                        {
                            System.out.print("* ");
                        }
                        else if(i==j)
                        {
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }

                    }
                    System.out.println();
                }
                System.out.println();

            }
            else if((name.charAt(z))=='L')
            {
                System.out.println();

                for(int i=1;i<n;i++)
                {
                System.out.println("* ");
                }
                for(int j=1;j<=n;j++)
                {
                System.out.print("* ");
                }
                System.out.println();

            }
            else if((name.charAt(z))=='M')
            {
                System.out.println();
                int c=1;
                int c1=n;
                for(int i=1;i<=n;i++)
                {
                    //c1+=1;
                    for(int j=1;j<=n;j++)
                    {
                        if(j==1)
                        {
                            System.out.print("* ");
                        }
                        else if(j==n)
                        {
                            System.out.print("* ");
                        }
                        else if(i==(n+1)/2 && i==j)
                        {
                            System.out.print("* ");
                        }
                        else if(i<(n+1)/2 && j<(n+1)/2 && j==c)
                        {
                            System.out.print("* ");
                            
                        }
                        else if(i<(n+1)/2 && j>(n+1)/2 && j==c1)
                        {
                            System.out.print("* ");
                        // c1=0;
                        }
                        else
                        {
                            System.out.print("  ");
                        }
                        
                    }
                    System.out.println();
                    c1=c1-1;
                    c=i+1;     

                }
                System.out.println();

            }
            else if((name.charAt(z))=='N')
            {
                System.out.println();
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=n;j++)
                    {
                        if(i==j)
                        {
                            System.out.print("* ");
                        }
                        else if(j==1)
                        {
                            System.out.print("* ");
                        }
                        else if(j==n)
                        {
                            System.out.print("* ");
                        
                        }
                        else{
                            System.out.print("  ");
                        }
                    }

                    System.out.println();
                }
                System.out.println();


            }
            else if((name.charAt(z))=='O')
            {
                System.out.println();
                for(int i=0;i<n;i++)
                {
                System.out.print("* ");
                }
                System.out.println();
                for(int b=0;b<(n-2);b++)
                {
                for(int a=0;a<n;a++)
                {
                if(a==0)
                {
                System.out.print("* ");
                }
                else if(a==(n-1))
                {
                System.out.print("* ");
                }
                else
                {
                System.out.print("  ");
                }
                }
                System.out.println();

                }
                for(int j=0;j<n;j++)
                {
                System.out.print("* ");
                }
                System.out.println();

            }
            else if((name.charAt(z))=='P')
            {
                System.out.println();
                for(int i=0;i<n;i++)
                {
                System.out.print("* ");
                }
                System.out.println();
                for(int b=0;b<(n-4);b++)
                {
                for(int a=0;a<n;a++)
                {
                if(a==0)
                {
                System.out.print("* ");
                }
                else if(a==(n-1))
                {
                System.out.print("* ");
                }
                else
                {
                System.out.print("  ");
                }
                }
                System.out.println();

                }
                for(int j=0;j<n;j++)
                {
                System.out.print("* ");
                }
                System.out.println();
                for(int a=0;a<n-3;a++)
                {
                System.out.println("* ");
                }
                System.out.println();

            }
            else if((name.charAt(z))=='Q')
            {
                System.out.println();
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=n;j++)
                    {
                        if(i==1)
                        {
                            System.out.print("* ");
                        }
                        else if(i==n)
                        {
                            System.out.print("* ");
                        }
                        else if(j==1)
                        {
                            System.out.print("* ");

                        }
                        else if(j==n)
                        {
                            System.out.print("* ");
                        }
                        else if(i==(n-1) && i==j)
                        {
                            System.out.print("* ");
                        }
                        else if(i==(n-2) && i==j)
                        {
                            System.out.print("* ");
                        }
                        else
                        {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();

                }
                for(int i=1;i<=n+1;i++)
                {
                    
                    if (i==(n+1))
                    {
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();

            }
            else if((name.charAt(z))=='R')
            {
                System.out.println();
                System.out.println();
                for(int i=0;i<n;i++)
                {
                System.out.print("* ");
                }
                System.out.println();
                for(int b=0;b<(n-4);b++)
                {
                for(int a=0;a<n;a++)
                {
                if(a==0)
                {
                System.out.print("* ");
                }
                else if(a==(n-1))
                {
                System.out.print("* ");
                }
                else
                {
                System.out.print("  ");
                }
                }
                System.out.println();

                }
                for(int j=0;j<n;j++)
                {
                System.out.print("* ");
                }
                System.out.println();
                for(int a=0;a<n-2;a++)
                {
                System.out.print("* ");
                for(int b=0;b<n;b++)
                {
                if(b==a)
                {
                System.out.print("* ");
                }
                else
                {
                System.out.print("  ");

                }
                }
                System.out.println();

                }
                System.out.println();

            }
            else if((name.charAt(z))=='S')
            {
                System.out.println();

                for(int i=1;i<=n;i++)
                {
                System.out.print("* ");

                }
                System.out.println();
                for(int a=1;a<(n/2);a++)
                {
                System.out.println("*");
                }
                for(int j=1;j<=n;j++)
                {
                System.out.print("* ");

                }
                System.out.println();
                for(int x=1;x<(n/2);x++)
                {
                for(int b=1;b<n;b++)
                {

                System.out.print("  ");

                }
                System.out.println("* ");

                }
                for(int w=1;w<=n;w++)
                {
                System.out.print("* ");
                }
                System.out.println();

            }
            else if((name.charAt(z))=='T')
            {
                System.out.println();
                System.out.println();
                for(int a=0;a<n;a++)
                {
                System.out.print("* ");
                }
                System.out.println();

                for(int i=1;i<n;i++)
                {
                for(int j=0;j<n;j++)
                {
                if(j==(n/2))
                {
                System.out.print("* ");
                }
                else
                {
                System.out.print("  ");
                }
                }
                System.out.println();

                }
                System.out.println();

            }
            else if((name.charAt(z))=='U')
            {
                System.out.println();
                for(int j=1;j<n;j++)
                {
                System.out.print("* ");

                for(int a=1;a<=(n-2);a++)
                {
                System.out.print("  ");
                }
                System.out.println("* ");

                }
                for(int k=1;k<=n;k++)
                {
                System.out.print("* ");

                }
                System.out.println();
                
            }
            else if((name.charAt(z))=='V')
            {
                System.out.println();
                int no=(n*2)-1;
                for(int i=1;i<=n;i++)
                {

                for(int j=1;j<=n*2;j++)
                {
                if(i==j)
                {
                System.out.print("*");
                }
                else if(j==no)
                {
                System.out.print("*");
                }
                else
                {
                System.out.print(" ");
                }
                }
                no=no-1;

                System.out.println();
                }
                System.out.println();

            }
            else if((name.charAt(z))=='W')
            {
                System.out.println();
                int c=((n+1)/2)-1;
                int c1=((n+1)/2)+1;
                for(int i=1;i<=n;i++)
                {
                    //c1+=1;
                    for(int j=1;j<=n;j++)
                    {
                        if(j==1)
                        {
                            System.out.print("* ");
                        }
                        else if(j==n)
                        {
                            System.out.print("* ");
                        }
                        else if(i==(n+1)/2 && i==j)
                        {
                            System.out.print("* ");
                        }
                        else if(i>(n+1)/2 && j<(n+1)/2 && j==c)
                        {
                            System.out.print("* ");
                            c-=1;
                        }
                        else if(i>(n+1)/2 && j>(n+1)/2 && j==c1)
                        {
                            System.out.print("* ");
                            c1=0;
                        }
                        else
                        {
                            System.out.print("  ");
                        }
                        
                    }
                    System.out.println();
                    c1=i+1;       

                }
                System.out.println();

            }
            else if((name.charAt(z))=='X')
            {
                System.out.println();
                for(int i=1;i<=(n+1)/2;i++)
                {
                    for(int j=1;j<=(((n+1)/2)*2);j++)
                    {
                        if(i==j)
                        {
                            System.out.print("* ");
                        }
                        else if(j==(((n+1)/2)*2)-i)
                        {
                            System.out.print("* ");

                        }
                        else
                        {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
            for(int i=(n+3)/2;i<=n;i++)
                {
                    for(int j=1;j<=(((n+1)/2)*2);j++)
                    {
                        if(i==j)
                        {
                            System.out.print("* ");
                        }
                        else if(j==(((n+1)/2)*2)-i)
                        {
                            System.out.print("* ");

                        }
                        else
                        {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                System.out.println();

            }
            else if((name.charAt(z))=='Y')
            {
                System.out.println();
                int no=(n*2)-1;
                for(int i=1;i<=((n+1)/2);i++)
                {

                for(int j=1;j<=n*2;j++)
                {
                if(i==j)
                {
                System.out.print("*");
                }
                else if(j==no)
                {
                System.out.print("*");
                }
                else
                {
                System.out.print(" ");
                }
                }
                no=no-1;

                System.out.println();
                }
                for(int i=1;i<=n-1;i++)
                {
                    for(int j=1;j<=n;j++)
                    {
                        if(j==(n+2)/2)
                        {
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }

                    }
                    System.out.println();
                }
                System.out.println();

            }
            else if((name.charAt(z))=='Z')
            {
                System.out.println();
                for(int i=n;i>=1;i--)
                {
                    for(int j=1;j<=n;j++)
                    {
                        if(i==j)
                        {
                            System.out.print("* ");
                        }
                        else if(i==1)
                        {
                            System.out.print("* ");
                        }
                        else if(i==n)
                        {
                            System.out.print("* ");
                        
                        }
                        else{
                            System.out.print("  ");
                        }
                    }

                    System.out.println();
                }
                System.out.println();

            }

        }
        
    }
}