package test5;


public class Lab15 {
    
        public static void main(String[] args) {
            int n=300,i,num;
            int mas[] = new int [n+1];
                for (i=1;i<=mas.length-1;i++)
                   mas[i]=i;
                for (num=1;num<=mas.length-1;num++){
                    for(i=2;i<=n-1;i++){
                        if ((mas[num]!=i) & (mas[num]%i==0))
                        mas[num]=0;
                    }
                }    
                for (num=1;num<=mas.length-1;num++)
                    if (mas[num]!=0)
                        System.out.println("¹i= "+num+" i= "+mas[num]);
               
        }
}