class patterns {
    public void printPattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void printPattern2(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void printPattern3(int n){
        for(int i=1; i<=5;i++){
            for(int j =1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public void printPattern4(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public void printPattern5(int n){
        for(int i = 1; i<=n; i++){
            for(int j = n; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void printPattern6(int n){
        for(int i = n; i>0; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
    public void printPattern7(int n){
    for(int i = 0; i<n; i++){
        //space
        for(int j = 0; j<n-i-1; j++){
            System.out.print(" ");
        }
        //stars
        for(int j = 0; j<2*i+1; j++){
            System.out.print("*");
        }
        //space
        for(int k = 0; k<n-i-1; k++){
            System.out.print(" ");
        }
        System.out.println();
    }
}

    public void printPattern8(int n){
    for(int i = n; i>0; i--){
        //space
        for(int j = 0; j<n-i; j++){
            System.out.print(" ");
        }
        //star
        for(int j = 0; j<2*i-1; j++){
            System.out.print("*");
        }
        //space
        for(int j = 0; j<n-i; j++){
            System.out.print(" ");
        }
        System.out.println();
    }
}

    public void printPattern9(int n){
    printPattern7(n);
    printPattern8(n);
}

    public void printPattern10(int n){
    for(int i = 1; i<=2*n-1; i++){
        int stars = i;
        if(i>n) stars = 2*n-i;
       
        for(int j = 1; j<=stars; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

public void printPattern11(int n){
for(int i = 0; i<n; i++){
    int start = 1;
    if (i % 2 == 0) start = 1;
    else start = 0;
    for(int j = 0; j<=i; j++){
        System.out.print(start);
        start = 1 - start;
    }
    System.out.println();
}
}

public void printPattern12(int n){ 
    int space = 2*(n-1);  
for(int i = 1; i<=n; i++){
    //numbers
    for(int j = 1; j<=i;j++){
        System.out.print(j);
    }
    //spaces
    for(int k = 0; k<space; k++){
        System.out.print(" ");
    }
    //numbers
    for(int j = i; j>=1; j-- ){
        System.out.print(j);
    }

    System.out.println();
    space -=2;
}
}

public void printPattern13(int n){
    int start = 1;
    for(int i = 1; i<=n; i++){
        for(int j = 1; j<=i; j++){
            System.out.print(start+" ");
            start++;
        }
        System.out.println();
    }
}

public void printPattern14(int n){
    for(int i = 0; i < n; i++){
        for(char ch = 'A'; ch<='A'+ i; ch++){
            System.out.print(ch+" ");
        }
        System.out.println();
    }
}

public void printPattern15(int n){
    for(int i = 1; i<=n; i++){
        for(char ch = 'A'; ch<='A'+(n-i); ch++){
            System.out.print(ch+" ");
        }
        System.out.println();
    }
}

public void printPattern16(int n){
    for(int i = 0; i<n; i++){
        char ch = 'A';
        ch+=i;
        for(int j = 0; j<=i; j++){
            System.out.print(ch+" ");
        }
        System.out.println();
    }
}

public void printPattern17(int n){
    for(int i = 0; i<n; i++){
        //spaces
        for(int j = 0; j<n-i-1; j++){
            System.out.print(" ");
        }
        //charecters
        char ch = 'A';
        int breakpoint = (2*i-1)/2;
        for(int j = 0; j<2*i+1;j++){
            System.out.print(ch);
            if (j<= breakpoint) ch++;
            else ch--;
        }
        //spaces
        for(int j = 1; j<=n-i-1; j++){
            System.out.print(" ");
        }

        System.out.println();
}
}

public void printPattern18(int n){
    for(int i = 0; i<n; i++){
        for(char ch = (char) ('E'- i);ch<='E'; ch++){
            System.out.print(ch+" ");
        }
        System.out.println();
    }
}

public void printPattern19(int n){

//First Half
    int initialSpace = 0;
    for(int i = 0; i < n; i++){
        //stars
        for(int j = 0; j<n-i; j++){
            System.out.print("*");
        }
        //spaces
        for(int j =0  ; j<initialSpace; j++){
            System.out.print(" ");
        }
        //stars
        for(int j = 0; j<n-i; j++){
            System.out.print("*");
        }
        initialSpace+=2;
        System.out.println();
    }

    //Second Half
    initialSpace = 2*n-2;
    for(int i = 0; i<n; i++){
        //stars
        for(int j = 0; j<=i; j++){
            System.out.print("*");
        }
        //spaces
        for(int j = initialSpace; j>0; j--){
            System.out.print(" ");
        }
        //stars
        for(int j = 0; j<=i; j++){
            System.out.print("*");
        }
        initialSpace-=2;
        System.out.println();
    }
}

public void printPattern20(int n) {
    int space = 2*n - 2;  // move here

    for(int i = 1; i <= 2*n - 1; i++) {

        int stars = i;
        if(i > n) stars = 2*n - i;

        // stars
        for(int j = 1; j <= stars; j++){
            System.out.print("*");
        }
        // spaces
        for(int j = 0; j < space; j++){
            System.out.print(" ");
        }
        // stars
        for(int j = 1; j <= stars; j++){
            System.out.print("*");
        }

        System.out.println();

        // update spacing
        if(i < n) space -= 2;
        else space += 2;
    }
}

public void printPattern21(int n){
    for(int i = 0; i<n; i++){
        for(int j = 0; j<n; j++){
            if(i==0 || i==n-1 || j==0 || j==n-1){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}

public void printPattern22(int n){
    for(int i = 0; i<2*n-1;i++){
        for(int j = 0; j<2*n-1;j++){
            int top = i;
            int left = j;
            int right = 2*n-2 - j;
            int down = 2*n-2 - i;
            System.out.print(n- Math.min(Math.min(top,down),Math.min(left,right)));
        }
        System.out.println();
    }
}
public static void main(String[] args) {
        patterns p = new patterns();
        p.printPattern22(5);
    }
}
