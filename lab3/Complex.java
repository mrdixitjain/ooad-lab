class Complex{
    float realPart;
    float imaginaryPart;
    public Complex(){
    	this(0f, 0f);
    
    }
    
    public Complex(float realPart,float imaginaryPart){
        this.realPart=realPart;
        this.imaginaryPart=imaginaryPart;
    }
    
    void setRealPart(float realPart){
        this.realPart=realPart;
    }
    
    float getRealPart(){
        return this.realPart;
    }
    
    void setimaginaryPart(float imaginaryPart){
        this.imaginaryPart=imaginaryPart;
    }
    
    float getimaginaryPart(){
        return this.imaginaryPart;
    }
        
    public void addComplex(Complex A, Complex B){
        float a=A.getRealPart();
        float b=B.getRealPart();
        float c=A.getimaginaryPart();
        float d=B.getimaginaryPart();
        A.setimaginaryPart(c+d);
        A.setRealPart(a+b);
    }
    
    public void subComplex(Complex A, Complex B){
        float a=A.getRealPart();
        float b=B.getRealPart();
        float c=A.getimaginaryPart();
        float d=B.getimaginaryPart();
        A.setimaginaryPart(c-d);
        A.setRealPart(a-b);
    }
    
    void PrintComplex(){
        System.out.println("("+this.realPart+","+this.imaginaryPart+")");
    }


    public static void main(String arg[]){
        Complex A=new Complex(3.5f,8.9f);
        A.PrintComplex();
        Complex B=new Complex(12.2f,25.5f);
        B.PrintComplex();
        A.addComplex(A,B);
        A.PrintComplex();
        A.subComplex(A, B);
        A.PrintComplex();
    }
    
}
