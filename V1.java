public class V1 {
    public void v1(int n,int n2,int n3){
      int c = 0;
      c = n+n2+n3;
        if(c==180){
          if(n>n2&&n>n3){
            if(n>180)
            System.out.println("the triangle is obtuse");
            else if(n<90)
            System.out.println("the triangle is acute angled");
            else if(n==90) 
            System.out.println("the triangle is right angled");
          }
          if(n2>n&&n2>n3){
            if(n2>180)
            System.out.println("the triangle is obtuse");
            else if(n2<90)
            System.out.println("the triangle is acute angled");
            else if(n2==90) 
            System.out.println("the triangle is right angled");
          }
          if(n3>n2&&n3>n){
            if(n3>180)
            System.out.println("the triangle is obtuse");
            else if(n3<90)
            System.out.println("the triangle is acute angled");
            else if(n3==90) 
            System.out.println("the triangle is right angled");
          }

        }
        else
         System.out.println("triangle is not possible");
        
        
    }
}
